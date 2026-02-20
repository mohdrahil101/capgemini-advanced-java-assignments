package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public Bike() {
		System.out.println("Bike created using spring");
	}

	@Override
	public void run() {
		System.out.println("Bike running");
		
	}

}
