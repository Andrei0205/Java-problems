package Data;

public class SimpleHealth implements Health {
	private int health;

	public SimpleHealth(int health) {
		super();
		this.health = health;
	}

	@Override
	public void apply(int damage) {
		health = health - damage;
		System.out.println("Defender's health left: " + health);

	}

	@Override
	public boolean isDead() {
		if (health <= 0) {
			return true;
		}
		return false;
	}
}
