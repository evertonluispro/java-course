package curso_programacao;

import java.util.Scanner;

public class aula30Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, dif;
		
		System.out.println("Digite o primeiro número: ");
		a = sc.nextInt();
		System.out.println("Digite o Segundo número: ");
		b = sc.nextInt();
		System.out.println("Digite o Terceiro número: ");
		c = sc.nextInt();
		System.out.println("Digite o Quarto número: ");
		d = sc.nextInt();
		
		dif = (a * b) - (c * d);
		
		System.out.println("DIFERENÇA = " + dif);
		
		sc.close();

	}

}
