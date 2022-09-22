package Data;

public class Hero implements PlayerRole {
	private PlayerRole innerBeast;
	private Luck rapidStrike;
	private String name;

	public Hero(PlayerRole innerBeast, Defense magicShield, Luck rapidStrike, String name) {
		super();
		this.innerBeast = innerBeast;
		this.rapidStrike = rapidStrike;
		this.name = name;
	}

	public void attack(PlayerRole defender) {
		innerBeast.attack(defender);
		System.out.println(name + " has attacked");
		if (rapidStrike.isLucky()) {
			innerBeast.attack(defender);
			System.out.println("rapidStrike");
		}
	}

	public void defend(int strength) {
		innerBeast.defend(strength);
	}

	public boolean isDead() {
		return innerBeast.isDead();
	}

	public boolean isAttackingFirst(PlayerRole otherPlayer) {
		return innerBeast.isAttackingFirst(otherPlayer);
	}

	public boolean isSlower(Speed speed) {
		return innerBeast.isSlower(speed);
	}

	public boolean hasTheSame(Speed speed) {
		return innerBeast.hasTheSame(speed);
	}

	public boolean isLuckyer(Luck luck) {
		return innerBeast.isLuckyer(luck);
	}

}
