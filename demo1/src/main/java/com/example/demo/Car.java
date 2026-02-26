package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Car {
	private Engine engine;
	
	@Autowired
	public Car(Engine engine) {
		this.engine=engine;
		System.out.println("Car been created by Spring..");
	}
	
//	@Autowired
//	public void setEngine(Engine engine) {
//		this.engine=engine;
//		System.out.println("Engine injectected using setter");
//		
//	}
	
	public void drive() {
//		System.out.println("Driving car using "+engine.getEngine());
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Car has been initialized");
	}
	
}
