package FolhadePagamento;

import java.util.Scanner;

public class Assalariado {
	Scanner teclado = new Scanner(System.in);
	private String nome;
	private String endereço;
	private String matricula;
	private String metododepagamento;
	private Double salario;
	private CartaodePonto cartao;
	private Sindicato sindicato = new Sindicato();
	public Assalariado() {
		System.out.println("Digite o nome:");
		setNome(teclado.nextLine());
		System.out.println("Digite o endereço:");
		setEndereço(teclado.nextLine());
		System.out.println("Digite a matricula:");
		setMatricula(teclado.nextLine());
		System.out.println("Digite o metedo de pagamento:");
		setMetododepagamento(teclado.nextLine());
		System.out.println("Digite o salário:");
		setSalario(teclado.nextDouble());
		System.out.println("Deseja pertencer ao sindicato:");
		String tipo = teclado.nextLine();
		this.cartao = new CartaodePonto();
		if(tipo.equalsIgnoreCase("sim")) {
			System.out.println("Digite a taxa sindical:");
			sindicato.setTaxabasica(teclado.nextDouble());;
		}
		else {
			setSindicato(null);
		}
	}
	
	public void Mostrardados() {
		System.out.println( "\nNome:" + this.nome +
			   "\nEndereço: " + this.endereço +
			   "\nNumero: " + this.matricula +
			   "\nMetodo de Pagamento:" + this.metododepagamento +
			   "\nSálario:" + this.salario);
			   if(sindicato != null) {
			   System.out.println("\nTaxa Sindical:" + this.sindicato.getTaxabasica() +
		 	   "\nTaxa de Serviços:" + this.sindicato.getTaxadeserviço());
			   }
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereo) {
		this.endereço = endereo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMetododepagamento() {
		return metododepagamento;
	}
	public void setMetododepagamento(String metododepagamento) {
		this.metododepagamento = metododepagamento;
	}
	public CartaodePonto getCartao() {
		return cartao;
	}
	public void setCartao() {
		this.cartao.ponto();
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
		teclado.nextLine();
	}

	public Sindicato getSindicato() {
		return sindicato;
	}
	public void setSindicato(Sindicato sindicato) {
		this.sindicato = sindicato;
	}

	public void settaxaadicional() {
		this.sindicato.setTaxadeserviço();
	}
}