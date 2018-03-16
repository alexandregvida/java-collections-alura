package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso cursoJava = new Curso("Introdução Java", "Thiagão");
		cursoJava.adiciona(new Aula("Operadores", 10));
		
		//cursoJava.getAulas().add(new Aula("Operadores",10));
		
		System.out.println(cursoJava.getAulas());
		

	}

}
