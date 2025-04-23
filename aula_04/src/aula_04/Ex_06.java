package aula_04;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;
        int contador = 0;
        
        String multiplos = ""; // para exibir os multiplos posteriormente

       
        
        do {
            System.out.print("Digite um número:");
            numero = leia.nextInt();

            // Verifica se é múltiplo de 3 (! de zero)
            if (numero != 0 && numero % 3 == 0) {
                soma += numero;
                contador++;
                multiplos += numero + " "; // concatena com a string
            }

        } while (numero != 0);  // para quando digitar zero

        // verifica se houve múltiplos de 3 para evitar divisão por zero
        if (contador > 0) {
            double media = (double) soma / contador;
            
          
            System.out.printf("A média de todos os números múltiplos de 3 é: %.1f\n", media);
        } else {
            System.out.println("\nNenhum número múltiplo de 3 foi digitado.");
        }
        
        	System.out.println("\nNúmeros múltiplos de 3 digitados: " + multiplos);	// exibe os multiplos

        leia.close();
    }
}


