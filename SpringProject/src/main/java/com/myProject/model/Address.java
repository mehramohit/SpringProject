package com.myProject.model;

import com.myProject.enums.Province;

public class Address {

	private int unitNumber;
	private String streetAddress;
	private String city;
	private Province province;
	private String postalCode;
	
	public Address() {
	}
	
	public Address(int unitNumber, String streetAddress, String city, Province province, String postalCode) {
		super();
		this.unitNumber = unitNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}



	public int getUnitNumber() {
		return unitNumber;
	}
	public Address setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
		return this;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public Address setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
		return this;
	}
	public String getCity() {
		return city;
	}
	public Address setCity(String city) {
		this.city = city;
		return this;
	}
	public Province getProvince() {
		return province;
	}
	public Address setProvince(Province province) {
		this.province = province;
		return this;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public Address setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}
	
	@Override
	public String toString() {
		return "Address [unitNumber=" + unitNumber + ", streetAddress=" + streetAddress + ", city=" + city
				+ ", province=" + province + ", postalCode=" + postalCode + "]";
	}
	
	
}
