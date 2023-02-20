package com.exis.banking.ibwise.core.common.collector;

import java.util.Date;
import java.util.UUID;

public class FileInfo {

	private String name;
	private String hashid;
	private String fullpath;
	private Date creationDate;
	private String content;
	public FileInfo() {
		
	}
	public FileInfo(String name,String fullpath) {
		this.name=name;
		this.fullpath=fullpath;
		this.hashid=UUID.randomUUID().toString();
		this.creationDate=new Date();
	}
	public FileInfo(String name,String fullpath,Date date) {
		this.name=name;
		this.fullpath=fullpath;
		this.hashid=UUID.randomUUID().toString();
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
	
	
}
