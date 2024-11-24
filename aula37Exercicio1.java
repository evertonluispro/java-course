package curso_programacao;

import java.util.Scanner;

public class aula37Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}

	}

}
