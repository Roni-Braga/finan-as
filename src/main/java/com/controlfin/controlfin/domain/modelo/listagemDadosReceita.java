package com.controlfin.controlfin.domain.modelo;

public record listagemDadosReceita(Long id, String nome, double valor) {
	public listagemDadosReceita(Receita receita) {
		this(receita.getId(),receita.getNome(),receita.getValor());
	}
}
