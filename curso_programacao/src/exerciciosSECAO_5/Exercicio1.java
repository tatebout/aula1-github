package exerciciosSECAO_5;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x >= 0) {
			System.out.println("NÃO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		sc.close();
	}
}
