import java.util.Locale;
import java.util.Scanner;

public class MainScanner {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("String");
		
		String x = sc.next();
		
		System.out.println("Você digitou: "+x);
		
		System.out.println("=================INT=================");
		
		int z = sc.nextInt();
		System.out.println("Número = "+z);
		
		System.out.println("==================DOUBLE================");
		
		double d = sc.nextDouble();
//		System.out.println("Número Double = "+d);
		System.out.printf("Número Double = %.2f%n",d);
		
		System.out.println("==================Char================");
		
		char c = sc.next().charAt(0);
		System.out.println("Você digitou: "+ c);
		
		sc.close();
	}
}