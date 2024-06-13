package com.api.helloWorld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {
	
	@GetMapping("/{hello-world}")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/bdsm")
    public List<String> getWords() {
        return Arrays.asList("Orientação ao Detalhe ", "Trabalho em Equipe", "Comunicação", "Proatividade");
    }

	@GetMapping("/objetivo-aprendizagem")
    public List<String> getObjetivos() {
        return Arrays.asList("Desenvolver APIs RESTful com Spring Boot", "Persistência de Dados com Spring Data JPA", "Segurança em Aplicações Spring");
    }
}
