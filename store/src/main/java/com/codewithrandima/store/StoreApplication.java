package com.codewithrandima.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);

//		inject the (new StripePaymentService) which is an object through OrderService constructor
//		var orderService1 = new OrderService(new StripePaymentService());
//		orderService1.placeOrder();
//
//		var orderService2 = new OrderService(new PaypalPaymentService());
//		orderService2.placeOrder();

//		Inject through a setter (Setter injection)
		var orderService3 = new OrderService();
		orderService3.setPaymentService(new StripePaymentService());
		orderService3.placeOrder();
	}

}
