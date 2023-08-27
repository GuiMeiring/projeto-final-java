package BibliotecaFisica;

import java.util.ArrayList;

public class Colecao {
	
	private static  ArrayList <Colecao> colecoes = new ArrayList<>();

	private String nome;
	private Autor autor;
	private ArrayList <Livro> livros = new ArrayList<>();
	
	
	
	public Colecao(String nome, Autor autor) {
		this.nome=nome;
		this.autor= autor;
	}
	public ArrayList<Livro> addLivro() {
		for(Livro livro : Livro.getLivros()) {
			if(livro.getAutor()== autor) {
				livros.add(livro);
			}
		}
		return livros;
	}
	
	public static ArrayList<Colecao> getColecoes() {
		return colecoes;
	}
	public void add() {
		colecoes.add(this);
	}
	public static Colecao getColecao(String nome) {
		for(Colecao colecao : colecoes) {
			if(colecao.nome.equals(nome)) {
				return colecao;
			}
		}
		return null;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	public static void setColecoes(ArrayList<Colecao> colecoes) {
		Colecao.colecoes = colecoes;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "\nAutor: " + autor + "\nLivros:----------------- " + livros +"\n";
	}
	
	

}
