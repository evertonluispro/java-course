package curso_programacao;

import java.util.Scanner;

public class aula49Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tipoCombustivel = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
		
		while (tipoCombustivel != 4) {
			tipoCombustivel = sc.nextInt();
			if (tipoCombustivel == 1) {
				alcool += 1;
			}
			else if (tipoCombustivel == 2) {
				gasolina += 1;
			}
			else if (tipoCombustivel == 3) {
				diesel += 1;
			}
		}
		
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();

	}

}
