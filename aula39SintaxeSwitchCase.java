package curso_programacao;

import java.util.Scanner;

public class aula39SintaxeSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String dia;
		
		System.out.println("Digite um número de 1 a 7 e veja qual dia da semana ele corresponde: ");
		int x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor invalido";
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
