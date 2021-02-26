public class Wizard extends Player {
  
	public Wizard() {
		super(12, 15, 17, 12, 0, 10);
	}
//only needs to be within 8 units away to attack, while others need to be within 5
  	public void Attack(Character attacker, Character opponent) {
    if(opponent.positionX - attacker.positionX <= 8){
		if(opponent.health - attacker.strength <= 0 )
    		opponent.health = 0;
    	else 
    		opponent.health -= attacker.strength;
    }
    else System.out.println("get closer... L");
	}
  
}