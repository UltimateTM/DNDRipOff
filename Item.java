public class Item {

  	int attackDMG, HPrestore, baseCost;

  	String itemName;
  
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

	public String toString() {
		return this.itemName;
	}

}