package exerciciosSECAO_5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		String text = "";
		
		if(x==0 || y==0) text = "Origem";
		if(y>=0.1 || x<0) text = "Q2";
		if(y>=0.1 || x>=0.1) text = "Q1";
		if(y<0 || x<0) text = "Q3";
		if(x<0 || x>0) text = "Q4";
		
		System.out.println(text);
		
		sc.close();
	}
}
