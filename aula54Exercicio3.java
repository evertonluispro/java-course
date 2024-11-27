package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula54Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double media = 0;
		
		System.out.println("Digite um valor inteiro:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			media = (a * 2 + b * 3 + c * 5) / 10;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
