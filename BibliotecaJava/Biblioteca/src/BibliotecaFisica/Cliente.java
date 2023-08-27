package BibliotecaFisica;

import java.util.ArrayList;

public  class Cliente extends Usuario {

	public Cliente(String nome, String senha, String cpf, int idade) {
		super(nome, senha);
		this.cpf = cpf;
		qtdClientes++;
		this.matricula= qtdClientes;
		this.idade= idade;
		}

	private String cpf;
	private  static int qtdClientes;
	private int idade, matricula;
	 ArrayList<Livro> livros = new ArrayList<>();
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	
	
	@Override
	public String menu() {
		return "\n1 - Ver livros"
				+ "\n2 - Ver livros emprestados"
				+ "\n3 - Emprestar livro"
				+"\n0 - Sair";
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static int getQtdClientes() {
		return qtdClientes;
	}

	public static void setQtdClientes(int qtdClientes) {
		Cliente.qtdClientes = qtdClientes;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public static String listarClientes() {
		String texto = null;
		for(Pessoa pessoa : Pessoa.getPessoas()) {
			if(pessoa instanceof Cliente) {
					texto +=""+pessoa;
				
				
			}
		}
		return texto;
	}

	
	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public static Cliente getCliente(String nome) {
		for(Pessoa pessoa : Pessoa.getPessoas()) {
			if(pessoa instanceof Cliente) {
				
			
			if(pessoa.getNome().equals(nome)) {
				return (Cliente) pessoa;
			}
			}
		}
		return null;
	}


	public static void setClientes(ArrayList<Cliente> clientes) {
		Cliente.clientes = clientes;
	}
	public  void addLivro(Livro livro) {
		livros.add(livro);
	}

	public static String verLisvrosEmprestados() {
		String texto = "";
		for(Pessoa pessoa : Pessoa.getPessoas()) {
			if(pessoa instanceof Cliente) {
				for(Livro livro : ((Cliente)pessoa).getLivros()) {
					texto +=""+ livro;
				}
			}
		}
		return texto;
	}


	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nIdade: " + idade + "\nLivros: " + livros+"\n";
	}
	
	
}
