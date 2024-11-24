package curso_programacao;

import java.util.Scanner;

public class aula37Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("Descubra se o número é ímpar ou par: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}

	}

}
