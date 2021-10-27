package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Texto")

public class Habilidadesgen {
		
	@GetMapping
	public String Texto() {
		return "Persistencia e atenção aos detalhes";
	}

}
