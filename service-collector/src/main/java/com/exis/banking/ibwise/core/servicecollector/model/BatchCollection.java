package com.exis.banking.ibwise.core.servicecollector.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(
		name = "stg_batch_collection",
		indexes = {
				@Index(name = "hashid_idx",  columnList="hashid", unique = true)
		})
public class BatchCollection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	
	public BatchCollection () {
		
	}
	
	public BatchCollection (String name,Date date, String description) {
		this.hashid=UUID.randomUUID().toString();
		this.name=name;
		this.date=date;
		this.description=description;
	}
	public BatchCollection (String hashid,String name) {
		this.hashid=hashid;
		this.name=name;
		this.date=new Date();
		this.description="";
	}
	public BatchCollection (String hashid,String name,Date date, String description) {
		this.hashid=hashid;
		this.name=name;
		this.date=date;
		this.description=description;
	}
	private String hashid;
	
	private String name;
	
	private Date date;
	
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHashid() {
		return hashid;
	}

	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
	
	
	
}
