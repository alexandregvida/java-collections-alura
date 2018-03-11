package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null){
			throw new NullPointerException("Nome não pode ser igual a NULL");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString (){
		return "[Aluno: " + this.nome + " Matricula: " + this.numeroMatricula + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno =(Aluno) obj; //Casting para transformar objeto generigo para objetos Aluno
		return nome.equals(outroAluno.nome); 
	}

	//SEMPRE que reescrever o Equals reescrever tambem o HashCode 
	
	@Override
	public int hashCode() {
		return nome.hashCode();
	}
	
	
	

	
	
	

}
