package exercicioSecao14;

import entities.Product2;

public class ImportedProduct extends Product2{

	private Double customsFree;
	
	public ImportedProduct(String name, double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}
	
	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}

	public Double totalPrice() {
		return getPrice() + customsFree;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+" $ "
				+String.format("%.2f", totalPrice())
				+" (Customs free: $ "
				+String.format("%.2f", customsFree)
				+")";
	}
}
