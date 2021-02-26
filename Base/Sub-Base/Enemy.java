public class Enemy extends Character {

	public Enemy(int hp, int dex, int spd, int str, int posX) {

		super(hp, dex, spd, str, posX);

	}

 	public void Attack(Character attacker, Character opponent){
    	if(rollDice() > 10)
        opponent.health -= attacker.strength;
      else
        System.out.println("Enemy Missed, Mrk Him");
  	}

	public void MoveForward(Character p) {
		if(this.positionX - p.positionX <= 5) {
			this.MoveBackward(this);
		} else {
			this.positionX -= this.speed;
		}
	}

	public void MoveBackward(Character p) {
		this.positionX += this.speed;
	}
}

