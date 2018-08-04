package com.nucleus.entity;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Person implements Serializable
{
	private static final long serialVersionUID = 1L;
	@NotEmpty(message="Cannot be empty")
	private String Code;
	@NotEmpty(message="Cannot be empty")
	private String Name;
	@NotEmpty(message="Cannot be empty")
	private String Ad1;
	@NotEmpty(message="Cannot be empty")
	@Size(min=10,max=10,message="contact no should be of 10 digit")
	@Pattern(regexp="(^[0-9]*$)",message="No character should be present in number")
	private String Contact;
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAd1() {
		return Ad1;
	}
	public void setAd1(String ad1) {
		Ad1 = ad1;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}

}
