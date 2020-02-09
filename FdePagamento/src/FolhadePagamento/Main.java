package FolhadePagamento;

import java.util.Scanner;

public class Main {
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
	
	public static void funcionalidade(String funcionalidade) {
		if(funcionalidade.equalsIgnoreCase("Adicionar funcionario")) {
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
		//A ser refatorada
		else if(funcionalidade.equalsIgnoreCase("Alterar dados")) {
			System.out.println("Digite o tipo de funcionário:");
			tipo = teclado.nextLine();
			if(tipo.equalsIgnoreCase("Assalariado")) {
				Assalariado funcionario = adm.buscaassalariado(adm.listaassalariado);
				if(funcionario != null) {
					adm.alterardados(funcionario);
				}
				else {
					System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
				}
			}
			else if(tipo.equalsIgnoreCase("Comissionado")) {
				Comissionado funcionario = adm.buscacomissionado(adm.listacomissionado);
				if(funcionario != null) {
					adm.alterardados(funcionario);
				}
				else {
					System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
				}
			}
			else if(tipo.equalsIgnoreCase("Horista")) {
				Horista funcionario = adm.buscahorista(adm.listahorista);
				if(funcionario != null) {
					adm.alterardados(funcionario);
				}
				else {
					System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
				}
			}			
		}
		
		else if(funcionalidade.equalsIgnoreCase("Remover funcionario")) {
			System.out.println("Digite o tipo de funcionário:");
			tipo = teclado.nextLine();
			Object demitido = null;
			if(tipo.equalsIgnoreCase("Assalariado")) {
				demitido = adm.buscaassalariado(adm.listaassalariado);
				if(demitido != null) {
					adm.listaassalariado.remove(demitido);
				}
			}
			else if(tipo.equalsIgnoreCase("Comissionado")) {
				demitido = adm.buscacomissionado(adm.listacomissionado);
				if(demitido != null) {
					adm.listacomissionado.remove(demitido);
				}			
			}
			else if(tipo.equalsIgnoreCase("Horista")) {
				demitido = adm.buscahorista(adm.listahorista);
				if(demitido != null) {
					adm.listahorista.remove(demitido);
				}			
			}
			if(demitido == null) {
				System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
			}	
		}
		else if(funcionalidade.equalsIgnoreCase("Lançar cartao de ponto")) {
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
		else if(funcionalidade.equalsIgnoreCase("Lançar taxa de serviço")) {
			System.out.println("Digite o tipo de funcionário:");
			tipo = teclado.nextLine();
			if(tipo.equalsIgnoreCase("Assalariado")) {
				Assalariado funcionario = adm.buscaassalariado(adm.listaassalariado);
				if(funcionario != null) {
					funcionario.settaxaadicional();
				}
				else {
					System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
				}
			}
			else if(tipo.equalsIgnoreCase("Comissionado")) {
				Comissionado funcionario = adm.buscacomissionado(adm.listacomissionado);
				if(funcionario != null) {
					funcionario.settaxaadicional();
				}
				else {
					System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
				}
			}
			else if(tipo.equalsIgnoreCase("Horista")) {
				Horista funcionario = adm.buscahorista(adm.listahorista);
				if(funcionario != null) {
					funcionario.settaxaadicional();
				}
				else {
					System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
				}
			}		

		}
		else if(funcionalidade.equalsIgnoreCase("Lançar resultado de venda")) {
			// Falta
			Comissionado funcionario = adm.buscacomissionado(adm.listacomissionado);
			if(funcionario != null) {
				System.out.println("Insira o valor do produto:");
				Double valordoproduto = teclado.nextDouble();
				funcionario.setSalario(funcionario.getSalario()+(funcionario.getPercentualdecomissao()*valordoproduto));
			}
			else {
				System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
			}			
		}
		
		else if(funcionalidade.equalsIgnoreCase("mostrar dados")) {
			System.out.println("Digite o tipo de funcionário:");
			tipo = teclado.nextLine();
			if(tipo.equalsIgnoreCase("Assalariado")) {
				Assalariado funcionario = adm.buscaassalariado(adm.listaassalariado);
				if(funcionario != null) {
					funcionario.Mostrardados();
				}
				else {
					System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
				}	
			}
			else if(tipo.equalsIgnoreCase("Comissionado")) {
				Comissionado funcionario = adm.buscacomissionado(adm.listacomissionado);
				if(funcionario != null) {
					funcionario.Mostrardados();
				}
				else {
					System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
				}	
			}
			else if(tipo.equalsIgnoreCase("Horista")) {
				Horista funcionario = adm.buscahorista(adm.listahorista);
				if(funcionario != null) {
					funcionario.Mostrardados();
				}
				else {
					System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
				}	
			}
			else {
				System.out.println("Ops ! Ocorreu algum erro, por favor repita a operação");
			}	
		}
	}
}
	