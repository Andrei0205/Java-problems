package data;

public class CircleCalculator implements CircleCalculatorRole {

	double pi;

	public CircleCalculator(double pi) {
		this.pi = pi;
	}

	@Override
	public double computeArea(double radius) {
		double area = radius * radius * pi;
		return area;
	}

}
