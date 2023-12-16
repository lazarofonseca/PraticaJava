package br.com.treinaweb.exercicios;


// Para que seja possivel a comparação entre objetos é preciso da implementação
// da interface Compareble, essa interface permite ordenar por ordem alfabetica
public class Aluno implements Comparable<Aluno>{

	private Long id;
	private String nome;
	private int idade;
	private String cpf;

	public Aluno(Long id, String nome, int idade, String cpf) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Aluno id:"
				+ id + ", "
				+ "nome: "
				+ nome + ", "
				+ "idade: "
				+ idade + ","
				+ " cpf: "
				+ cpf;
	}
	
	// Esse método faz a comparação deste objeto com o que é recebido no parâmetro
	// Permitindo assim a ordenação
	@Override
	public int compareTo(Aluno o) {
		return this.nome.compareTo(o.nome);
	}

}
