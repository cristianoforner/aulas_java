package aula_07_EstruturadeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex_01 {

	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        Queue<String> filaClientes = new LinkedList<>();

	        int opcao;

	        do {
	            System.out.println("\n******************************************");
	            System.out.println("               MENU DO BANCO        ");
	            System.out.println("********************************************");
	            System.out.println("1 - Adicionar cliente");
	            System.out.println("2 - Listar todos os clientes");
	            System.out.println("3 - Retirar cliente da Fila");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = leia.nextInt();
	            leia.nextLine(); // Limpar o buffer

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do cliente: ");
	                    String nome = leia.nextLine();
	                    filaClientes.add(nome);
	                    System.out.println(nome + " foi adicionado à fila.");
	                    break;

	                case 2:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        System.out.println("Clientes na fila:");
	                        for (String cliente : filaClientes) {
	                            System.out.println("- " + cliente);
	                        }
	                    }
	                    break;

	                case 3:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila está vazia. Nenhum cliente para chamar.");
	                    } else {
	                        String chamado = filaClientes.poll(); // remove e retorna o primeiro
	                        System.out.println("Chamando e retirando da fila o cliente: " + chamado);
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

