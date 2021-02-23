public class Character {

	public int health, dexterity, speed, strength, positionX;
	public Item i;

	public Character(int hp, int dex, int spd, int str, int posX) {
		this.health=hp;
		this.dexterity = dex;
		this.speed = spd;
		this.strength = str;
    this.positionX = posX;
	}

	public void Attack(Character attacker, Character opponent) {
		if(opponent.health - attacker.strength <= 0 )
    		opponent.health = 0;
    	else 
    		opponent.health -= attacker.strength;
	}

	// Probably shouldn't override this method.
	public void Defend(Character attacker, Character opponent) {
		if(attacker.strength >= opponent.strength) {
			Attack(attacker, opponent);
		}
	}

	public boolean Run(Character player) {
		if(player.speed * rollDice() > 15)
      return true;
    else 
      return false;
    
	}

	public int rollDice(){
    	return (int)(Math.random() * 20 + 1);
	}

  

}