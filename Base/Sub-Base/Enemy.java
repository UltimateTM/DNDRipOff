public class Enemy extends Character {

	public Enemy(int hp, int dex, int spd, int str, int posX) {

		super(hp, dex, spd, str, posX);

	}

 	public void Attack(Character attacker, Character opponent){
    	if(rollDice() > 10){
        opponent.health -= attacker.strength;
    	}
  	}
}

