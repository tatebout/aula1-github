package exerciciosSECAO_6;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double z = sc.nextDouble();
			
			if(z==0) {
				System.out.println("Divisão impossível");
			}else {
				
				System.out.println(x/z);
			}
			
		}
		sc.close();
	}

}
