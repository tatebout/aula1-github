package exerciciosSECAO_5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0;

		if (x == 1)
			total = 4 * quantidade;
		if (x == 2)
			total = 4.5 * quantidade;
		if (x == 3)
			total = 5 * quantidade;
		if (x == 4)
			total = 2 * quantidade;
		if (x == 5)
			total = 1.5 * quantidade;

		System.out.printf("Total : %.2f%n", total);
	}
}
