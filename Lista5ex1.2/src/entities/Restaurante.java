package entities;

public class Restaurante extends Empresa {
	protected String tipoDeComida;
	protected double precoMedio;
	protected long numeroDeMesas;
	protected long capacidade;
	
	public Restaurante() {
		super();
	}
	public Restaurante(String nome,String cidade,String estado,String cnpj,String cep,String telefone,String tipo,double medio,long mesas,long capacidade) {
		super(nome,cidade,estado,cnpj,cep,telefone);
		this.tipoDeComida = tipo;
		this.precoMedio = medio;
		this.numeroDeMesas = mesas;
		this.capacidade = capacidade;
	}
	public String toString() {
		 String resultado;
		 resultado = "Nome: "+super.nome
				 	+"\nCidade: "+super.cidade
				 	+"\nEstado: "+super.estado
				 	+"\nCNPJ: "+super.cnpj
				 	+"\nCEP: "+super.cep
				 	+"\nTelefone: "+super.telefone
		 			+"\nTipo de comida: "+this.tipoDeComida
		 			+"\nPreço Médio: "+this.precoMedio
		 			+"\nNúmero de Mesas: "+this.numeroDeMesas
		 			+"\nCapacidade de clientes: "+this.capacidade;
		 return resultado;
}
}
