package entities;

public class RestauranteAQuilo extends Restaurante {
	private double pesoQuilo;
	private String adicionais;

	public RestauranteAQuilo() {
		super();
	}

	public RestauranteAQuilo(String nome, String cidade, String estado, String cnpj, String cep, String telefone,
			String tipo, double medio, long mesas, long capacidade, double pesoQuilo, String adicionais) {
		super(nome, cidade, estado, cnpj, cep, telefone, tipo, medio, mesas, capacidade);
		this.pesoQuilo = pesoQuilo;
		this.adicionais = adicionais;
	}

	public String toString() {
		String resultado;
		resultado = "Nome: " + super.nome + "\nCidade: " + super.cidade + "\nEstado: " + super.estado + "\nCNPJ: "
				+ super.cnpj + "\nCEP: " + super.cep + "\nTelefone: " + super.telefone + "\nTipo de comida: "
				+ super.tipoDeComida + "\nPreço Médio: " + super.precoMedio + "\nNúmero de Mesas: "
				+ super.numeroDeMesas + "\nCapacidade de clientes: " + super.capacidade + "\nPeso em quilos consumidos: "+ this.pesoQuilo
				+ "\nAdicionais: " + this.adicionais;
		return resultado;

	}
}
