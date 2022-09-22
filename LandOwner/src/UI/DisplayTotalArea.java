package UI;

import data.LandOwner;

public class DisplayTotalArea implements Option {
	
	private LandOwner landOwner;
	private String text;
	
	
	
	public DisplayTotalArea(LandOwner landOwner, String text) {
		super();
		this.landOwner = landOwner;
		this.text = text;
	}

	@Override
	public boolean isExit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void execute() {
		System.out.println("Total area owned:" + landOwner.totalArea());

	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return text;
	}

}
