public class Weapon extends Item{
  
  	//constructor, calls the 2nd one in Item
  	public Weapon(double damage, int cost, String name){
    	super(damage, cost, name);
  	}

  	//equiping a sword adds to a character's base damage
	public void equip(Character me){
		me.strength += (int)this.attackDMG;
  	}


}