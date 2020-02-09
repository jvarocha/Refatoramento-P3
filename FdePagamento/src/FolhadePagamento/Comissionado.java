package FolhadePagamento;

import java.util.Scanner;

public class Comissionado {
	Scanner teclado = new Scanner(System.in);
	private String nome;
	private String endereço;
	private String matricula;
	private String metododepagamento;
	private Double salario;
	private Double percentualdecomissao;
	private CartaodePonto cartao;
	private Sindicato sindicato = new Sindicato();
	
	public Comissionado(){
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
		System.out.println("Digite o percentual de comissão:");
		setPercentualdecomissao(teclado.nextDouble());
		System.out.println("Deseja pertencer ao sindicato:");
		teclado.nextLine();
		String tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("sim")) {
			System.out.println("Digite a taxa sindical:");
			sindicato.setTaxabasica(teclado.nextDouble());;
		}
		else {
			sindicato = null;
		}
	}
	
	public void Mostrardados() {
		System.out.println( "\nNome:" + this.nome +
			   "\nEndereço: " + this.endereço +
			   "\nNumero: " + this.matricula +
			   "\nCartão de Ponto:" + this.metododepagamento +
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
	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
	}
	public void settaxaadicional() {
		this.sindicato.setTaxadeserviço();
	}
	public Double getPercentualdecomissao() {
		return percentualdecomissao;
	}
	public void setPercentualdecomissao(Double percentualdecomissao) {
		this.percentualdecomissao = percentualdecomissao;
	}
}