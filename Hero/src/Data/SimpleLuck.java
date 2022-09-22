package Data;

public class SimpleLuck implements Luck {
	private int luck;

	
	public SimpleLuck(int luck) {
		super();
		this.luck = luck;
	}

	@Override
	public boolean isLucky() {
		int random = getRandomNumber(0, 100);
		if (random <= luck) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isLuckyer(Luck playerLuck) {
		if (playerLuck.isLessThan(luck)) {
			return true;
		}
		return false;
	}

	private int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	@Override
	public boolean isLessThan(int luck) {
		if (this.luck < luck) {
			return true;
		}
		return false;
	}
}
