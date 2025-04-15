package aula_03;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println(" Digite o primeiro numero:");
		int n1 = leia.nextInt();
		
		System.out.println(" Digite o segundo numero:");
		int n2 = leia.nextInt();
		
		System.out.println(" Digite o terceiro numero:");
		int n3 = leia.nextInt();

		//Estrutura Condicional
		
		if (n1 + n2 > n3) { 
			System.out.println("A Soma A + B e maior do que C.");
		
		} else if (n1 + n2 < n3) { 
			System.out.println("A Soma A + B e menor do que C.");
		
		} else {
			System.out.println("A Soma A + B e igual a C.");
		}
		
		leia.close();
	}

}
