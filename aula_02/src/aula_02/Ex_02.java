package aula_02;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota:");
		float nota1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		float nota2 = entrada.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		float nota3 = entrada.nextFloat();
		
		System.out.println("Digite a quarta nota:");
		float nota4 = entrada.nextFloat();
		
		System.out.printf("%.2f + %.2f + %.2f + %.2f = \nA nota final e: %.2f", nota1, nota2, nota3, nota4, (nota1 + nota2 + nota3 + nota4)/4);

	}

}
