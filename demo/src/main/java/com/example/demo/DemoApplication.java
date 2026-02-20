package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BeanFactory factory=SpringApplication.run(DemoApplication.class, args);
		Vehicle vehicle=factory.getBean(Car.class);
		Vehicle vehicle2=factory.getBean(Car.class);
		System.out.println(vehicle);
		System.out.println(vehicle2);
		vehicle.run();
	}

}
