package aula_03;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		String produto = "";
		double preco = 0.0;
		
		System.out.println("************************************************************************************");
		System.out.println("                              Cardapio                                  ");
		System.out.println("************************************************************************************");
		System.out.println("		 ");
		System.out.println("	1 - Hot Dog (R$ 10.00 )	 ");
		System.out.println("	2 - X-Salada (R$ 15.00 )	 ");
		System.out.println("	3 - X-Bacon (R$ 18.00 )	 ");
		System.out.println("	4 - Bauru (R$ 12.00 )	 ");
		System.out.println("	5 - Refrigerante (R$ 8.00 )	 ");
		System.out.println("	6 - Suco de Laranja (R$ 13.00 )	 ");
		System.out.println("		 ");
		System.out.println("************************************************************************************");
		System.out.println("Digite o codigo de produto desejado:");
		
		int codigo = leia.nextInt();
		
		System.out.println("Digite a quantidade:");
		int quantidade = leia.nextInt();
		
		switch (codigo) {
		case 1:
			produto = "Hot Dog";
			preco = 10.00;
			break;
			
		case 2:
			produto = "X-Salada";
			preco = 15.00;
			break;
		
		case 3:
			produto = "X-Bacon";
			preco = 18.00;
			break;
		case 4:
			produto = "Bauru";
			preco = 12.00;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8.00;
			break;
		case 6:
			produto = "Suco de Laranja";
			preco = 13.00;
			break;
		default:
			System.out.println("Código inválido!");
			leia.close();
			return; 
	}

		double valorTotal = quantidade*preco;
		
		// final
				System.out.printf("Produto: %s\n", produto);
				System.out.printf("Valor total: R$ %.2f\n", valorTotal);
				
				leia.close();
			}
		}