package BibliotecaFisica;

import java.util.ArrayList;

public class Editora {
	
	private static ArrayList<Editora> editoras = new ArrayList<>();

	private String cnpj;
    private String nome;
	
    public Editora(String  cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}
    public void addEditora() {
    	editoras.add(this);
    }
public static Editora getEditora(String nome) {
		
		for(Editora editora: editoras) {
			if(editora.nome.equals(nome)) {
			  return editora;
				
			}
			
		}
		return null;
		
	}

	public static ArrayList<Editora> getEditoras() {
		return editoras;
	}

	public static void setEditoras(ArrayList<Editora> editoras) {
		Editora.editoras = editoras;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "\nEditora: " + nome + " | CNPJ: " + cnpj +"\n";
	}
    
    

	
    
    
}
