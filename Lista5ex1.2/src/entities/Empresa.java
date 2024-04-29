package entities;

public class Empresa {
	protected String nome;
	protected String cidade;
	protected String estado;
	protected String cnpj;
	protected String cep;
	protected String telefone;
	
	public Empresa() {
	}
	public Empresa(String nome,String cidade,String estado,String cnpj,String cep,String telefone) {
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.cnpj = cnpj;
		this.cep = cep;
		this.telefone = telefone;
	}
	 public String toString() {
		 String resultado;
		 resultado = "Nome: "+this.nome
				 	+"\nCidade: "+this.cidade
				 	+"\nEstado: "+this.estado
				 	+"\nCNPJ: "+this.cnpj
				 	+"\nCEP: "+this.cep
				 	+"\nTelefone: "+this.telefone;
		 return resultado;
	 }
	
	
}
