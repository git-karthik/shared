package com.rk.feign.feignclientservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.feign.feignclientservice.feigns.CalculatorClient;

@RestController
@RequestMapping("/feign")
public class CalcFeignController {

	@Autowired
	CalculatorClient calculatorClient;
	private Integer a = 10;
	private Integer b = 2;

	@GetMapping("/add")
	public int getSum() {
		return calculatorClient.sum(a, b);
	}
	@GetMapping("/sub")
	public int getDifference() {
		return calculatorClient.sub(a, b);
	}

	@GetMapping("/multiply")
	public int getMultiply() {
		return calculatorClient.multiply(a, b);

	}

	@GetMapping("/divide")
	public int getDivide() {
		return calculatorClient.divide(a, b);
	}
}
