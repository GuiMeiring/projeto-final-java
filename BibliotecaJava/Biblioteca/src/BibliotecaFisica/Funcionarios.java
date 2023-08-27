package BibliotecaFisica;

import java.util.ArrayList;

public  class Funcionarios extends Usuario {
	
	private static int  qtdFuncionario;
	
	private String cargo;
	private String cpf;
	private int idade;
	private int matricula;
	

	public Funcionarios(String nome, String senha,String cargo, String cpf, int idade) {
		super(nome, senha);
		this.cargo=cargo;
		this.cpf=cpf;
		this.idade=idade;
		qtdFuncionario++;
		this.matricula= qtdFuncionario;
	}
	
	
	@Override
	public String menu() {
		return "\n1 - Ver livros"
				+ "\n2 - Ver livros emprestados"
				+ "\n3 - Emprestar livro"
				+ "\n4 - Cadastrar livro"
				+ "\n5 - Cadastrar Autor"
				+ "\n6 - Cadastrar Cliente"
				+ "\n7 - Cadastrar Coleção"
				+ "\n8 - Cadastrar Editora"
				+"\n9 - Cadastrar Funcionário"
				+"\n0 - Sair";
		
	}

	
	public String cadastrarLivro(Livro livro) {
		livro.addLivro();
		return "Livro cadastrado com sucesso";
	}
	public String cadastrarAutor(String nome) {
		Pessoa autor= new Autor(nome);
		autor.addPessoa();
		return "Autor cadastrado com sucesso";
	}
	public String cadastrarCliente(String nome , String senha, String cpf, int idade) {
		Pessoa cliente = new Cliente(nome, senha,cpf, idade );
		cliente.addPessoa();
		return "Cliente cadastrado com sucesso";
	}
	public String cadastrarFuncionario(String nome , String senha, String cpf, int idade, String cargo) {
		Pessoa funcionario = new Funcionarios(nome, senha,cargo,cpf, idade );
		funcionario.addPessoa();
		return "Funcionário cadastrado com sucesso";
	}
	public String cadastrarEditora(String nome, String cnpj) {
        Editora editora = new Editora(cnpj, nome);
		editora.addEditora();
		return "Editora cadastrada com sucesso";
	}
	public String cadastrarColecao(String nomeColecao, String nome) {
		Pessoa autor=Autor.getAutor(nome);
	     Colecao colecao = new Colecao(nomeColecao , (Autor) autor);
	     colecao.addLivro();
	     colecao.add();
		return "Coleção cadastrada com sucesso";
	}


	@Override
	public String toString() {
		return "\nNome: "+ getNome() +"\nCargo: "+ cargo + "\nCPF: " + cpf + "\nIdade: " + idade + "\nMatricula: " + matricula+"\n";
	}


	


	
	
	
}
