package com.exis.banking.ibwise.core.serviceanalyzer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "prd_country", indexes = {
		@Index(name = "hashid_idx",  columnList="hashid", unique = true)
})
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	
	private String cca2;
	
	private String cca3;
	
	private String hashid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCca2() {
		return cca2;
	}

	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}

	public String getCca3() {
		return cca3;
	}

	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}

	public String getHashid() {
		return hashid;
	}

	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
	
	
	
}
