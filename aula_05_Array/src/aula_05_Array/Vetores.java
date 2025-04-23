package aula_05_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		// Vetor de numeros inteiros inicializado com valores
		
		int vetorInteiros [] = {10, 15, 35, 70, 140, 280, 320, 480};
		
		// Vetor de objetos Float tamanho 5
		
		Float[] vetorReal = new Float [5];
		
		//Vetor de Objetos String
		
		
		// Variavel float para armazenar a soma dos elemestos vetorReal
		float soma = 0;
		
		//Laco for tradicional para exibir os dados do vetorInteiros
		for (int indice = 0; indice < vetorInteiros.length; indice ++) {
		
			System.out.printf("\nvetorInteiros [%d] = %d\n", indice, vetorInteiros [indice]);
		
		}
		
		//Laco for tradicional para inserir dados no vetorReal
		for (int indice = 0; indice < vetorInteiros.length; indice ++) {
			System.out.println("");
			System.out.println ("\nDigite um numero Real: ");
			vetorReal [indice] = leia.nextFloat();
		
		}
		// for each
		//Laco de repeticao for each para somar dados do vetorReal
		
		for (var valor : vetorReal) { // Var coloca a variavel conforme o vetor
			
		//System.out.println("Elemento atual: " + valor);
			
		soma += valor;
			
		}
		//exibindo resultado da soma
		System.out.println("Resultado da soma:" + soma);
		
		//ordenando em ordem crescente vetorReal
		Arrays.sort(vetorReal);
		
		//exibindo o vetorReal em ordem crescente
		for (var valor : vetorReal){
		System.out.println("Elemento atual: " + valor);
		}
		
		Arrays.sort(vetorReal, Collections.reverseOrder());
		
		for (var valor : vetorReal){
		System.out.println("Elemento atual: " + valor);
		}
		
		leia.close();
	}

}
