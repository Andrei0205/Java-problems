package Data;

public class Beast implements PlayerRole {
	private int strength;
	private String name;

	private Health health;
	private Defense defense;
	private Speed speed;
	private Luck luck;

	public Beast(String name,int strength, Health health, Defense defense, Speed speed, Luck luck) {
		super();
		this.name = name;
		this.strength = strength;
		this.health = health;
		this.defense = defense;
		this.speed = speed;
		this.luck = luck;
	}

	@Override
	public void attack(PlayerRole defender) {
		defender.defend(strength);
		System.out.println(name + " has attacked");

	}

	public boolean isDead() {
		return health.isDead();
	}

	@Override
	public boolean isAttackingFirst(PlayerRole otherPlayer) {
		if (otherPlayer.isSlower(speed)) {
			return true;
		}
		if (otherPlayer.hasTheSame(speed)) {
			if (otherPlayer.isLuckyer(luck)) {
				return false;
			}
			return true;
		}
		return false;
	}

	public boolean isSlower(Speed speed) {
		return speed.isSlower(speed);
	}

	public boolean hasTheSame(Speed speed) {
		return speed.hasTheSame(speed);
	}

	@Override
	public void defend(int strength) {
		if (luck.isLucky()) {
			return;
		}
		int damage = defense.calculateDamage(strength);
		System.out.println("Damage done: " + damage);
		health.apply(damage);

	}

	public boolean isLuckyer(Luck luck) {
		return luck.isLuckyer(luck);
	}

}
