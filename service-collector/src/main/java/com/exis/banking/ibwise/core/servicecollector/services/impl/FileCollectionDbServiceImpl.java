package com.exis.banking.ibwise.core.servicecollector.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exis.banking.ibwise.core.servicecollector.dao.IFileCollectionDao;
import com.exis.banking.ibwise.core.servicecollector.model.FileCollection;
import com.exis.banking.ibwise.core.servicecollector.services.IFileCollectionDbService;


@Service
public class FileCollectionDbServiceImpl implements IFileCollectionDbService{

	@Autowired
	IFileCollectionDao _daoFileCollection;
	
	 
	public FileCollection findFileCollectionByHashid(String hashid) {
		// TODO Auto-generated method stub
		return _daoFileCollection.findFileCollectionByHashid(hashid);
	}

	 
	public List<FileCollection> getAllFileCollection() {
		// TODO Auto-generated method stub
		return _daoFileCollection.findAll();
	}

	 
	public void saveFileCollection(FileCollection file) {
		// TODO Auto-generated method stub
		_daoFileCollection.save(file);
	}

}
