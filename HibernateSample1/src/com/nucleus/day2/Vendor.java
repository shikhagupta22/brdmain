package com.nucleus.day2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VendorNuc")
public class Vendor 
{
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int vId;
private String vName;
@ElementCollection
private List<Address> adrs=new ArrayList<Address>();
public int getvId() {
	return vId;
}
public void setvId(int vId) {
	this.vId = vId;
}
public String getvName() {
	return vName;
}
public void setvName(String vName) {
	this.vName = vName;
}
public List<Address> getAdrs() {
	return adrs;
}
public void setAdrs(List<Address> adrs) {
	this.adrs = adrs;
}

}
