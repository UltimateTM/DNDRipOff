public class Weapon extends Item{
  Helper h = new Help();

  	//constructor, calls the 2nd one in Item
  	public Weapon(double damage, int cost, String name){
    	super(damage, cost, name);
  	}

  	//equiping a sword adds to a character's base damage
	public void equip(Character me){
		me.strength += (int)this.attackDMG;
  }

  Weapon weapon1 = new Weapon(2.0, 5, "Chaos Blade");
  // Weapon weapon2 = new Weapon();


}