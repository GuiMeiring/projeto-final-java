package BibliotecaFisica;

import java.util.ArrayList;
import java.util.Date;

public class Livro {
	
	private static ArrayList<Livro> livros= new ArrayList<>();
	private static int qtdEditora;
	
	private int qtdPg, isbn;
	private String titulo;
	private Pessoa autor;
	private Categoria categoria;
	private Editora editora;
	private Data publicacao;
	private Colecao colocao; //Agregação
	
	//=========================================================Construtor
	
	public Livro(int qtdPg, String titulo, Pessoa autor, Categoria categoria, Editora editora,
			Data publicacao) {
		super();
		qtdEditora++;
		this.qtdPg = qtdPg;
		this.isbn = qtdEditora;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.editora = editora;
		this.publicacao = publicacao;
	}
	
	//-------------------------------------------------------------Agregação
	public void setColocao(Colecao colocao) {
		this.colocao = colocao;
	}
	//------------------------------------------------------------Getters e setters
	
	public static ArrayList<Livro> getLivros() {
		return livros;
	}
	public static Livro getLivro(String titulo) {
		for(Livro livro : livros) {
			if(livro.titulo.equals(titulo)) {
				return livro;
			}
		}
		return null;
	}
	
	public int getQtdPg() {
		return qtdPg;
	}
	public void setQtdPg(int qtdPg) {
		this.qtdPg = qtdPg;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Pessoa getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public Data getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(Data publicacao) {
		this.publicacao = publicacao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public Colecao getColocao() {
		return colocao;
	}

	public void addLivro() {
		livros.add(this);
		
	}

	@Override
	public String toString() {
		if(this.colocao == null) {
			return "\n------Livro-------\nTitulo: " + titulo + "\nQuantidade de Páginas: " + qtdPg + "\nISBN: " + isbn + autor + categoria + editora + "\nPublicação: " + publicacao + "\nColeção: Nenhuma" +"\n" ;
		}
		return "\n------Livro-------\nTitulo: " + titulo + "\nQuantidade de Páginas: " + qtdPg + "\nISBN: " + isbn + autor + categoria + editora + "\nPublicação: " + publicacao + "\nColeção: " + colocao+"\n" ;
	}
	

}
