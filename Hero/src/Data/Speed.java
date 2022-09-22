package Data;

public interface Speed {

	boolean isSlower(Speed speed);

	boolean hasTheSame(Speed speed);

	boolean isLessThan(int mySpeed);

	boolean isEqual(int mySpeed);

}