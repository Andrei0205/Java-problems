package Data;

public interface Luck {

	boolean isLucky();
	
	boolean isLuckyer(Luck playerLuck);

	boolean isLessThan(int luck);
}
