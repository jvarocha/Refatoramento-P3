package FolhadePagamento;

import java.util.Scanner;

public class Sindicato {
	private double taxabasica;
	private double taxadeserviço;
	Scanner teclado = new Scanner(System.in);
	public double getTaxabasica() {
		return taxabasica;
	}
	public void setTaxabasica(double taxabasica) {
		this.taxabasica = taxabasica;
	}
	public double getTaxadeserviço() {
		return taxadeserviço;
	}
	public void setTaxadeserviço() {
		System.out.println("Digite o valor da taxa adicional:");
		taxadeserviço = teclado.nextDouble();
		teclado.nextLine();
	}
}
