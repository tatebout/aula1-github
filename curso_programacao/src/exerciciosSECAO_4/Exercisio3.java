package exerciciosSECAO_4;

import java.util.Scanner;

public class Exercisio3 {
	public static void main(String[] args) {
		
		int A, B, C, D;
		Scanner sc  = new Scanner(System.in);
		
		A = sc.nextInt();
		sc.nextLine();

		B = sc.nextInt();
		sc.nextLine();
		
		C= sc.nextInt();
		sc.nextLine();
		
		D = sc.nextInt();
		sc.nextLine();

		System.out.println("DIFERENÇA = "+ (A*B-C*D));
		
		sc.close();
	}
}
