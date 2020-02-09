package FolhadePagamento;

import java.util.Scanner;

public class Horista {
	Scanner teclado = new Scanner(System.in);
	private String nome;
	private String endereço;
	private String matricula;
	private String metododepagamento;
	private Double salario;
	private Double horassalarial;
	private int horastrabalhadas;
	private int horasextras;
	private CartaodePonto cartao;
	private Sindicato sindicato = new Sindicato();
	
	public Horista() {
		System.out.println("Digite o nome:");
		setNome(teclado.nextLine());
		System.out.println("Digite o endereço:");
		setEndereço(teclado.nextLine());
		System.out.println("Digite a matricula:");
		setMatricula(teclado.nextLine());
		System.out.println("Digite o metedo de pagamento:");
		setMetododepagamento(teclado.nextLine());
		System.out.println("Digite o salário por horas:");
		setHorassalarial(teclado.nextDouble());
		System.out.println("Deseja pertencer ao sindicato:");
		String tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("sim")) {
			System.out.println("Digite a taxa sindical:");
			sindicato.setTaxabasica(teclado.nextDouble());;
		}
		else {
			sindicato = null;
		}
		this.horasextras = 0;
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
	public void setSalario() {
		this.salario = this.horassalarial*this.horastrabalhadas + this.horassalarial*this.horasextras*1.5;
	}
	public int getHorastrabalhadas() {
		return horastrabalhadas;
	}
	//Parte a ser Refatorada
	public void setHorastrabalhadas() {
		this.horastrabalhadas = (cartao.getHorasfinal()*60)+cartao.getMinutosfinal();
		this.horastrabalhadas = this.horastrabalhadas - ((cartao.getHorasinicial()*60)+cartao.getMinutosinicial());
		this.horastrabalhadas = this.horastrabalhadas/60;
		if(this.horastrabalhadas>8) {
			this.horasextras = this.horastrabalhadas - 8;
			this.horastrabalhadas = 8;
		}
	}
	public Double getHorassalarial() {
		return horassalarial;
	}
	public void setHorassalarial(Double horassalarial) {
		this.horassalarial = horassalarial;
		teclado.nextLine();
	}
	
	public void settaxaadicional() {
		this.sindicato.setTaxadeserviço();
	}
}