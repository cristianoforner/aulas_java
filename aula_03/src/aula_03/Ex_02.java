package aula_03;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
			System.out.println("Digite um numero:");
			int numero = leia.nextInt();
			
			
			//Estrutura Condicional
			
			//PAR OU IMPAR
			
			if (numero % 2 ==0) { 
				System.out.printf("Numero PAR");
			
			} else { 
				System.out.printf("Numero IMPAR");
			
			}
			
			if (numero >= 0) {
				System.out.printf(" e POSITIVO.");
			}else {
				System.out.printf(" e NEGATIVO.");
				
			}
			
			leia.close();
			
	}

}
