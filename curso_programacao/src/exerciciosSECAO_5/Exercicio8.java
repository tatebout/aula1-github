package exerciciosSECAO_5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		double resultado = 0;

		if (salario <= 2000.0) {
			resultado = 0.0;
		}
		else if (salario <= 3000.0) {
			resultado = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			resultado = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			resultado = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (resultado == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", resultado);
		}

		sc.close();
	}
}
