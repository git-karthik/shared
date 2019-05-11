package com.rk.eureka.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

	@GetMapping("/add")
	public int sum(Integer a, Integer b) {
		return Math.addExact(a, b);
	}

	@GetMapping("/sub")
	public int sub(Integer a, Integer b) {
		return Math.subtractExact(a, b);
	}

	@GetMapping("/multiply")
	public int multiply(Integer a, Integer b) {
		return Math.multiplyExact(a, b);
	}

	@GetMapping("/divide")
	public int divide(Integer a, Integer b) {
		return Math.floorDiv(a, b);
	}
}
