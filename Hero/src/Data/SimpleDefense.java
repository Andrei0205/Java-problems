package Data;

public class SimpleDefense implements Defense {

	private int defense;

	public SimpleDefense(int defense) {
		super();
		this.defense = defense;
	}

	@Override
	public int calculateDamage(int strength) {
		int damage = strength - defense;
		return damage;

	}
}
