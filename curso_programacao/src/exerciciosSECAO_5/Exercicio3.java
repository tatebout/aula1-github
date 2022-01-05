package exerciciosSECAO_5;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x%y == 0 || y%x == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não são Multiplos");
		}
	}
}
