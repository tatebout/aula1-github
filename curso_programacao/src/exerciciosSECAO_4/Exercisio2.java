package exerciciosSECAO_4;

import java.util.Locale;
import java.util.Scanner;

public class Exercisio2 {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio, tt;
		
		raio = sc.nextDouble();
		tt = 3.14159;
		
		System.out.printf("A = %.4f",(tt*Math.pow(raio, 2)));
		
		sc.close();
	}
}
