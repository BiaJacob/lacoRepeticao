package lacoRepeticaoFOR;

import java.util.Scanner;

public class exercicio1LacoRepeticaoFor {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		numero2 = leia.nextInt();
		
		if (numero1 >= numero2) {
			System.out.println("Intervalo inválido");
			System.exit(0);
		}
		System.out.println("No intervalo entre " + numero1 +" e "
				+ numero2 + ": ");
		for (int i = numero1; i <= numero2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5");
		
			}

		}
	}
}
	
