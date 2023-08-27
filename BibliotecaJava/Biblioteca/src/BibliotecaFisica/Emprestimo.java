package BibliotecaFisica;

import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
	
	private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();
	
    private int numeroEmprestimo; 
	private Cliente cliente;
	private Livro livro;
	private Data retirada;
	private Data devolucao;
	private static int qtd;
	
	
	
	public Emprestimo(Cliente cliente, Livro livro, Data retirada, Data devolucao) {
		super();
		qtd++;
		this.numeroEmprestimo = qtd;
		this.cliente = cliente;
		this.livro = livro;
		this.retirada = retirada;
		this.devolucao = devolucao;
	}
	public void add() {
		emprestimos.add(this);
	}
	public static ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public static void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
		Emprestimo.emprestimos = emprestimos;
	}
	public int getNumeroEmprestimo() {
		return numeroEmprestimo;
	}
	public void setNumeroEmprestimo(int numeroEmprestimo) {
		this.numeroEmprestimo = numeroEmprestimo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Data getRetirada() {
		return retirada;
	}
	public void setRetirada(Data retirada) {
		this.retirada = retirada;
	}
	public Data getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(Data devolucao) {
		this.devolucao = devolucao;
	}
	public static int getQtd() {
		return qtd;
	}
	public static void setQtd(int qtd) {
		Emprestimo.qtd = qtd;
	}
	
	
}
