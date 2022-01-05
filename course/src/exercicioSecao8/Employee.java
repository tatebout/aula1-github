package exercicioSecao8;

public class Employee {
	private Integer id;
	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee() {
		super();
	}

	public Employee(Integer id, String name, double grossSalary) {
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}
	
	public Employee(String name, double grossSalary, double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public Employee(Integer id, String name, double grossSalary, double tax) {
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double netSalary() {
		return grossSalary-tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage/100;
	}
	
	@Override
	public String toString() {
		return id+", "+name+", $ "+String.format("%.2f", netSalary());
	}
}
