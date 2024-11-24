package curso_programacao;

import java.util.Scanner;

public class aula37Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int cod, qte;
		double total = 0;

		System.out.println("Digite o código do produto:");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade:");
		qte = sc.nextInt();
		
		if (cod == 1) {
			total = qte * 4.0;
		}
		else if (cod == 2) {
			total = qte * 4.5;
		}
		else if (cod == 3) {
			total = qte * 5.0;
		}
		else if (cod ==4) {
			total = qte * 2.0;
		}
		else if (cod == 5) {
			total = qte * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n" , total);
		
		sc.close();
	}
}
