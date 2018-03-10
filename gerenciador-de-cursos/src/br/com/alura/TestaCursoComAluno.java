package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		
		Curso javaColecoes = new Curso ("Cominando as coleçoes de Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula ("Modelando com coleçoes",24));
		
		
		Aluno a1 = new Aluno("Rodrigo Turuni", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		//System.out.println(javaColecoes.getAlunos());
		
		javaColecoes.getAlunos().forEach(aluno -> {System.out.println(aluno);});
		
		
        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo");

	}

}
