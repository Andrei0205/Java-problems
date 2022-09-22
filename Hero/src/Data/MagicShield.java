package Data;

public class MagicShield implements Defense {
	private Defense innerDefense;
	private Luck luck;

	public MagicShield(Defense innerDefense, Luck luck) {
		super();
		this.innerDefense = innerDefense;
		this.luck = luck;
	}

	public int calculateDamage(int strength) {
		if (luck.isLucky()) {
			System.out.println("Magic Shield");
			return innerDefense.calculateDamage(strength) / 2;
		}
		return innerDefense.calculateDamage(strength);
	}

}
