package com.uatx.rest.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestEndpoint {
	@GetMapping("primer servicio")
	public String primer_Servicio() {
	return "HolaMundo!";
	}
	@GetMapping("segundo servicio")
	public String segundo_Servicio() {
	return "HolaMundo!";
	}
	@GetMapping("/echo")
	  public String echo(@RequestParam String name, @RequestParam int age) {
	    System.out.println("Prueba 3");
	    return "Hello " + name + ". You are " + age + " years old, right?";
	  }

}
