package com.capgemini.hibernate.hibernatedemo1;

import jakarta.persistence.Embeddable;

@Embeddable 
public class Address {
	private String city;
	private String state;
	private String country;
	public Address(String city, String state,String country){
		super();
		this.state=state;
		this.city=city;
		this.country=country;
	}
	public final String getCity() {
		return city;
	}
	public final void setCity(String city) {
		this.city = city;
	}
	public final String getState() {
		return state;
	}
	public final void setState(String state) {
		this.state = state;
	}
	public final String getCountry() {
		return country;
	}
	public final void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
