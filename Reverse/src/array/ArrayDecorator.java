package array;

import intervals.Interval;
import intervals.IntervalContract;

public class ArrayDecorator implements Array,ProcessedArray{

	private Array array;

	@Override
	public int returnValue(int index) {
		return array.returnValue(index);
	}

	@Override
	public void addInterval(IntervalContract interval) {
		array=new ReversedArray(array,interval);
		
	}
	

}
