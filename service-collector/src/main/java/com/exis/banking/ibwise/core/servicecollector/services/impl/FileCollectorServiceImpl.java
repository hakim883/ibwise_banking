package com.exis.banking.ibwise.core.servicecollector.services.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exis.banking.ibwise.core.servicecollector.dto.FileCollectionDto;
import com.exis.banking.ibwise.core.servicecollector.model.BatchCollection;
import com.exis.banking.ibwise.core.servicecollector.model.FileCollection;
import com.exis.banking.ibwise.core.servicecollector.services.IBatchCollectionDbService;
import com.exis.banking.ibwise.core.servicecollector.services.IFileCollectionDbService;
import com.exis.banking.ibwise.core.servicecollector.services.IFileCollectorService;


@Service
public class FileCollectorServiceImpl implements IFileCollectorService{

	private boolean running;
	
	@Autowired
	private IBatchCollectionDbService _batchColSvc;
	
	@Autowired
	private IFileCollectionDbService _fileColSvc;
	
	
	private String getRootPath() {
		return "C:\\Temp\\swift\\in";
	}
	
	private File[] walk (String rootpath) {
		File root = new File( rootpath );
		File[] list = root.listFiles();
		return list;
	}
	
	private Date getFileCreationDate(File file) throws IOException {
		BasicFileAttributes attrs=null;
		attrs = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
	    FileTime time = attrs.creationTime();
	    Date date=new Date(time.toMillis());
	    
	    return date;
	}
	
	private FileCollectionDto loadFile(File file) throws IOException {
		FileCollectionDto info=null;
		Date fileDate=this.getFileCreationDate(file);
		info=new FileCollectionDto(file.getName(),file.getAbsolutePath(),fileDate);
		String content = FileUtils.readFileToString(file, "UTF-8");
		if (content!=null)
			info.setContent(content);
		return info;
	}
	private void createDirectory(String path) {
		
		File folder = new File(path);

		if (!folder.exists()) {
			folder.mkdir();
		}
	}
	private void moveFile(File srcFile, File destFile) throws IOException {
		
        FileUtils.moveFile(srcFile, destFile);
    }
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		this.running=true;
		String rootpath=this.getRootPath();
		File [] list=this.walk(rootpath);
		FileCollectionDto finfo=null;
		String batch_hash=UUID.randomUUID().toString();
		String file_hash=null;
		String dest=null;
		Date today=new Date();
		String rootdir=null;
		FileCollection col=null;
		BatchCollection batch=null;
		
		rootdir="C:\\Temp\\swift\\archive\\"+(today.getYear()+1900)+"\\"+today.getMonth()+"\\"+batch_hash;
		if (list!=null && list.length > 0) {
			batch=_batchColSvc.save(new BatchCollection(batch_hash,"SW-GEN-01"));
			this.createDirectory(rootdir);
		}
		
		for (int cpt = 0; (cpt < list.length)&&running; cpt++) {
			File f=list[cpt];
			if (f!=null && f.isFile() ) {
				System.out.println("---> ["+f.getAbsolutePath()+"]");
				
				try {
					//finfo=this.loadFile(f);
					String content = FileUtils.readFileToString(f, "UTF-8");
					// move file to archive
					file_hash=UUID.randomUUID().toString();
					dest=rootdir+"\\"+f.getName();
					System.out.println("creating directory if not exist = ["+rootdir+"]");
					
					System.out.println("Moving file from ["+f.getAbsolutePath()+"] into ["+dest+"]");
					this.moveFile(f, new File(dest));
					
					// load file into database
					col=new FileCollection(f.getName(),f.getAbsolutePath(),content,file_hash,true,today,batch);
					_fileColSvc.saveFileCollection(col);
					
					// publish to analyzer
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		this.running=false;
		 		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		running=false;
	}

	@Override
	public boolean status() {
		// TODO Auto-generated method stub
		return running;
	}

}
