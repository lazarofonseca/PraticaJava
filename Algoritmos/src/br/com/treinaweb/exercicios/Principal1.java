package br.com.treinaweb.exercicios;

public class Principal1 {

	static Aluno[] alunos = new Aluno[5];

	static {
		alunos[0] = new Aluno(1L, "Lázaro", 37, "076.737.064-31");
		alunos[1] = new Aluno(2L, "Gesica", 25, "076.737.064-31");
		alunos[2] = new Aluno(3L, "Gabriel", 10, "076.737.064-31");
		alunos[3] = new Aluno(4L, "Sebastião", 74, "076.737.064-31");
		alunos[4] = new Aluno(5L, "Maria", 73, "076.737.064-31");
	}

	public static void main(String[] args) {

		System.out.println("Impressão do vetor desordenado:");
		imprimirVetor(alunos);
		
		
		for (int i = 0; i < alunos.length; i++) {
			int indiceDoMenor = i;
			for (int j = i + 1; j < alunos.length; j++) {
				if (alunos[j].getIdade() < alunos[indiceDoMenor].getIdade()) {
					indiceDoMenor = j;
				}
				Aluno temp = alunos[indiceDoMenor];
				alunos[indiceDoMenor] = alunos[i];
				alunos[i] = temp;
			}
		}
		System.out.println("----------------VETOR ORDENADO-----------------");
		System.out.println();
		
		System.out.println("Imprimir vetor de alunos ordenados por idade: ");
		imprimirVetor(alunos);

	}
	
	public static void imprimirVetor(Aluno[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
