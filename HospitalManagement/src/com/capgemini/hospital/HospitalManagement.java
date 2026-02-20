package com.capgemini.hospital;

import java.util.*;

public class HospitalManagement {
	private List<Patient> patients=new ArrayList<>();
	private List<Doctor> doctors=new ArrayList<>();
	private List<Appointment> appointments=new ArrayList<>();
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	public void bookAppointment(int patientId,int doctorId,String date) throws HospitalException{
		
	}
}
