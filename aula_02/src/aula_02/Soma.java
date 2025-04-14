package aula_02;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero_01 = 2, numero_02 = 2;
		String numeroS_01 = "2", numeroS_02 = "2";
		
		System.out.printf("\n Soma: %d + %d = %d", numero_01, numero_02, (numero_01 + numero_02));
		System.out.printf("\n Concatenacao: %s + %s = %s", numeroS_01, numeroS_02, (numeroS_01 + numeroS_02) );
		
		//atribuicao com soma
		
		System.out.println(numero_01 = numero_01 + 2);
		System.out.println(numero_02 += 2);
		
	}

}
