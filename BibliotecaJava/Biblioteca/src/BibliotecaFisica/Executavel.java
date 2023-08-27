package BibliotecaFisica;

import java.util.Date;
import java.util.Scanner;

public class Executavel {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		Usuario usuario1 = new Funcionarios("Flavin", "12345", "Bibliotecario", "12345678901234", 28);
		usuario1.addPessoa();
		Usuario usuario2 = new Cliente("Robertinho", "12345", "1111111111111", 23);
		usuario2.addPessoa();
		do {
		   Usuario usuario =null;
		   do {
			  System.out.println(menu());
			  int escolha =sc.nextInt();
			  if(escolha == 1) {
                 usuario= encontrar();
				 System.out.println(usuario);
			  }else {
				 System.exit(0);
			  }
			}while(usuario ==null);
		    int escolha;
		    do {
		      System.out.println(usuario.menu());
		      escolha= sc.nextInt();
			  menu(usuario, escolha);
			
		    }while(escolha !=0);
		 }while(true);
	}
	public static String menu() {
		return "MENU \n1 - Login  \n3 - Sair";
		
	}
	public static Usuario encontrar() {
		System.out.println("Nome: ");
		String cpf=sc.next();
		System.out.println("Senha: ");
		String senha=sc.next();
		return Usuario.validaLogin(cpf, senha);
		
	}
	public static void menu(Usuario usuario, int escolha) {
		switch(escolha) {
		case 1:{
			case1(usuario);
			break;
		}
		case 2:{
			case2(usuario);
			break;
		}
		case 3:{
			case3(usuario);
			break;
		}
		case 4:{
			case4(usuario);
			break;
		}
		case 5:{
			case5(usuario);
			break;
			
		}case 6:{
			case6(usuario);
			break;
		}case 7:{
			case7(usuario);
			break;
		}
		case 8:{
			case8(usuario);
			break;
			}
		case 9:{
			case9(usuario);
			break;
		}
		}
	}
	public static void case1(Usuario usuario) {
		System.out.println("Livro: \n"+ Livro.getLivros());
	}
	public static void case2(Usuario usuario) {
		if(usuario instanceof Funcionarios) {
			System.out.println("Livros emprestados: ");
			System.out.println(Cliente.verLisvrosEmprestados());
		}else if(usuario instanceof Cliente) {
			System.out.println("Seus livros emprestados: "+ ((Cliente) usuario).getLivros());
		}
		
	}
	public static void case3(Usuario usuario) {
		if(usuario instanceof Funcionarios) {
			Livro livro =null;
			do {
				System.out.println(Livro.getLivros());
				System.out.println("Qual o livro que deseja emprestar: "); 
				String titulo =sc.next();
				livro = Livro.getLivro(titulo);
				
			}while(livro == null);
			Usuario cliente =null;
			do {
				System.out.println(Cliente.listarClientes());
				System.out.println("Qual o cliente: ");
				String name=sc.next();
				cliente = Cliente.getCliente(name);
			}while(cliente == null);
			
			System.out.println("Data da retirada: ");
			System.out.println("Dia: ");
			int dia=sc.nextInt();
			System.out.println("Mês: ");
			int mes=sc.nextInt();
			System.out.println("Ano: ");
			int ano=sc.nextInt();
			Data retirada=new Data(dia,mes,ano);
			System.out.println("Data de devolução: ");
			System.out.println("Dia: ");
			int diaDev=sc.nextInt();
			System.out.println("Mês: ");
			int mesDev=sc.nextInt();
			System.out.println("Ano: ");
			int anoDev=sc.nextInt();
			Data devolucao=new Data(diaDev,mesDev,anoDev);
            usuario.emprestarLivro((Cliente) cliente, livro, retirada, devolucao);
			
			
		}else {
			Livro livro =null;
			do {
				System.out.println(Livro.getLivros());
				System.out.println("Qual o livro que deseja emprestar: "); 
				String titulo =sc.next();
				livro = Livro.getLivro(titulo);
				
			}while(livro == null);
			
			System.out.println("Data da retirada: ");
			System.out.println("Dia: ");
			int dia=sc.nextInt();
			System.out.println("Mês: ");
			int mes=sc.nextInt();
			System.out.println("Ano: ");
			int ano=sc.nextInt();
			Data retirada=new Data(dia,mes,ano);
			System.out.println("Data de devolução: ");
			System.out.println("Dia: ");
			int diaDev=sc.nextInt();
			System.out.println("Mês: ");
			int mesDev=sc.nextInt();
			System.out.println("Ano: ");
			int anoDev=sc.nextInt();
			Data devolucao=new Data(diaDev,mesDev,anoDev);
			usuario.emprestarLivro((Cliente) usuario, livro, retirada, devolucao);
		}
	}
	public static void case4(Usuario usuario) {
		if(usuario instanceof Funcionarios) {
			System.out.println("Nome do livro: ");
			String nomeLivro=sc.next();
			System.out.println("Quantidade de páginas: ");
			int qtdPg=sc.nextInt();
			Editora editora=null;
			do {
				System.out.println(Editora.getEditoras());
				System.out.println("Qual a editora? ");
				String nomeEdi  =sc.next();
				editora = Editora.getEditora(nomeEdi);
				
			}while(editora ==null);
			Pessoa autor = null;
			do {
				System.out.println(Autor.listarAutor());
				System.out.println("Qual o autor? ");
				String nomeAutor = sc.next();
				autor=Autor.getAutor(nomeAutor);
			}while(autor == null);
			System.out.println("Data do publicação: \nDia: ");
			int dia =sc.nextInt();
			System.out.println("Mês: ");
			int mes =sc.nextInt();
			System.out.println("Ano: ");
			int ano =sc.nextInt();
			Data data = new Data(dia,mes, ano);
			int i=0;
			int escolha=0;
			do {
			System.out.println("Escolha a categoria: ");
			for(Categoria categoria : Categoria.values()) {
				i++;
				System.out.println(i+" - "+categoria);
			}
			
			escolha =sc.nextInt();
			}while(escolha ==0 || escolha > 8);
			Livro livro =null;
			livro= cadastrarLivro(usuario, escolha, nomeLivro, (Autor) autor, editora, data);
			System.out.println("Deseja adicionar a uma coleção? \n1 - Sim \n2 - Não ");
			int escolhaCole=sc.nextInt();
			if(escolhaCole == 1) {
			Colecao colecao=null;
			do {
				System.out.println("Qual coleção? ");
				System.out.println(Colecao.getColecoes());
				String nomeCole= sc.next();
				colecao= Colecao.getColecao(nomeCole);
				livro.setColocao(colecao);
			}while(colecao == null);
			}
			
		
			
		}
	}
	public static void case5(Usuario usuario) {
		if(usuario instanceof Funcionarios) {
			System.out.println("Cadastrar autor \nNome: ");
			String nome= sc.next();
		    System.out.println(((Funcionarios) usuario).cadastrarAutor(nome));
		
		}
		
	}
    public static void case6(Usuario usuario) {
		if(usuario instanceof Funcionarios) {
			System.out.println("Nome do cliente: ");
			String nome= sc.next();
			System.out.println("Idade: ");
			int idade=sc.nextInt();
			System.out.println("CPF: ");
			String cpf=sc.next();
			System.out.println("Senha: ");
			String senha =sc.next();
		   System.out.println(((Funcionarios) usuario).cadastrarCliente(nome , senha, cpf, idade));
		}
	}
    public static void case7(Usuario usuario) {
    	if(usuario instanceof Funcionarios) {
    	
		System.out.println("Coleções cadastradas: \n"+Colecao.getColecoes());
		System.out.println("Deseja cadastar outra coleção? \n 1- Sim \n 2- Não");
		
		 int escolhaCole=sc.nextInt();
		 if(escolhaCole ==1) {
		 System.out.println("Nome da coleção: ");
		 String NomeColecao=sc.next();
		 System.out.println("Autor: ");
		 System.out.println(Autor.listarAutor());
		 System.out.println("Nome do autor da coleção: ");
		 String nome = sc.next();
		 System.out.println(((Funcionarios) usuario).cadastrarColecao(NomeColecao,nome));
		
		}
    	}
	}
    public static void case8(Usuario usuario) {
    	if(usuario instanceof Funcionarios) {
    		
			System.out.println("Editoras cadastradas: \n"+Editora.getEditoras());
			System.out.println("Deseja cadastar outra editora? \n 1- Sim \n 2- Não");
			 int escolhaEdi=sc.nextInt();
			 if(escolhaEdi == 1) {
			 System.out.println("Nome: ");
			 String nome =sc.next();
			 System.out.println("CNPJ: ");
			 String cnpj =sc.next();
			 System.out.println(((Funcionarios) usuario).cadastrarEditora(nome , cnpj));
			}
    	}
    }
    public static void case9(Usuario usuario) {
  		if(usuario instanceof Funcionarios) {
  			System.out.println("Nome do funcionário: ");
  			String nome= sc.next();
  			System.out.println("Idade: ");
  			int idade=sc.nextInt();
  			System.out.println("CPF: ");
  			String cpf=sc.next();
  			System.out.println("Cargo: ");
  			String cargo =sc.next();
  			System.out.println("Senha: ");
  			String senha =sc.next();
  		   System.out.println(((Funcionarios) usuario).cadastrarFuncionario(nome , senha, cpf, idade, cargo));
  		}
  	}
    public static Livro cadastrarLivro(Usuario usuario, int escolha, String nomeLivro, Autor autor, Editora editora, Data data) {
    	switch(escolha) {
		case 1:{
			Livro livro= new Livro(389, nomeLivro, autor, Categoria.SUSPENSE, editora, data);
			((Funcionarios) usuario).cadastrarLivro(livro);
			return livro;
		}
		case 2:{
			Livro livro= new Livro(389, nomeLivro, autor, Categoria.TERROR, editora, data);
			((Funcionarios) usuario).cadastrarLivro(livro);
			return livro;
		}
		case 3:{
			Livro livro= new Livro(389, nomeLivro, autor, Categoria.POESIA, editora, data);
			((Funcionarios) usuario).cadastrarLivro(livro);
			return livro;
		}case 4:{
			Livro livro= new Livro(389, nomeLivro, autor, Categoria.CRONICA, editora, data);
			((Funcionarios) usuario).cadastrarLivro(livro);
			return livro;
		}case 5:{
			Livro livro= new Livro(389, nomeLivro, autor, Categoria.ROMANCE, editora, data);
			((Funcionarios) usuario).cadastrarLivro(livro);
			return livro;
		}case 6:{
			Livro livro= new Livro(389, nomeLivro, autor, Categoria.CONTO, editora, data);
			((Funcionarios) usuario).cadastrarLivro(livro);
			return livro;
		}case 7:{
			Livro livro= new Livro(389, nomeLivro, autor, Categoria.FICCAO, editora, data);
			livro.addLivro();
			((Funcionarios) usuario).cadastrarLivro(livro);
			return livro;
		}case 8:{
			Livro livro= new Livro(389, nomeLivro, autor, Categoria.FANTASIA, editora, data);
			((Funcionarios) usuario).cadastrarLivro(livro);
			return livro;
		}
		
		}
		return null;
    }
		
	

	}


