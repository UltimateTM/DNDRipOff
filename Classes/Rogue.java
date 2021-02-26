public class Rogue extends Player {
	public Rogue() {
		super(15, 17, 18, 15, 0, 10);
	}

  //normally run would return true if dice was > 10, for rogue it can be smaller and still be successful
  public void Run(Character attacker, Character opponent) {

    	if(attacker.speed + 3 >= opponent.speed)
      		Attack(attacker, opponent);
    	else
			  Attack(opponent, attacker);
	}

}