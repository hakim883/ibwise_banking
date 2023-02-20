package com.exis.banking.ibwise.core.servicecollector.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.exis.banking.ibwise.core.servicecollector.model.BatchCollection;
import com.exis.banking.ibwise.core.servicecollector.model.FileCollection;
import com.exis.banking.ibwise.core.servicecollector.services.IBatchCollectionDbService;

public class FileCollectionMapper {
	@Autowired
	private static IBatchCollectionDbService svc;
	
	public FileCollectionMapper() {
		
	}
	
	public static FileCollectionDto dtoMapper(FileCollection dao) {
		FileCollectionDto dto=null;
		
		dto=new FileCollectionDto(dao.getFilename(),dao.getFullpath(),dao.getHashid(),dao.getCreationDate());
		dto.setContent(dao.getContent());
		dto.setArchived(dao.isArchived());
		return dto;
	}
	public static FileCollection daoMapper(FileCollectionDto dto,String batch_hash) {
		FileCollection dao=null;
		BatchCollection batch=null;
		if (svc!=null) {
			batch=svc.findBatchCollectionByHashid(batch_hash);
			dao=new FileCollection(dto.getName(),dto.getFullpath(),dto.getContent(),dto.getHashid(),dto.isArchived(),dto.getCreationDate(),batch);
		}
		
		return dao;
	}
}
