package aula_02;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o salario bruto:");
		float salariobruto = entrada.nextFloat();
		
		System.out.println("Digite o adicional noturno:");
		float noturno = entrada.nextFloat();
		
		System.out.println("Digite as horas extras:");
		float extra = entrada.nextFloat();
		
		System.out.println("Digite o desconto:");
		float descontos = entrada.nextFloat();
		
		System.out.printf("%.2f + %.2f + %.2f - %.2f = \nSalario liquido: %.2f", 
				salariobruto, noturno, extra, descontos, (salariobruto + noturno + (extra * 5) - descontos));

		
	}

}
