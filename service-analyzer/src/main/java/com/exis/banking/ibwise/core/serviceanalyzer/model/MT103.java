package com.exis.banking.ibwise.core.serviceanalyzer.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "prd_mt103", indexes = {
		@Index(name = "hashid_idx",  columnList="hashid", unique = true)
})
public class MT103 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long	id;
	
	private String  senderRef;
	
	private String  bankOpCode;
	
	private Date    trxDate;
	
	private float   settledAmount;
	
	private long    settledCurrency;
	
	private float   instructedAmount;
	
	private long    instructedCurrency;
	
	private long    orderingCustomer;
	
	private long    orderingInstitution;
	
	private long    beneficiary;
	
	private String  chargeType;
	
	private float   chargeAmount;
	
	private String  chargeCurrency;
	
	private String  hashid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSenderRef() {
		return senderRef;
	}

	public void setSenderRef(String senderRef) {
		this.senderRef = senderRef;
	}

	public String getBankOpCode() {
		return bankOpCode;
	}

	public void setBankOpCode(String bankOpCode) {
		this.bankOpCode = bankOpCode;
	}

	public Date getTrxDate() {
		return trxDate;
	}

	public void setTrxDate(Date trxDate) {
		this.trxDate = trxDate;
	}

	public float getSettledAmount() {
		return settledAmount;
	}

	public void setSettledAmount(float settledAmount) {
		this.settledAmount = settledAmount;
	}

	public long getSettledCurrency() {
		return settledCurrency;
	}

	public void setSettledCurrency(long settledCurrency) {
		this.settledCurrency = settledCurrency;
	}

	public float getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(float instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public long getInstructedCurrency() {
		return instructedCurrency;
	}

	public void setInstructedCurrency(long instructedCurrency) {
		this.instructedCurrency = instructedCurrency;
	}

	public long getOrderingCustomer() {
		return orderingCustomer;
	}

	public void setOrderingCustomer(long orderingCustomer) {
		this.orderingCustomer = orderingCustomer;
	}

	public long getOrderingInstitution() {
		return orderingInstitution;
	}

	public void setOrderingInstitution(long orderingInstitution) {
		this.orderingInstitution = orderingInstitution;
	}

	public long getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(long beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public float getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(float chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getChargeCurrency() {
		return chargeCurrency;
	}

	public void setChargeCurrency(String chargeCurrency) {
		this.chargeCurrency = chargeCurrency;
	}

	public String getHashid() {
		return hashid;
	}

	public void setHashid(String hashid) {
		this.hashid = hashid;
	}
	
	
	
	
}
