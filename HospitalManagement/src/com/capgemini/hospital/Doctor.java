package com.capgemini.hospital;

public class Doctor extends Person{
	private double fees;
	public Doctor(int id,String name,double fees) {
		super(id,name);
		this.fees=fees;
	}
	
	public double getFees() {
		return fees;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Name of Doctor: "+name+"\nId: "+id+"\nFees: "+fees);
	}
}
