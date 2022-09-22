package UI;

import java.util.ArrayList;
import java.util.Map;

public class Menu implements MenuRole {

	private Input input;
	private Map<Integer, Option> map;
	private ArrayList<Option> options;

	
	public Menu(Input input, Map<Integer, Option> map, ArrayList<Option> options) {
		super();
		this.input = input;
		this.map = map;
		this.options = options;
	}
	

	public void start() {
		do {
			display();
			Option option = chooseOption();
			if (option.isExit()) {
				break;
			}
			option.execute();

		} while (true);

	}

	private void display() {
		// TODO Auto-generated method stub
		for (Option option : options) {
			System.out.println(option.getText());
		}

	}

	private Option chooseOption() {
		int code = input.getInt();
		Option option = map.get(code);
		return option;

	}

}
