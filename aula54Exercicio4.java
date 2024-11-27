package curso_programacao;

import java.util.Scanner;

public class aula54Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double divisao;
		
		System.out.println("Quantas entradas de números iremos fazer: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			
			divisao = a / b;
			
			if (b == 0) {
				System.out.println("Divisão impossivel");
			}
			else {
				System.out.println(divisao);
			}
		}

		sc.close();
	}

}
