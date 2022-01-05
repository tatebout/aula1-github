package exerciciosSECAO_6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			double x = sc.nextDouble();
			double z = sc.nextDouble();
			double y = sc.nextDouble();
			
			System.out.printf("%.1f%n",(x*2+z*3+y*5)/10);
		}
		
		sc.close();
	}
}
