package aula_04;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner leia = new Scanner(System.in);

	        int idade;
	        int menores21 = 0;
	        int maiores50 = 0;

	        //  idades até que uma idade negativa seja digitada
	        while (true) {
	            System.out.print("Digite uma idade: ");
	            idade = leia.nextInt();

	            // se a idade for negativa, encerra o loop
	            if (idade < 0) {
	                break;
	            }

	            // verifica se é menor de 21 anos
	            if (idade < 21) {
	                menores21++;
	            }

	            // verifica se é maior de 50 anos
	            if (idade > 50) {
	                maiores50++;
	            }
	        }

	        // exibe os resultados
	        System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
	        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

	        leia.close();
	    }
}



