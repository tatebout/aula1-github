package exerciciosSECAO_6;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if(x%1==0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
