package Aplication;

public class Aluno {

	String nome;
	int idade;
	Data dataMatricula = new Data();
	
	public String matricula() {
		return  this.nome + ", "
			   + this.idade + ", "
			   + this.dataMatricula.dataFormatada();
	}
	
}
