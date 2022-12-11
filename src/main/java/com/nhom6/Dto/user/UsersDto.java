package com.nhom6.Dto.user;

public class UsersDto {
	private int id;
	private String name;
	private String address;
	private int phone_number;
	private int identify_card;
	private String password;
	
	public UsersDto() {
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
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public int getIdentify_card() {
		return identify_card;
	}
	public void setIdentify_card(int identify_card) {
		this.identify_card = identify_card;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
