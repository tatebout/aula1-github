package exercicioSecao14;

import entities.TaxPayer;

public class Individual extends TaxPayer{

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double rendaAnual, Double healthExpenditures) {
		super(name, rendaAnual);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		return (getAnualIncome() < 20000.0) ? (getAnualIncome()*0.15)-(healthExpenditures*0.5) : (getAnualIncome()*0.25)-(healthExpenditures*0.5);
	}

}
