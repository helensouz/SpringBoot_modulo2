package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class SegundaAplicacao {
	
	@GetMapping
	public String objetivos() {
		return "quero desenvolver um projeto utilizando java e banco de dados";
	}

}
