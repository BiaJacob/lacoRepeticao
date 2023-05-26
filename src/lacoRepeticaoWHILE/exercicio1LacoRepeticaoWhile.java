package lacoRepeticaoWHILE;

import java.util.Scanner;

public class exercicio1LacoRepeticaoWhile {

	public static void main(String[] args) {
		
		int idade, pessoasMenoresDe21 = 0, pessoasMaioresDe50 = 0;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite as idades (digite uma idade negativa para encerrar)");
		
		while (true) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade < 0) {
				break;
				}
			if (idade < 21) {
				pessoasMenoresDe21++;
			} else if (idade > 50) {
				pessoasMaioresDe50++;
				
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + pessoasMenoresDe21);
		System.out.println("Total de pessoas maiores de 50 anos: " + pessoasMaioresDe50);
		
	}

}
