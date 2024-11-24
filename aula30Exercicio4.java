package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula30Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func, hrsTrab;
		double valueHrs, salario;
		
		System.out.println("Digite aqui o número do colaborador: ");
		func = sc.nextInt();
		System.out.println("Digite aqui a quantidade de horas trabalhadas: ");
		hrsTrab = sc.nextInt();
		System.out.println("Digite aqui o valor da hora: ");
		valueHrs = sc.nextDouble();
		
		salario = hrsTrab * valueHrs;
		
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$ %.2f%n", salario );

		sc.close();
		

	}

}
