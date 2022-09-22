package intervals;

public class Interval implements IntervalContract {
	private int leftPos, rightPos;
	


	public Interval(int leftPos, int rightPos) {
		super();
		this.leftPos = leftPos;
		this.rightPos = rightPos;
	}

	@Override
	public int computeIndex(int index) {
		
		int lenght=index-leftPos;
		return rightPos-lenght;
	}

	@Override
	public boolean isOutsideInterval(int index) {
		
		return index<leftPos||index>rightPos;
	}
}
