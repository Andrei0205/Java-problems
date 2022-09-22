package Data;

public class Game {
	PlayerRole attacker;
	PlayerRole defender;
	int maxRounds;
	private int rounds = 0;

	public Game(PlayerRole firstPlayer, PlayerRole secondPlayer, int maxRounds) {
		super();
		this.attacker = firstPlayer;
		this.defender = secondPlayer;
		this.maxRounds = maxRounds;
		if (secondPlayer.isAttackingFirst(firstPlayer)) {
			switchRole();
		}
	}

	public void start() {
		while (fightIsNotOver()) {
			attacker.attack(defender);
			switchRole();
			rounds++;

		}
		if (weHaveAWinner()) {
			System.out.println(computeWinner());
		}
	}

	private boolean fightIsNotOver() {
		if (attacker.isDead()) {
			return false;
		}
		if (defender.isDead()) {
			return false;
		}
		if (roundsOver()) {
			return false;
		}
		return true;
	}

	public boolean weHaveAWinner() {
		if (roundsOver()) {
			return false;
		}
		return true;
	}

	public PlayerRole computeWinner() {
		if (defender.isDead()) {
			return attacker;
		}
		return defender;
	}

	boolean roundsOver() {
		if (rounds >= 20) {
			return true;
		}
		return false;
	}

	void switchRole() {
		PlayerRole temp;
		temp = attacker;
		attacker = defender;
		defender = temp;
	}

}
