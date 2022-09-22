package data;

public class RectanglePlot implements Plot {
	private double length;
	private double width;
	
	public RectanglePlot (double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	public double computeArea() { 
		return 2*length + 2*width;
	}
	

}
