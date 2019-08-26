package com.myProject.model;

import java.io.Serializable;

public class Account implements Serializable{
 
	
	private String userName;
	private String firstName;
	private String lastName;
	private String address;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Account [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]";
	}
}
