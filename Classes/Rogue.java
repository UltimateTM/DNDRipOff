public class Rogue extends Player {
	public Rogue(int hp, int dex, int spd, int str, int posX, int mon) {
		super(hp, dex, spd, str, posX, mon);
	}

  //normally run would return true if dice was > 10, for rogue it can be smaller and still be successful
  public boolean Run(){
    if(rollDice() > 5)
      return true;
    else  
      return false;
  }

}