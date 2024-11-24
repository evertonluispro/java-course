package curso_programacao;

import java.util.Scanner;

public class aula37Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int entrada, saida,temp;
		
		System.out.println("Que horas você começou a jogar: ");
		entrada = sc.nextInt();
		System.out.println("Que horas você parou de jogar: ");
		saida = sc.nextInt();
		
		if (entrada < saida) {
			temp = saida - entrada;
		}
		else {
			temp = 24 - entrada + saida;
		}
		
		System.out.println("O jogo durou " + temp + " hora(s)");
		
		sc.close();
	}
}

