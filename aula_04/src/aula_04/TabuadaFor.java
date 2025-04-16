package aula_04;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro:");
		int numero = leia.nextInt();
		
		for(int contador = 1; contador <= 10; contador ++ ) {
			System.out.printf("\n %d x %d = %d", numero, contador, (numero * contador) );			
			
		}
		
				
		leia.close();

	}

}
