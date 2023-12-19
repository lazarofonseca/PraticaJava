package br.com.treinaweb.dados.um;

import java.util.Scanner;

import br.com.treinaweb.dados.um.modelos.Pessoa;
import br.com.treinaweb.dados.um.vetor.Vetor;

public class Main {

	public static void main(String[] args) {

		System.out.println("Digite a opção desejada:");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. fazer vetor");
		Scanner sc = new Scanner(System.in);

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		}
		
		sc.close();

	}

	private static void fazerGerenciamentoMemoria() {
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println("--------------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("********************************");
		Pessoa p1 = new Pessoa(1, "TreinaWeb");
		System.out.println(p1.toString());
		Pessoa p2 = new Pessoa(1, "TreinaWeb");
		System.out.println(p2.toString());
		p2.setNome("TreinaWeb Modificado");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
	}
	
	private static void fazerVetor() {
		
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>(3);
		vetorPessoas.inserirEm(0, new Pessoa(1, "TreinaWeb"));
		System.out.println(vetorPessoas.recuperar(0).getNome());
		Vetor<Integer> inteiros = new Vetor<Integer>(2);
		inteiros.inserirEm(0, 1);
		System.out.println(inteiros.recuperar(0));
		
	}

}
