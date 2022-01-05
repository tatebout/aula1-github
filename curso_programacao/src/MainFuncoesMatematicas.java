
public class MainFuncoesMatematicas {
	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;

		System.out.println("Raiz quadrada de " + x + " = " + Math.sqrt(x));
		System.out.println("Raiz quadrada de " + y + " = " + Math.sqrt(y));
		System.out.println("Raiz quadrada de 25 = " + Math.sqrt(25.0));
		System.out.println("===================================");
		
		System.out.println(x + " elevado a " + y + " = " + Math.pow(x, y));
		System.out.println(x + " elevado ao quadrado = " + Math.pow(x, 2.0));
		System.out.println("5 elevado ao quadrado = " + Math.pow(5.0, 2.0));
		System.out.println("===================================");
		
		System.out.println("Valor absoluto de " + y + " = " + Math.abs(y));
		System.out.println("Valor absoluto de " + z + " = " + Math.abs(z));
	}
}
