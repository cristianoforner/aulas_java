package aula_07_EstruturadeDados;

import java.util.Scanner;
import java.util.Stack;

public class Ex_02 {

	    public static void main(String[] args) {

	        Scanner leia = new Scanner(System.in);
	        Stack<String> pilhaLivros = new Stack<>();

	        int opcao;

	        do {
	        	System.out.println("\n******************************************");
		        System.out.println("        MENU DE ORGANIZAÇÃO LIVROS       ");
		        System.out.println("********************************************");
	            System.out.println("1 - Adicionar livro");
	            System.out.println("2 - Listar livros");
	            System.out.println("3 - Retirar livro da pilha");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = leia.nextInt();
	            leia.nextLine(); // limpa o buffer

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do livro: ");
	                    String livro = leia.nextLine();
	                    pilhaLivros.push(livro);
	                    System.out.println("Livro \"" + livro + "\" adicionado à pilha.");
	                    break;

	                case 2:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        System.out.println("Livros na pilha:");
	                        for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
	                            System.out.println("- " + pilhaLivros.get(i));
	                        }
	                    }
	                    break;

	                case 3:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia. Nenhum livro para retirar.");
	                    } else {
	                        String retirado = pilhaLivros.pop(); // remove o último elemento
	                        System.out.println("Livro retirado da pilha: " + retirado);
	                    }
	                    break;

	                case 0:
	                    System.out.println("Programa finalizado.");
	                    break;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao != 0);

	        leia.close();
	    }
	}

