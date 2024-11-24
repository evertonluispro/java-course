package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula30Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159, area, raio;
		
		System.out.println("Digite o valor do raio: ");
		
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("Area= %.4f%n", area);
		
		sc.close();
		

	}

}
