package data;


public class TaxCalculator implements TaxCalculatorRole {

	private double taxFee;

	public TaxCalculator(double taxFee) {
		super();
		this.taxFee = taxFee;

	}

	public double haveToPay(LandOwner pers) {
		double area = pers.totalArea();
		double tax = area * taxFee;
		return tax;
	}

}
