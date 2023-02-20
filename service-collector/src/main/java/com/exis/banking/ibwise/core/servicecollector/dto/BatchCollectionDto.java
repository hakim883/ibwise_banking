package com.exis.banking.ibwise.core.servicecollector.dto;

import java.util.Date;

public class BatchCollectionDto {

	private String name;
	
	private Date date;
	
	private String description;
	
	public BatchCollectionDto(){
		
	}
	
	public BatchCollectionDto(String name,Date date,String description){
		this.name=name;
		this.date=date;
		description=this.description;
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
	
	
}
