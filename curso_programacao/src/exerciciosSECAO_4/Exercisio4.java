package exerciciosSECAO_4;

import java.util.Locale;
import java.util.Scanner;

public class Exercisio4 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num, horas;
		double salario;

		num = sc.nextInt();
		sc.nextLine();

		horas = sc.nextInt();
		sc.nextLine();

		salario = sc.nextDouble();
		sc.nextLine();

		System.out.printf("NUBMER = %d%n"
				+ "SALARY = U$ %.2f%n", num, (horas * salario));
		
		sc.close();
	}
}
