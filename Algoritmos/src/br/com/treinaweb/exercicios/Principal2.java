package br.com.treinaweb.exercicios;

import java.util.Arrays;

public class Principal2 {

	static Aluno[] alunos = new Aluno[5];

	static {
		alunos[0] = new Aluno(1L, "Lázaro", 37, "000.737.000-31");
		alunos[1] = new Aluno(2L, "Gesica", 25, "000.737.000-31");
		alunos[2] = new Aluno(3L, "Gabriel", 10, "000.737.000-31");
		alunos[3] = new Aluno(4L, "Sebastião", 74, "000.737.000-31");
		alunos[4] = new Aluno(5L, "Amaral", 73, "000.737.000-31");
	}

	public static void main(String[] args) {
		System.out.println("Impressão do vetor desordenado:");
		imprimirVetor(alunos);

		ordenarPorIdade(alunos);
		
		System.out.println();
		System.out.println("----------------VETOR ORDENADO-----------------");
		System.out.println();

		System.out.println("Imprimir vetor de alunos ordenados por idade: ");
		imprimirVetor(alunos);
		System.out.println();
		System.out.println("----------------VETOR ORDENADO POR NOME-----------------");
		System.out.println();

		System.out.println("Imprimir vetor de alunos ordenados por idade: ");
		
		// Ordenando o vetor
		Arrays.sort(alunos);
		imprimirVetor(alunos);

	}

	private static void ordenarPorIdade(Aluno[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			int indiceDoMenor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j].getIdade() < vetor[indiceDoMenor].getIdade()) {
					indiceDoMenor = j;
				}
				Aluno temp = vetor[indiceDoMenor];
				vetor[indiceDoMenor] = vetor[i];
				vetor[i] = temp;
			}
		}
		
	}

	public static void imprimirVetor(Aluno[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
