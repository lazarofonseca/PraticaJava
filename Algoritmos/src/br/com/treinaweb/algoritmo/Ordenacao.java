package br.com.treinaweb.algoritmo;

import java.util.Scanner;

public class Ordenacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			numeros[i] = numero;
		}

			
		//ORDENAÇÃO SELECT SORT
		
		for(int i = 0; i < numeros.length; i++) {
			int indiceDoMenor = i;
			for(int j = i + 1; j < numeros.length; j++) {
				if(numeros[j] < numeros[indiceDoMenor]) {
					indiceDoMenor = j;
				}
				int temp = numeros[indiceDoMenor];
				numeros[indiceDoMenor] = numeros[i];
				numeros[i] = temp;
			}
		}
		
		System.out.println("Vetor ordenado: ");
		imprimirArray(numeros);

		sc.close();
	}

	public static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
