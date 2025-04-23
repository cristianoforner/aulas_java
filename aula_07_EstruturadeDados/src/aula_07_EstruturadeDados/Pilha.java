package aula_07_EstruturadeDados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);

		//Cria a estrutura de dados pilha
		Stack<String> pilha = new Stack<String> ();
		
		//Adiciona elementos na pilha
		pilha.add("Comunicacao nao violenta");
		pilha.add("IT: A Coisa");
		pilha.add("Senhor dos Aneis");
		pilha.add("Quem pensa Enriquece");
		pilha.add("Codigo Da Vinci");
		pilha.add("Diario de um Banana");
		
		
		//Adicionar um elemento na pilha via teclado
		System.out.println("Digite o Titulo de um livro:");
		pilha.push(leia.nextLine());
		
		System.out.println(pilha);
		
		//Retira um elemento da Pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		//Adiciona um elemento na Pilha
		pilha.push("Roube como um Artista");
		
		System.out.println(pilha);
		
		//Exibe o elemento que esta no topo da Pilha
		System.out.println(pilha.peek());
		
		//Verifica se um elemento existe na Pilha
		System.out.println("O livro Quem pensa Enrique existe na pilha? " + pilha.contains("Quem pensa Enriquece"));
		
		leia.close();
		
	}

}
