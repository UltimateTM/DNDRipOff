import java.util.ArrayList;

public class Item {
  public static ArrayList<Item> shopWeaponItems = new ArrayList<Item>();
  public static ArrayList<Item> shopPotionItems = new ArrayList<Item>();

  	public int attackDMG, HPrestore, baseCost;

  	public String itemName;
  
  	//constructor for potion
 	public Item(int hp, int cost, String name) {
    	this.HPrestore = hp;
    	this.baseCost = cost;
		this.itemName = name;
	}
  

  	//constructor for sword, parameter of double cuz I can't have 2 int constructors
 	public Item(double damage, int cost, String name){
    	this.attackDMG = (int) damage;
    	this.baseCost = cost;
		this.itemName = name;
  }

  public Item(){}

  //returns damage
	public int getAttackDMG() {
    return attackDMG;
  }
  //returns name
  public String getName() {
    return itemName;
  }
  //returns health back if its a potion
  public int getHPrestore() {
    return HPrestore;
  }
  //returns cost
  public int getCost() {
    return baseCost;
  }
  //gets overriden in each child, Potion and Weapon equip an item differently
  public void equip(Character m){
    
  }

}