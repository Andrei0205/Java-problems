package data;

public class SquarePlot implements Plot {
	private double length;

	
	public SquarePlot (double length) {
		this.length = length;

	}
	
	public double computeArea() { 
		return length*length  ;
	}

}
