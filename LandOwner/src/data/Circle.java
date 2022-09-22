package data;

public class Circle implements Plot {
	
	private double radius;
	private CircleCalculatorRole circleCalculator;
	
	public Circle(double radius, CircleCalculatorRole circleCalculator) {
		this.radius = radius;
		this.circleCalculator = circleCalculator;
	}


	@Override
	public double computeArea() {
		double area = circleCalculator.computeArea(radius); 
		return area;		
	}


}
