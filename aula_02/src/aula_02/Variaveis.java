package aula_02;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner leia = new Scanner(System.in);
		
		
		
		//definicao das variaveis
		System.out.println("Digite o primeiro numero inteiro:");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digite o segundo numero inteiro:");
		int numero_02 = leia.nextInt();
		
		char opcao = 'v';
		boolean menorIdade = true;
		
		System.out.println("Digite seu nome:");
		String nome = leia.next();
		
			
		//definicao constante pi
		final double PI = 3.1415; 
		
		//atribuicao de valor
		//numero_02 = 75;           //pega a proxima variavel
		
		//exibicao de tela
		System.out.printf("Variável numero 1 é igual a: %d\n", numero_01);
		System.out.println("Variável numero 1 é igual a: " + numero_02);		
		System.out.printf("Constante PI é igual a: %.2f \n", PI);		
		System.out.println("Variavel nome em letras maiusculas: " + nome.toUpperCase() );
		
		}

}
