package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula26EntradaDeDados {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n",  x);
		
		
		sc.close();

	}

}
