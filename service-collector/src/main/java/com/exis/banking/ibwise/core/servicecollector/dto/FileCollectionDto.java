package com.exis.banking.ibwise.core.servicecollector.dto;

import java.util.Date;
import java.util.UUID;

public class FileCollectionDto {
	private String name;
	private String hashid;
	private String fullpath;
	private Date creationDate;
	private String content;
	private boolean archived;
	public FileCollectionDto() {
		
	}
	public FileCollectionDto(String name,String fullpath) {
		this.name=name;
		this.fullpath=fullpath;
		this.hashid=UUID.randomUUID().toString();
		this.creationDate=new Date();
	}
	public FileCollectionDto(String name,String fullpath,Date date) {
		this.name=name;
		this.fullpath=fullpath;
		this.hashid=UUID.randomUUID().toString();
		this.creationDate=date;
	}
	public FileCollectionDto(String name,String fullpath,String uuid,Date date) {
		this.name=name;
		this.fullpath=fullpath;
		this.hashid=uuid;
		this.creationDate=date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullpath() {
		return fullpath;
	}
	public void setFullpath(String fullpath) {
		this.fullpath = fullpath;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHashid() {
		return hashid;
	}
	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	 
	 
	
	
}
