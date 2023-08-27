package BibliotecaFisica;

import java.util.ArrayList;

public abstract class Usuario extends Pessoa {
	private String senha;
	public Usuario(String nome, String senha) {
		super(nome);
		this.senha=senha;
	}

	public abstract String menu();
	
	public ArrayList<Livro> verLivros(){
		return new ArrayList<>();
	}
	
	
	
	
	public String emprestarLivro(Cliente cliente,Livro livro, Data retirada, Data devolucao) {
        Emprestimo emprestimos= new Emprestimo(cliente, livro,retirada, devolucao);
		emprestimos.add();
		cliente.addLivro(livro);
		return "Emprestimo realizado com sucesso";
		
	}
	public static Usuario validaLogin(String nome, String senha) {
		for(Pessoa pessoa : Pessoa.getPessoas()) {
			if(pessoa instanceof Usuario) {
				if(pessoa.getNome().equals(nome) &&((Usuario) pessoa).senha.equals(senha)){
					return (Usuario) pessoa;
				}
			}
	}
		return null;
    }
}
