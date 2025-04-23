package aula_07_EstruturadeDados;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
				
		//Cria a estrutura de dados Fila
		Queue <String> fila = new LinkedList <String> ();
		
		//Adicionamos elementos na fila
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabricio");
		fila.add("Victor");
		
		//Exibiu a fila na tela
		System.out.println(fila);
		
		//Retirou um elemento da fila
		fila.remove(); 
		
		System.out.println(fila);
		
		//Adicionou um elemento no final da fila
		fila.add("Thiago");
		
		System.out.println(fila);
		
		//Exibimos o primeiro elemento da fila
		System.out.println(fila.peek());
		//Exibimos e removemos o primeiro elemento da fila
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		
		System.out.println("A Maria está na fila ? " + fila.contains("Maria"));
		// Se o formato do texto estiver diferente não encontra
		System.out.println("O Carlos está na fila ? " + fila.contains("maria"));
		
		
		System.out.println("O Carlos está na fila ? " + fila.contains("Carlos"));
		
		System.out.println("Qual é o tamanho da fila? " + fila.size());
		
		System.out.println(fila);
		
		
		int contador = 0; 
		
		for (var pessoa : fila) { 
			contador ++;
			if (pessoa.equalsIgnoreCase("maria")) {
				System.out.printf("\nA Maria está em %dº lugar na fila.", contador);
			}
		}
		
	} 

}
