package curso_programacao;

import java.util.Scanner;

public class aula54Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int in = 0;
		int out = 0;
		
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
