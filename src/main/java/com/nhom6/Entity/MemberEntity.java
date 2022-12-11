package com.nhom6.Entity;

import java.sql.Date;

public class MemberEntity {
	int id;
	String name;
	String address;
	Date dateBirthday;
	int gender;
	int IDidentity;
	String placeOfIssue;
	String nativeLand;
	String permanentResident;
	String IssueON;
	String image;
	String frontIdentify;
	String backIdentify;
	String password;
	int phone_number;
	
	
	public MemberEntity() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getDateBirthday() {
		return dateBirthday;
	}


	public void setDateBirthday(Date dateBirthday) {
		this.dateBirthday = dateBirthday;
	}


	public int getGender() {
		return gender;
	}


	public void setGender(int gender) {
		this.gender = gender;
	}


	public int getIDidentity() {
		return IDidentity;
	}


	public void setIDidentity(int iDidentity) {
		IDidentity = iDidentity;
	}


	public String getPlaceOfIssue() {
		return placeOfIssue;
	}


	public void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}


	public String getNativeLand() {
		return nativeLand;
	}


	public void setNativeLand(String nativeLand) {
		this.nativeLand = nativeLand;
	}


	public String getPermanentResident() {
		return permanentResident;
	}


	public void setPermanentResident(String permanentResident) {
		this.permanentResident = permanentResident;
	}


	public String getIssueON() {
		return IssueON;
	}


	public void setIssueON(String issueON) {
		IssueON = issueON;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getFrontIdentify() {
		return frontIdentify;
	}


	public void setFrontIdentify(String frontIdentify) {
		this.frontIdentify = frontIdentify;
	}


	public String getBackIdentify() {
		return backIdentify;
	}


	public void setBackIdentify(String backIdentify) {
		this.backIdentify = backIdentify;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	
	
	
	
	
}
