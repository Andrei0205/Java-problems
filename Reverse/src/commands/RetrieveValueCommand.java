package commands;

import array.Array;
import reverse.Input;
import reverse.Output;

public class RetrieveValueCommand implements Command {

	private Input input;
	private Output output;
	private Array array;
	
	@Override
	public void process() {
		
		int index = input.getInt();
		int value=array.returnValue(index);
		output.print(value);
		
	}
	

}
