package aula_02;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero:");
		float n1 = entrada.nextFloat();
		
		System.out.println("Digite o segundo numero:");
		float n2 = entrada.nextFloat();
		
		System.out.println("Digite o terceiro numero:");
		float n3 = entrada.nextFloat();
		
		System.out.println("Digite o quarto numero:");
		float n4 = entrada.nextFloat();
		
		System.out.printf("(%.2f * %.2f) - (%.2f * %.2f) = \nA diferenca e: %.2f", n1, n2, n3, n4, (n1 * n2) - (n3 * n4) ) ;


	}

}
