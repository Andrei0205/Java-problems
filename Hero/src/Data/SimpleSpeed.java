package Data;

public class SimpleSpeed implements Speed {
	private int mySpeed;

	public SimpleSpeed(int speed) {
		super();
		this.mySpeed = speed;
	}

	@Override
	public boolean isSlower(Speed speed) {
		if (speed.isLessThan(mySpeed)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean hasTheSame(Speed speed) {
		if (speed.isEqual(mySpeed)) {
			return true;
		}
		return false;
	}

	public boolean isLessThan(int mySpeed) {
		if (mySpeed < this.mySpeed) {
			return true;
		}
		return false;
	}

	public boolean isEqual(int mySpeed) {
		if (mySpeed == this.mySpeed) {
			return true;
		}
		return false;
	}

}
