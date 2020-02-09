package FolhadePagamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRefa {
	static Scanner teclado = new Scanner(System.in);
	static String tipo;
	static Adm adm = new Adm();
	public static void main(String agrs[]) {
		String funcionalidade = "iniciar";
		while(funcionalidade.equalsIgnoreCase("fechar") != true) {
		System.out.println("Digite o tipo de funcionalidade:");
		funcionalidade = teclado.nextLine();
		funcionalidade(funcionalidade);
		}
	}
	//Refatorado
	public static void funcionalidade(String funcionalidade) {
		if(funcionalidade.equalsIgnoreCase("Adicionar funcionario")) {
			adicionarfuncionario();		
		}
		else if(funcionalidade.equalsIgnoreCase("Remover funcionario")) {
			removerfuncionario();	
		}
		else if(funcionalidade.equalsIgnoreCase("Lançar cartao de ponto")) {
			lançarcartaodeponto();
		}
		else if(funcionalidade.equalsIgnoreCase("Lançar taxa de serviço")) {
			lançartaxadeserviço();
		}
		else if(funcionalidade.equalsIgnoreCase("Lançar resultado de venda")) {
			lançarresultadodevenda();
		}
		else if(funcionalidade.equalsIgnoreCase("Alterar dados")) {
			alterardados();
		}
		else if(funcionalidade.equalsIgnoreCase("mostrar dados")) {
			mostrardados();
		}
	}
	//
	//Refatorada
	public static void alterardados() {
		System.out.println("Digite o tipo de funcionário:");
		tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("Assalariado")) {
			adm.alterardados(adm.buscaassalariado(adm.listaassalariado));		
		}
		else if(tipo.equalsIgnoreCase("Comissionado")) {
			adm.alterardados(adm.buscacomissionado(adm.listacomissionado));
		}
		else if(tipo.equalsIgnoreCase("Horista")) {
			adm.alterardados(adm.buscahorista(adm.listahorista));
		}
	}
	//
	public static void adicionarfuncionario(){
		
		System.out.println("Digite o tipo de funcionário:");
		String tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("Assalariado")) {
			Assalariado novo = new Assalariado();
			adm.listaassalariado.add(novo);
		}
		else if(tipo.equalsIgnoreCase("Comissionado")) {
			Comissionado novo = new Comissionado();
			adm.listacomissionado.add(novo);
		}
		else if(tipo.equalsIgnoreCase("Horista")) {
			Horista novo = new Horista();
			adm.listahorista.add(novo);
		}
	}
	
	public static void removerfuncionario() {
		
		System.out.println("Digite o tipo de funcionário:");
		tipo = teclado.nextLine();
		Object demitido = null;
		if(tipo.equalsIgnoreCase("Assalariado")) {
			demitido = adm.buscaassalariado(adm.listaassalariado);
			adm.listaassalariado.remove(demitido);
		}
		else if(tipo.equalsIgnoreCase("Comissionado")) {
			demitido = adm.buscacomissionado(adm.listacomissionado);
			adm.listacomissionado.remove(demitido);			
		}
		else if(tipo.equalsIgnoreCase("Horista")) {
			demitido = adm.buscahorista(adm.listahorista);
			adm.listahorista.remove(demitido);			
		}
		if(demitido == null) {
			avisoerro();
		}
	}
	
	
	
	public static void lançarcartaodeponto(){
		
		System.out.println("Digite o tipo de funcionário:");
		tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("Assalariado")) {
			Assalariado funcionario = adm.buscaassalariado(adm.listaassalariado);
			if(funcionario != null) {
				funcionario.setCartao();
			}
		}
		else if(tipo.equalsIgnoreCase("Comissionado")) {
			Comissionado funcionario = adm.buscacomissionado(adm.listacomissionado);
			if(funcionario != null) {
				funcionario.setCartao();
			}			
		}
		else if(tipo.equalsIgnoreCase("Horista")) {
			Horista funcionario = adm.buscahorista(adm.listahorista);
			if(funcionario != null) {
				funcionario.setCartao();
			}			
		}
	}
	
	public static void lançartaxadeserviço(){
		
		System.out.println("Digite o tipo de funcionário:");
		tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("Assalariado")) {
			Assalariado funcionario = adm.buscaassalariado(adm.listaassalariado);
			if(funcionario != null) {
				funcionario.settaxaadicional();
			}
			else {
				avisoerro();
			}
		}
		else if(tipo.equalsIgnoreCase("Comissionado")) {
			Comissionado funcionario = adm.buscacomissionado(adm.listacomissionado);
			if(funcionario != null) {
				funcionario.settaxaadicional();
			}
			else {
				avisoerro();
			}
		}
		else if(tipo.equalsIgnoreCase("Horista")) {
			Horista funcionario = adm.buscahorista(adm.listahorista);
			if(funcionario != null) {
				funcionario.settaxaadicional();
			}
			else {
				avisoerro();
			}
		}
	}
	
	public static void lançarresultadodevenda(){
		Comissionado funcionario = adm.buscacomissionado(adm.listacomissionado);
		if(funcionario != null) {
			System.out.println("Insira o valor do produto:");
			Double valordoproduto = teclado.nextDouble();
			funcionario.setSalario(funcionario.getSalario()+(funcionario.getPercentualdecomissao()*valordoproduto));
		}
		else {
			avisoerro();
		}			
	}
	
	public static void mostrardados() {
		System.out.println("Digite o tipo de funcionário:");
		tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("Assalariado")) {
			Assalariado funcionario = adm.buscaassalariado(adm.listaassalariado);
			if(funcionario != null) {
				funcionario.Mostrardados();
			}
			else {
				avisoerro();
			}	
		}
		else if(tipo.equalsIgnoreCase("Comissionado")) {
			Comissionado funcionario = adm.buscacomissionado(adm.listacomissionado);
			if(funcionario != null) {
				funcionario.Mostrardados();
			}
			else {
				avisoerro();
			}	
		}
		else if(tipo.equalsIgnoreCase("Horista")) {
			Horista funcionario = adm.buscahorista(adm.listahorista);
			if(funcionario != null) {
				funcionario.Mostrardados();
			}
			else {
				avisoerro();
			}	
		}
		avisoerro();
	}
	
	public static void avisoerro() {
		System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");		
	}
}
	