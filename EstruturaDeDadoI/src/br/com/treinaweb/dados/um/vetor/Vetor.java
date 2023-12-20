package br.com.treinaweb.dados.um.vetor;

import java.util.Arrays;

public class Vetor<T> {

	private Object[] elementos;
	private int posicao;

	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
	}

	public Vetor() {
		this.elementos = new Object[3];
		this.posicao = 0;
	}

	public void inserir(T elemento) {
		if (this.posicao >= this.elementos.length) {
			this.elementos = Arrays.copyOf(this.elementos, this.elementos.length + 1);
		}
		this.elementos[this.posicao] = elemento;
		this.posicao++;
	}

	public void inserirEm(int posicao, T elemento) {
		if (posicao > elementos.length) {
			throw new IllegalArgumentException(String.format("Posição inválida [%d]", posicao));
		}
		if(this.elementos[posicao] != null) {
			
			Object[] arrayFinal = Arrays.copyOfRange(this.elementos, posicao, this.elementos.length);
			Object[] arrayInicial = new Object[posicao + 1];
			System.arraycopy(this.elementos, 0, arrayInicial, 0, posicao);
			arrayInicial[arrayInicial.length - 1] = elemento;
			
			
			int novoTamanho = arrayFinal.length + arrayInicial.length;
			this.elementos = new Object[novoTamanho];
			System.arraycopy(arrayInicial, 0, this.elementos, 0, arrayInicial.length);
			System.arraycopy(arrayFinal, 0, this.elementos, arrayInicial.length, arrayFinal.length);
			
		}
		this.elementos[posicao] = elemento;
	}

	@SuppressWarnings("unchecked")
	public T recuperar(int posicao) {
		if(this.posicao >= tamanho()) {
			throw new IllegalArgumentException(String.format("posição inválida [%d]", elementos));
		}
		return (T) this.elementos[posicao];
	}

	public int tamanho() {
		return this.elementos.length;
	}
	
	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}

	public void imprimirVetor() {
		for(int i = 0; i < this.elementos.length; i++) {
			System.out.println(this.elementos[i]);
		}
	}

}
