import java.util.ArrayList;

public class Weapon extends Item{
  
  // public static ArrayList<Item> shopWeaponItems = new ArrayList<Item>();
  	//constructor, calls the 2nd one in Item
    
  	public Weapon(double damage, int cost, String name){
    	super(damage, cost, name);
  	}

  	//equiping a sword adds to a character's base damage
	public void equip(Character me){
		me.strength += (int)this.attackDMG;
  }

  protected Weapon() {
    shopWeaponItems.add(new Weapon(2.0, 5, "Rondeau's Rage"));
    shopWeaponItems.add(new Weapon(1.5, 8, "Garfield's Lasag"));
    shopWeaponItems.add(new Weapon(3.0, 9, "Sanchez's Demise"));
    shopWeaponItems.add(new Weapon(0.5, 1, "DeMaso's Dagger"));
    shopWeaponItems.add(new Weapon(100.0, 1000, "Bjerkaas' Blade"));
  }

  public void printWeaponArray() {
    for (int i = 0; i < shopWeaponItems.size(); i++) {
      System.out.println(shopWeaponItems.get(i).getName() + " : [" + i + "]");
      System.out.println("Cost : " + shopWeaponItems.get(i).getCost());
    }
  }
  
  

}