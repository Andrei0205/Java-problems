package UI;

public class Exit implements Option {
	
	private String text;
	
	public Exit(String text) {
		super();
		this.text = text;
	}

	@Override
	public boolean isExit() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return text;
	}

}
