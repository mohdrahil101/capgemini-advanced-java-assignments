package com.example.demo;

public class Auto implements Vehicle{
	
	public Auto() {
		System.out.println("Auto created");
	}
	@Override
	public void run() {
		System.out.println("Auto running");
	}

}
