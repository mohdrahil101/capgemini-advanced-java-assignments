package com.capgemini.hospital;

public class Patient extends Person{
	private int age;
	private String disease;
	public Patient(int id,String name,int age, String disease) {
		super(id,name);
		this.age=age;
		this.disease=disease;
	}
	public int getAge() {
		return age;
	}
	public String getDisease() {
		return disease;
	}
	@Override
	public void displayDetails() {
		System.out.println("Patient ID: "+id+"\nPatient Name: "+name+"\nAge: "+age+"\nDisease: "+disease);
	}
}
