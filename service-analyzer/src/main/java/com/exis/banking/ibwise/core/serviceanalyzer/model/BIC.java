package com.exis.banking.ibwise.core.serviceanalyzer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "prd_bic", indexes = {
		@Index(name = "hashid_idx",  columnList="hashid", unique = true)
})
public class BIC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	
	private String code;
	
	private long trxId;
	
	private String hashid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getTrxId() {
		return trxId;
	}

	public void setTrxId(long trxId) {
		this.trxId = trxId;
	}

	public String getHashid() {
		return hashid;
	}

	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
	
	
	
	
}
