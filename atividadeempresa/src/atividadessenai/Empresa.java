package atividadessenai;

import java.util.Scanner;

public class Empresa {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o nome do gerente:");
        String nomeGerente = scanner.nextLine();
		
		System.out.println("Informe o Id do Gerente: ");
		int idGerente = scanner.nextInt();
		
		System.out.println("Informe o salário base do Gerente: ");
		Double salarioGerente = scanner.nextDouble();
		
		System.out.println("Informe o bonus anual do Gerente: ");
		Double bonus = scanner.nextDouble();
		
		Gerente gerente = new Gerente (nomeGerente, idGerente, salarioGerente, bonus);
		
		System.out.println("Informe o nome do operário:");
        scanner.nextLine();
        String nomeOperario = scanner.nextLine();
		
		System.out.println("Informe o Id do Operario: ");
		int idOperario = scanner.nextInt();
		
		System.out.println("Informe o salario base do Operario: ");
		Double salarioOperario = scanner.nextDouble();
		
		System.out.println("Informe quantas horas trabalhadas o operario teve: ");
		int horastrabalhadas = scanner.nextInt();
		
		System.out.println("Informe quanto é o valor da hora na empresa: ");
		int horas = scanner.nextInt();
		
		Operario operario = new Operario (nomeOperario, idOperario, salarioOperario, horastrabalhadas, horas);
		
		 System.out.println("Nome: " + gerente.getNome() + " seu salário é de: " + gerente.calcularSalario());
	     System.out.println("Nome: " + operario.getNome() + " seu salário é de: " + operario.calcularSalario());
		
	}
}
