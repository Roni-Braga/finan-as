package com.controlfin.controlfin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controlfin.controlfin.domain.modelo.dadosReceita;
import com.controlfin.controlfin.domain.modelo.listagemDadosReceita;



@RestController
@RequestMapping("receita")
public class ReceitaController {
		
		@PostMapping
		public ResponseEntity cadastrar (@RequestBody dadosReceita dados) {
			return ResponseEntity.ok(dados);
		}
	
	
		@GetMapping
		public ResponseEntity Listar(listagemDadosReceita dados) {
			return ResponseEntity.ok(dados);
		}
}
