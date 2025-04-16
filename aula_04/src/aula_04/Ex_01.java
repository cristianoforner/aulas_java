package aula_04;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		
		// solicita o primeiro numero
		System.out.println("Digite o primeiro numero(<que o segundo):");
			int primeiroNumero = leia.nextInt();
		
		//SEGUNDO NUMERO
		System.out.println("Digite o segundo numero(>que o primeiro):");
			int segundoNumero = leia.nextInt();
		
		// verifica se o intervalo é válido
	    if (primeiroNumero >= segundoNumero) {
	    	System.out.println("\nIntervalo inválido!");
	    } else {
	    	System.out.println("\nNo Intervalo entre " + primeiroNumero + " e " + segundoNumero + ":");
			
			
		// intervalo primeiro ate o segundo 
		
		for (int i = primeiroNumero; i <= segundoNumero; i++){
			
		// verifica multiplo 3,5
		
		if ( i % 3 == 0 && i % 5 == 0) {
			
		System.out.println(i + " é múltiplo de 3 e 5");
        }	
			
		}
		
		}
		
	    leia.close();
	}

}
