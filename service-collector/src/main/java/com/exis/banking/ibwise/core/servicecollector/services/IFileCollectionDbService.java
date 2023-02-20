package com.exis.banking.ibwise.core.servicecollector.services;

import java.util.List;

import com.exis.banking.ibwise.core.servicecollector.model.FileCollection;

public interface IFileCollectionDbService {

	public FileCollection findFileCollectionByHashid(String hashid);
	public List<FileCollection> getAllFileCollection();
	public void saveFileCollection(FileCollection f);
	
}
