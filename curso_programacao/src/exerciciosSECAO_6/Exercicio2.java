package exerciciosSECAO_6;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		String text = "";
		while (x!=0 && y!=0) {
						
			if (y > 0 && x < 0)
				text = "segundo";
			if (y > 1 && x > 1)
				text = "primeiro";
			if (y < 0 && x < 0)
				text = "terceiro";
			if (y < 0 && x > 0)
				text = "quarto";

			System.out.println(text);
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
}
