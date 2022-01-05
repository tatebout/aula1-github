package exerciciosSECAO_5;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		String text = "";
				
		if (x < 0.0 || x > 100.0) {
			text = "Fora de intervalo";
		}
		else if (x <= 25.0) {
			text = "Intervalo [0,25]";
		}
		else if (x <= 50.0) {
			text = "Intervalo [25,50]";
		}
		else if (x <= 75.0) {
			text = "Intervalo [50,75]";
		}		
		else {
			text = "Intervalo [75,100]";
		}
		
		System.out.println(text);
		
		sc.close();
	}
}
