package com.nucleus.entity;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;



public class Customer extends Person implements Serializable
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private String custAd2;
	@NotEmpty(message="Cannot be empty")
	@Size(min=10,max=10,message="should be of 6 digit")
	@Pattern(regexp="(^[0-9]*$)",message="No character should be present")
	private String custPinCode;
	@NotEmpty(message="Cannot be empty")
	@Email
	private String custEmail;
	@NotEmpty(message="Cannot be empty")
	private String custPrimaryContactPerson;
	@NotEmpty(message="Cannot be empty")
	private String custRecordStatus;
	private String custFlag;
	@NotEmpty(message="Cannot be empty")
	private String custCreateDate;
	@NotEmpty(message="Cannot be empty")
	private String custCreatedBy;
	private String custModifiedDate;
	private String custModifiedBy;
	private String custAuthorizedDate;
	private String custAuthorizedBy;
	
	public String getCustAd2() {
		return custAd2;
	}
	public void setCustAd2(String custAd2) {
		this.custAd2 = custAd2;
	}
	public String getCustPinCode() {
		return custPinCode;
	}
	public void setCustPinCode(String custPinCode) {
		this.custPinCode = custPinCode;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustPrimaryContactPerson() {
		return custPrimaryContactPerson;
	}
	public void setCustPrimaryContactPerson(String custPrimaryContactPerson) {
		this.custPrimaryContactPerson = custPrimaryContactPerson;
	}
	public String getCustRecordStatus() {
		return custRecordStatus;
	}
	public void setCustRecordStatus(String custRecordStatus) {
		this.custRecordStatus = custRecordStatus;
	}
	public String getCustFlag() {
		return custFlag;
	}
	public void setCustFlag(String custFlag) {
		this.custFlag = custFlag;
	}
	public String getCustCreateDate() {
		return custCreateDate;
	}
	public void setCustCreateDate(String custCreateDate) {
		this.custCreateDate = custCreateDate;
	}
	public String getCustCreatedBy() {
		return custCreatedBy;
	}
	public void setCustCreatedBy(String custCreatedBy) {
		this.custCreatedBy = custCreatedBy;
	}
	public String getCustModifiedDate() {
		return custModifiedDate;
	}
	public void setCustModifiedDate(String custModifiedDate) {
		this.custModifiedDate = custModifiedDate;
	}
	public String getCustModifiedBy() {
		return custModifiedBy;
	}
	public void setCustModifiedBy(String custModifiedBy) {
		this.custModifiedBy = custModifiedBy;
	}
	public String getCustAuthorizedDate() {
		return custAuthorizedDate;
	}
	public void setCustAuthorizedDate(String custAuthorizedDate) {
		this.custAuthorizedDate = custAuthorizedDate;
	}
	public String getCustAuthorizedBy() {
		return custAuthorizedBy;
	}
	public void setCustAuthorizedBy(String custAuthorizedBy) {
		this.custAuthorizedBy = custAuthorizedBy;
	}
	


}
