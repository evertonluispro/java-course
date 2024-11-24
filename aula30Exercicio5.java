package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula30Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qte1, qte2;
		double value1, value2, total;
		
		System.out.println("Digite código da peça 1: ");
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade de peça que está levando: ");
		qte1 = sc.nextInt();
		System.out.println("Digite o valor unitário: ");
		value1 = sc.nextDouble();
		System.out.println("Digite código da peça 2: ");
		cod2 = sc.nextInt();
		System.out.println("Digite a quantidade de peça que está levando: ");
		qte2 = sc.nextInt();
		System.out.println("Digite o valor unitário: ");
		value2 = sc.nextDouble();
		
		
		total = value1 * qte1 + value2 * qte2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

	}

}
