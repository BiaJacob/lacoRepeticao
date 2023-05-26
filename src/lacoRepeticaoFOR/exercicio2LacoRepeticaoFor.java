package lacoRepeticaoFOR;

import java.util.Scanner;

public class exercicio2LacoRepeticaoFor {

	public static void main(String[] args) {
		
		int numero, numerosPares = 0, numerosImpares = 0;
		
		Scanner leia = new Scanner (System.in);

		System.out.println("Digite 10 números inteiros");
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				numerosPares++;
			}else {
				numerosImpares++;
				
			}
		}
		System.out.println("Total de números pares: " + numerosPares);
		System.out.println("Total de números ímpares: " + numerosImpares);
		
	}

}
