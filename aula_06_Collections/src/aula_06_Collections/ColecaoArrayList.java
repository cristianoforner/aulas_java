package aula_06_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		//Criamos a colecao ArrayList
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		
		//Adicionando valores na Colecao ArrayList
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		//Listando valores da colecao ArrayList
		System.out.println("Digite um numero real:");
		double input = leia.nextDouble();
		
		
		numeros.add(input);
				
		for (var numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("Indice do numero 9.0:" + numeros.indexOf(9.0));
		
		System.out.println("O numero 9.0 existe na colecao?" + numeros.contains(9.0));
		
		System.out.println("Qual valor esta aramazenado no indice 2?" + numeros.get(2));
		
		//Alterar valor de um elemento
		
		numeros.set(2, 10.0);
		
		//Exibe os dados atualizados, atraves do metodo forEach
		System.out.println("Exibe os dados apos a atualizacao");
		numeros.forEach(System.out ::println);
		
		//Excluir um elemento da lista
		numeros.remove(2);
		System.out.println("Exibe os dados apos a exclusao");
		numeros.forEach(System.out ::println);
		
		System.out.println("Qual o tamanho da colecao ? " + numeros.size());
		
		//Limpar colecao
		//numeros.clear();
		
		System.out.println("A colecao esta vazia ? " + numeros.isEmpty());
		
		//Ordenar colecao
		numeros.sort(null);
		
		leia.close();
		
	}

}
