package com.exis.banking.ibwise.core.serviceanalyzer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "prd_transaction", indexes = {
		@Index(name = "hashid_idx",  columnList="hashid", unique = true)
})
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	
	private int msgType;
	
	private String uniqueRef;
	
	private String hashid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMsgType() {
		return msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public String getUniqueRef() {
		return uniqueRef;
	}

	public void setUniqueRef(String uniqueRef) {
		this.uniqueRef = uniqueRef;
	}

	public String getHashid() {
		return hashid;
	}

	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
	
	
}
