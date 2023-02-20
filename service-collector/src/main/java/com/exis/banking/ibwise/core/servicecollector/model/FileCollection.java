package com.exis.banking.ibwise.core.servicecollector.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stg_file_collection", indexes = {
		@Index(name = "hashid_idx",  columnList="hashid", unique = true)
})
public class FileCollection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	private String	filename;
	private String	hashid;
	private String	fullpath;
	private Date 	creationDate;
	
	@OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "batch_id")
	private BatchCollection batch;
	 
	public FileCollection() {
		
	}
	public FileCollection(String filename,String fullpath,String content,String uuid,boolean archived,Date date,BatchCollection batch) {
		this.batch=batch;
		this.filename=filename;
		this.fullpath=fullpath;
		this.content=content;
		this.creationDate=date;
		this.hashid=uuid;
		this.archived=archived;
	}
	public FileCollection(String filename,String fullpath,Date date,BatchCollection batch) {
		this.batch=batch;
		this.filename=filename;
		this.fullpath=fullpath;
		this.creationDate=date;
		this.hashid=UUID.randomUUID().toString();
		
	}
	public FileCollection(String filename,String fullpath,BatchCollection batch) {
		this.batch=batch;
		this.filename=filename;
		this.fullpath=fullpath;
		this.creationDate=new Date();
		this.hashid=UUID.randomUUID().toString();
		
	}
	@Column(columnDefinition = "TEXT")
	private String	content;
	
	private boolean archived; //
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHashid() {
		return hashid;
	}
	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
	public String getFullpath() {
		return fullpath;
	}
	public void setFullpath(String fullpath) {
		this.fullpath = fullpath;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	
	
	
	
	
	
}
