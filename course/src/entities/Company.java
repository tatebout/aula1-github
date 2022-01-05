package entities;

public class Company extends TaxPayer{
	
	private int numberOfEmployess;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployess) {
		super(name, anualIncome);
		this.numberOfEmployess = numberOfEmployess;
	}

	public int getNumberOfEmployess() {
		return numberOfEmployess;
	}

	public void setNumberOfEmployess(int numberOfEmployess) {
		this.numberOfEmployess = numberOfEmployess;
	}

	@Override
	public Double tax() {
		return (getAnualIncome() > 10) ? (getAnualIncome()*0.14) : (getAnualIncome()*0.16);
	}
}
