package com.myProject.model;

import java.io.Serializable;

public class Account implements Serializable{
 
	
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String firstName;
	private String lastName;
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Account [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]";
	}
}
