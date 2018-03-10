package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private Set<Aluno> alunos = new HashSet<>();
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);

	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public int getTempoTotalForEach() {
		int totalTempo = 0;
		for (Aula aula : aulas) {
			totalTempo += aula.getTempo();
		}
		return totalTempo;
	}

	@Override
	public String toString() {
		return "[ Titulo: " + nome + ", total de tempo: " + getTempoTotal() + ", aulas " + this.aulas + "Alunos: "
				+ this.alunos + "]";

	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}

}
