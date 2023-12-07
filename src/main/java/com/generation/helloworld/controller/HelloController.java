package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	private String hello() {
		return "<b>Hello Turma 68!!</b> <br /> Segunda Frase";
	}
	
	@GetMapping("/top")
	private String top() {
		return "<i>\n Turma 68 é TOP!!</i>";
	}
	
}
