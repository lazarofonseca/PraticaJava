package br.com.teste;

public class Imprimir<T> {
	
	public void exibiArray(T[] elementos) {

		for(int i = 0; i < elementos.length; i++) {
			System.out.println(elementos[i]);
		}
	}

}
