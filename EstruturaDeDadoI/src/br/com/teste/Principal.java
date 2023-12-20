package br.com.teste;

public class Principal {

	public static void main(String[] args) {
		
		Imprimir<Integer> imprimirInt = new Imprimir<Integer>();
		Integer[] intArray= {1 , 2, 3};
		imprimirInt.exibiArray(intArray);
		
		Imprimir<String> imprimirString = new Imprimir<String>();
		String[] stringArray = {"Olá", "Mundo"};
		imprimirString.exibiArray(stringArray);
		

		

	}

}
