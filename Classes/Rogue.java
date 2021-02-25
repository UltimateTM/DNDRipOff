public class Rogue extends Player {
	public Rogue() {
		super(15, 17, 18, 15, 0, 10);
	}

  //normally run would return true if dice was > 10, for rogue it can be smaller and still be successful
  public boolean Run(){
    if(rollDice() > 5)
      return true;
    else  
      return false;
  }

}