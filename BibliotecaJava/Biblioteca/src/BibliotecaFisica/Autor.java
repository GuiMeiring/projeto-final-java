package BibliotecaFisica;

import java.util.ArrayList;

public class Autor extends Pessoa {
	public static ArrayList<Autor> listaAutor = new ArrayList<>();

	public Autor(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	public void addAutor() {
		listaAutor.add(this);
	}
	public static Autor getAutor(String nome) {
		
		for(Pessoa autor: Pessoa.getPessoas()) {
			if(autor instanceof Autor) {
				if(autor.getNome().equals(nome)) {
					return (Autor) autor;
				}
			}
			
		}
		return null;
		
	}
	public static String listarAutor() {
		String texto = "";
		for(Pessoa pessoa : Pessoa.getPessoas()) {
			if(pessoa instanceof Autor) {
					texto +=""+pessoa;
				
				
			}
		}
		return texto;
	}
	@Override
	public String toString() {
		return "\nAutor: "+ getNome();
	}
	
	
}

	
	

	

