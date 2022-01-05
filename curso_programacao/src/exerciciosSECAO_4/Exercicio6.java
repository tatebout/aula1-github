package exerciciosSECAO_4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi=3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("TRANGULO: %.3f%n", (A*C)/2);
		System.out.printf("CIRCULO: %.3f%n", ((C*C)*pi));
		System.out.printf("TRAPEZIO: %.3f%n", (A + B) / 2.0 * C);
		System.out.printf("QUADRADO: %.3f%n", (Math.pow(B, 2)));
		System.out.printf("RETANGULO: %.3f%n", (A*B));
		
		sc.close();
	}
}
