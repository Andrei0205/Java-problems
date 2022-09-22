package UI;

import java.util.Scanner;
public class KeyboardInput implements Input {
	
	private Scanner scanner;
	
	
		
	public KeyboardInput(Scanner scanner) {
		super();
		this.scanner = scanner;
	}



	@Override
	public int getInt() {
		int nextInt = scanner.nextInt();	
		return nextInt;
	}

}
