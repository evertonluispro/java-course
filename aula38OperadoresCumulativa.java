package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula38OperadoresCumulativa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minConsumo;
		double  valor = 50;
		
		System.out.println("Quantos minutos o cliente usou: ");
		minConsumo = sc.nextInt();
		
		if (minConsumo <= 100) {
			System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		}
		else {
			valor += (minConsumo - 100) * 2;
			System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		}
		
		sc.close();

	}

}
