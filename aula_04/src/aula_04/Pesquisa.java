package aula_04;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int idade, esporte, 
			futebol = 0, voleibolM18 = 0, basqueteMn18 = 0, 
			totalRespostas = 0;
		
		long somaIdades = 0;
		
		double media = 0;
		
		String continua = "S";
		
		
		
		while (continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a sua idade:");
			idade = leia.nextInt();
			
			System.out.println("Digite seu esporte favorito:\n 1-Futebol \n 2-Voleibol \n 3-Basquete \n 4-Outros");
			esporte = leia.nextInt();
			
			//quantas pessoas gostam de futebol
			
			if (esporte == 1) {
				futebol ++;
			}
			
			//quantas pessoas gostam de voleibol e >18 anos
			
			if (esporte == 2 && idade > 18) {
				voleibolM18 ++;
			}
			//quantas pessoas gostam de basquete e <18 anos
			
			if (esporte == 3 && idade < 18) {
				basqueteMn18 ++;
			}
			
			totalRespostas ++;
			
			somaIdades += idade;
			
			System.out.println("Deseja continuar (S/N)?");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
		}
		
		media = (double) somaIdades / totalRespostas;
				
		System.out.printf("\n Total de pessoas que gostam de Futebol: %d", futebol);
		System.out.printf("\n Total de pessoas que gostam de Voleibol >18: %d", voleibolM18);
		System.out.printf("\n Total de pessoas que gostam de Basquete <18: %d", basqueteMn18);
		System.out.printf("\n Media de idade: %.2f", media);
		
		
		
		leia.close();

	}

}
