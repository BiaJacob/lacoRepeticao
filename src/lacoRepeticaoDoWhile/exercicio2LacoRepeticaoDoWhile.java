package lacoRepeticaoDoWhile;

import java.util.Scanner;

public class exercicio2LacoRepeticaoDoWhile {

	public static void main(String[] args) {
		
		int numero, soma = 0, quantidade = 0;
		double media; 
		
		
		Scanner leia = new Scanner (System.in);
		
		int contador = 0;
		do {
		System.out.println("Digite um número inteiro (0 para sair):");
		numero = leia.nextInt();
		
		if (numero % 3 == 0 && numero != 0) {
			soma += numero;
			contador ++;
			
		}
	} while (numero != 0);
		if (contador > 0) {
			media = (double) soma / contador;
			System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		}else {
			System.out.println("Nenhum número múltiplo de 3 foi digitado.");
			
		}
		}

}
