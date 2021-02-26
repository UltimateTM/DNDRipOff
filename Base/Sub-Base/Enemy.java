public class Enemy extends Character {

	public Enemy(int hp, int dex, int spd, int str, int posX) {

		super(hp, dex, spd, str, posX);

	}
//Enemy rolls 20 sided dice, if the roll is over 10, they successfully attack
 	public void Attack(Character attacker, Character opponent){
    	if(rollDice() > 10){
        if(opponent.health - attacker.strength <= 0)
        opponent.health = 0;
        else
        	opponent.health -= attacker.strength;
          	System.out.println("Youve been mrkd");
      	} else {
        	System.out.println("Enemy Missed, Mrk Him");
		}
  	}
//The direction the enemy moves depends on the distance from the character
	public void MoveForward(Character p) {
		if(this.positionX - p.positionX <= 5) {
			this.MoveBackward(this);
		} else {
			this.positionX -= this.speed;
		}
	}
//allows the enemy to move backwards
	public void MoveBackward(Character p) {
		this.positionX += this.speed;
	}
}

