package FolhadePagamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Adm {
	ArrayList<Assalariado> listaassalariado = new ArrayList<>();
	ArrayList<Horista> listahorista = new ArrayList<>();
	ArrayList<Comissionado> listacomissionado = new ArrayList<>();
	static Scanner teclado = new Scanner(System.in);
	
	public static Assalariado buscaassalariado(ArrayList<Assalariado> buscar) {
		System.out.println("Digite o nome do funcionário:");
		String tipo = teclado.nextLine();
		for(Assalariado procurado: buscar) {
			if(tipo.equalsIgnoreCase(procurado.getNome())) {
				return procurado;
			}
		}
		System.out.println("Informação não encontrada");
		return null;
	}
	
	public static Horista buscahorista(ArrayList<Horista> buscar) {
		System.out.println("Digite o nome do funcionário:");
		String tipo = teclado.nextLine();
		for(Horista procurado: buscar) {
			if(tipo.equalsIgnoreCase(procurado.getNome())) {
				return procurado;
			}
		}
		
		return null;
	}
	
	public static Comissionado buscacomissionado(ArrayList<Comissionado> buscar) {
		System.out.println("Digite o nome do funcionário:");
		String tipo = teclado.nextLine();
		for(Comissionado procurado: buscar) {
			if(tipo.equalsIgnoreCase(procurado.getNome())) {
				return procurado;
			}
		}
		
		return null;
	}
	
	public static void alterardados(Assalariado funcionario) {
		System.out.println("Deseja alterar:");
		String tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("nome")) {
			System.out.println("Para");
			funcionario.setNome(teclado.nextLine());
			
		}
		else if(tipo.equalsIgnoreCase("endereço")) {
			System.out.println("Para");
			funcionario.setEndereço(teclado.nextLine());
			
		}
		else if(tipo.equalsIgnoreCase("matricula")) {
			System.out.println("Para");
			funcionario.setMatricula(teclado.nextLine());
			
		}
		else if(tipo.equalsIgnoreCase("metodo de pagamento")) {
			System.out.println("Para");
			funcionario.setMetododepagamento(teclado.nextLine());
			
		}
		else if(tipo.equalsIgnoreCase("salario")) {
			System.out.println("Para");
			funcionario.setSalario(teclado.nextDouble());
			
		}
		else if(tipo.equalsIgnoreCase("Sindicato")) {
			System.out.println("Deseja altera o status do sindicato ou alterar as taxas sindicais");
			tipo = teclado.nextLine();
			if(tipo.equalsIgnoreCase("Status do Sindicato")) {
				if(funcionario != null) {
					funcionario = null;
					}
				else {
					
				}
			}
			else if(tipo.equalsIgnoreCase("taxas sindicais")) {
				
			}
			if(funcionario != null) {
			System.out.println("Para");
			funcionario.setSalario(teclado.nextDouble());	
			}
			else {
				
			}
		}
	}
	
	public static void alterardados(Comissionado funcionario) {
		System.out.println("Deseja alterar:");
		String tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("nome")) {
			System.out.println("Para");
			funcionario.setNome(teclado.nextLine());
			
		}
		if(tipo.equalsIgnoreCase("endereço")) {
			System.out.println("Para");
			funcionario.setEndereço(teclado.nextLine());
			
		}
		if(tipo.equalsIgnoreCase("matricula")) {
			System.out.println("Para");
			funcionario.setMatricula(teclado.nextLine());
			
		}
		if(tipo.equalsIgnoreCase("metodo de pagamento")) {
			System.out.println("Para");
			funcionario.setMetododepagamento(teclado.nextLine());
			
		}
		if(tipo.equalsIgnoreCase("salario")) {
			System.out.println("Para");
			funcionario.setSalario(teclado.nextDouble());
			
		}
	}
	
	public static void alterardados(Horista funcionario) {
		System.out.println("Deseja alterar:");
		String tipo = teclado.nextLine();
		if(tipo.equalsIgnoreCase("nome")) {
			System.out.println("Para");
			funcionario.setNome(teclado.nextLine());
			
		}
		if(tipo.equalsIgnoreCase("endereço")) {
			System.out.println("Para");
			funcionario.setEndereço(teclado.nextLine());
			
		}
		if(tipo.equalsIgnoreCase("matricula")) {
			System.out.println("Para");
			funcionario.setMatricula(teclado.nextLine());
			
		}
		if(tipo.equalsIgnoreCase("metodo de pagamento")) {
			System.out.println("Para");
			funcionario.setMetododepagamento(teclado.nextLine());
			
		}
		if(tipo.equalsIgnoreCase("salario por horas")) {
			System.out.println("Para");
			funcionario.setHorassalarial(teclado.nextDouble());
			
		}
	}
}