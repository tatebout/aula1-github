package exercicioSecao8;

public class Notas {
	public String name;
	public double a1;
	public double a2;
	public double a3;
	
	public double soma() {
		return a1+a2+a3;
	}
	
	public String nota() {
		if(soma()>60) {
			return "PASS";
		}else {
			return "FAILED";
		}
	}
	
	@Override
	public String toString() {
		return "FINAL GRADE = "+String.format("%.2f%n", soma())+nota();
	}
		
}
