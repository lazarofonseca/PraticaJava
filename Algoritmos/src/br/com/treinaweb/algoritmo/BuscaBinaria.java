package br.com.treinaweb.algoritmo;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			numeros[i] = numero;
		}

		// ORDENAÇÃO SELECT SORT

		for (int i = 0; i < numeros.length; i++) {
			int indiceDoMenor = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[indiceDoMenor]) {
					indiceDoMenor = j;
				}
				int temp = numeros[indiceDoMenor];
				numeros[indiceDoMenor] = numeros[i];
				numeros[i] = temp;
			}
		}

		System.out.println("Vetor ordenado: ");
		imprimirArray(numeros);
		
		//--------BUSCA BINÁRIA-------------
		System.out.println("Busca Bínária");
		int resultado = -1;
		int inicio= 0;
		int fim = numeros.length - 1;
		int meio = 0;
		System.out.println("Digite o elemento a ser encontrado:: ");
		int alvo = sc.nextInt();
		
		while(inicio <= fim) {
			meio = (inicio + fim) / 2;
			if(numeros[meio] < alvo) {
				inicio = meio + 1;
			}else if(numeros[meio] > alvo) {
				fim = meio - 1;
			}else if(numeros[meio] == alvo){
				resultado = meio;
				break;
			}
		}
		if (resultado < 0) {
			System.out.println("Elemento não encontrado");
		}else {
			System.out.println(String.format("O número %d foi encontrado na posição %d%n ", alvo, resultado));
		}
		

		sc.close();
	}

	public static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
