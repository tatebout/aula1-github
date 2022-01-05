package exercicioSecao8;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3Notas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas notas = new Notas();
		
		notas.name = sc.nextLine();
		notas.a1 = sc.nextDouble();
		notas.a2 = sc.nextDouble();
		notas.a3 = sc.nextDouble();
		
		System.out.println(notas.toString());
		
		if(notas.soma() < 60) {
			System.out.println("MISSING "+(60-notas.soma())+" POINTS");
		}
	}
}
