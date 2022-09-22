package Data;

public interface PlayerRole {

	void attack(PlayerRole defender);
	
	void defend(int strength);
	
	boolean isDead();

	boolean isAttackingFirst(PlayerRole otherPlayer);

	boolean isSlower(Speed speed);

	boolean hasTheSame(Speed speed);

	boolean isLuckyer(Luck luck);


	

}
