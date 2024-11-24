package curso_programacao;

import java.util.Scanner;

public class aula49Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int login, senha = 2002;
		
		System.out.println("Digite a senha aqui");
		login = sc.nextInt();
		
		while (login != senha) {
			System.out.println("Senha Invalida");
			login = sc.nextInt();
		}

		System.out.println("Acesso Permitido");
		sc.close();
	}

}
