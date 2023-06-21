package com.controlfin.controlfin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controlfin.controlfin.domain.modelo.Receita;
import com.controlfin.controlfin.domain.modelo.ReceitaRepository;
import com.controlfin.controlfin.domain.modelo.dadosReceita;
import com.controlfin.controlfin.domain.modelo.listagemDadosReceita;



@RestController
@RequestMapping("receita")
public class ReceitaController {
	@Autowired	
	private ReceitaRepository repository;
		@PostMapping
		public ResponseEntity cadastrar (@RequestBody dadosReceita dados) {
			Receita receita = new Receita(dados);
			repository.save(receita);
			return ResponseEntity.ok().build();
		}
	
	
		@GetMapping
		public ResponseEntity ListAll() {
			var allReceita = repository.findAll();
			return ResponseEntity.ok(allReceita);
			
		}
}
