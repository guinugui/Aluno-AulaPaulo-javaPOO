package Aplication;

public class Programa {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Guilherme Ribeiro";
		aluno1.idade = 21;
		aluno1.dataMatricula.dataFormatada();
		
		System.out.println(aluno1.matricula());

	}

}
