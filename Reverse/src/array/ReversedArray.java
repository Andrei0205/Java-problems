package array;

import intervals.IntervalContract;

public class ReversedArray implements Array {


	private IntervalContract interval;
	private Array array;
	

	public ReversedArray(Array array,IntervalContract interval) {
		this.array=array;
		this.interval=interval;
	}


	@Override
	public int returnValue(int index) {
		if (interval.isOutsideInterval(index))
			return array.returnValue(index);
		else {
			int newIndex = interval.computeIndex(index);
			return array.returnValue(newIndex);
		}
	}

	

}
