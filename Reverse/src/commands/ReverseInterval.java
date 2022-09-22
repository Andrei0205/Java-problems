package commands;


import array.ProcessedArray;
import intervals.Interval;
import intervals.IntervalContract;
import reverse.Input;

public class ReverseInterval implements Command {

	private Input input;
	private ProcessedArray array;
	@Override
	public void process() {
		int leftPos = input.getInt();
		int rightPos = input.getInt();
		
		IntervalContract interval=new Interval(leftPos,rightPos);
		array.addInterval(interval);

	}

}
