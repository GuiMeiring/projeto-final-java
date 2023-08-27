package BibliotecaFisica;

import java.util.ArrayList;

public abstract class Pessoa {
	
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	private static ArrayList<Pessoa> pessoas = new ArrayList<>();	
	private String nome;

	public static ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public  void  addPessoa() {
		pessoas.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
	
}
