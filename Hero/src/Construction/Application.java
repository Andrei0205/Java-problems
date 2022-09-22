package Construction;

import Data.Game;
import Data.PlayerRole;
import Data.Hero;
import Data.Beast;
import Data.Defense;
import Data.Health;
import Data.Luck;
import Data.MagicShield;
import Data.SimpleDefense;
import Data.SimpleHealth;
import Data.SimpleLuck;
import Data.SimpleSpeed;
import Data.Speed;

public class Application {
	
	PlayerRole Hero;
	PlayerRole Beast;
	private int maxRounds = 20;
	
	Game game;
	
	
	public Application() {
		Health beastHealth = new SimpleHealth(getRandomNumber(70,100));
		int beastStrength = getRandomNumber(70,80);
		Defense beastDefense = new SimpleDefense(getRandomNumber(45,55));
		Luck beastLuck = new SimpleLuck(getRandomNumber(10,30));
		Speed beastSpeed = new SimpleSpeed(getRandomNumber(40,50));
		String beastName = "Beast";
		String heroName = "Orderus";
		Luck heroLuck = new SimpleLuck(getRandomNumber(25,40));
		Defense heroDefense = new MagicShield(beastDefense, heroLuck);
		
		Beast = new Beast(beastName, beastStrength, beastHealth, beastDefense, beastSpeed, beastLuck);
		Hero = new Hero(Beast, heroDefense, heroLuck, heroName);
		
		game = new Game(Hero,Beast,maxRounds);
		 }

	public static void main(String[] args) {

		Application application = new Application();
		application.startGame();

	}

	private void startGame() {
		game.start();
	}

	private int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
