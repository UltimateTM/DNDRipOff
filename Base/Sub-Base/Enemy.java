public class Enemy extends Character {

  public String name;

	public Enemy(int hp, int dex, int spd, int str, int posX, String nm) {
		super(hp, dex, spd, str, posX);
		this.name = nm;
	}

  public void Attack(Character attacker, Character opponent){
    if(rollDice() > 10){
      //opponent.health - attacker.strength;
    }
  }
}

