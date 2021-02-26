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

	public Character(){}

  public int getPlayerHP() {
    return this.health;
  }

  //attacks an opponent
	public void Attack(Character attacker, Character opponent) {
    	if(opponent.positionX - attacker.positionX <= 5){
			if(opponent.health - attacker.strength <= 0 )
    			opponent.health = 0;
    		else 
    			opponent.health -= attacker.strength;
    	}
    	else
			System.out.println("get closer... L");
	}

	// Probably shouldn't override this method.
	public void Defend(Character attacker, Character opponent) {
		if(attacker.strength >= opponent.strength) {
			Attack(attacker, opponent);
		}
    	else
      	Attack(opponent, attacker);
	}

  public void MoveForward(Character p){
    p.positionX += 3;
  }

  public void MoveBackward(Character p){
    p.positionX -= 3;
 	}

  public void RunForward(Character p){
    p.positionX += p.speed;
  }

  public void RunBackward(Character p){
    p.positionX -= p.speed;
 	}

	public void Run(Character attacker, Character opponent) {

    	if(attacker.speed >= opponent.speed)
      		Attack(attacker, opponent);
    	else
			  Attack(opponent, attacker);
	}

	public int rollDice(){
    	return (int) (Math.random() * 20 + 1);
	}

  public int getDistance(Character p, Character e){
    int distance = p.positionX - e.positionX;
    return distance;
  }

	public boolean isDead() {
		if(this.health <=0) 
			return true;
		 else 
			return false;
	}

}