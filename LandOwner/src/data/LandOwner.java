package data;

import java.util.ArrayList;

public class LandOwner {
	
	private ArrayList<Plot> plots = new ArrayList<Plot>();
		
	public void addPlot(Plot plot) {
		plots.add(plot);
	}

	
	public void removePlot(int pos) {
		this.plots.remove(pos-1);
	}
	
	
	public double totalArea() { 
		float area = 0;
		
		for(Plot i: plots) {
			area += i.computeArea();
		}
		
		return area;
	}
	
	
}
