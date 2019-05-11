package com.rk.feign.feignclientservice.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "calculator-service")
@RequestMapping("/calculate")
public interface CalculatorClient {

	@GetMapping("/add")
	public int sum(@RequestParam Integer a, @RequestParam Integer b);

	@GetMapping("/sub")
	public int sub(@RequestParam Integer a, @RequestParam Integer b);

	@GetMapping("/multiply")
	public int multiply(@RequestParam Integer a, @RequestParam Integer b);

	@GetMapping("/divide")
	public int divide(@RequestParam Integer a, @RequestParam Integer b);
}
