package aula_03;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Digite o nome do colaborador: ");
		String nome = leia.nextLine();
		System.out.println("************************************");
		System.out.println("	1 - Gerente	 ");
		System.out.println("	2 - Vendedor	 ");
		System.out.println("	3 - Supervisor	 ");
		System.out.println("	4 - Motorista	 ");
		System.out.println("	5 - Estoquista ");
		System.out.println("	6 - Tecnico de TI ");
		System.out.println("************************************");
		
		System.out.print("Digite o código do cargo de 1 a 6: ");
		int codigo = leia.nextInt();

		System.out.print("Digite o salário atual: R$ ");
		float salario = leia.nextFloat();

		// Variáveis auxiliares
		String cargo = "";
		float percentual = 0;

		// Identifica o cargo e o percentual
		switch (codigo) {
			case 1:
				cargo = "Gerente";
				percentual = 0.10f;
				break;
			case 2:
				cargo = "Vendedor";
				percentual = 0.07f;
				break;
			case 3:
				cargo = "Supervisor";
				percentual = 0.09f;
				break;
			case 4:
				cargo = "Motorista";
				percentual = 0.06f;
				break;
			case 5:
				cargo = "Estoquista";
				percentual = 0.05f;
				break;
			case 6:
				cargo = "Técnico de TI";
				percentual = 0.08f;
				break;
			default:
				System.out.println("Código inválido.");
				leia.close();
				return;
		}

		// Cálculo do novo salário
		float novoSalario = salario + (salario * percentual);

		// Saída formatada
		System.out.println("\n--- DADOS DO COLABORADOR ---");
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salário reajustado: R$ %.2f\n", novoSalario);

		leia.close();
	}
}