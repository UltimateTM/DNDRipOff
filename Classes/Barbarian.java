public class Barbarian extends Player {

	

	public Barbarian() {
		super(17, 15, 15, 18, 0, 10);
	}

  public void Defend(Character attacker, Character opponent) {
		if(attacker.strength >= opponent.strength + 2) {
			Attack(attacker, opponent);
		}
	}
  
}