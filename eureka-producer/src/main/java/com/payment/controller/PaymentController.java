package com.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/ribbon")
	public String getRibbon() {
		return "payment with " + 100 + " is successfull - port "+port;
	}
	
	@RequestMapping("/test")
	public String test() {
		return "payment with " + 100 + " is successfull - port "+port;
	}
	
	@GetMapping("/payNow/{price}")
	public String payNow(@PathVariable int price) {
		return "payment with " + price + " is successfull - port "+port;
	}

}
