package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PaymentSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(PaymentSystemApplication.class, args);
		Payment payment=context.getBean(Payment.class);
		payment.pay(5000);
		
		UpiPayment upi1=context.getBean(UpiPayment.class);
		UpiPayment upi2=context.getBean(UpiPayment.class);
		
		System.out.println("UPI1 hashcode: "+upi1.hashCode());
		System.out.println("UPI2 hashcode: "+upi2.hashCode());
		context.close();
	}

}
