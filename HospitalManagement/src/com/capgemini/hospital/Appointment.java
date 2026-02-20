package com.capgemini.hospital;

public class Appointment {
	private Patient patient;
	private Doctor doctor;
	private String date;
	
	public Appointment(Patient patient,Doctor doctor,String date) {
		this.patient=patient;
		this.doctor=doctor;
		this.date=date;
	}
	public double getBillamount() {
		return doctor.getFees();
	}
	public void displayAppointment() {
		System.out.println("Appointment: "+patient.name+" with Dr. "+doctor.name+" on "+date);
	}
	
}
