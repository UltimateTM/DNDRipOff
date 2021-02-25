public class Item {

  	public int attackDMG, HPrestore, baseCost;

  	String itemName;
  
  	//constructor for potion
 	public Item(int hp, int cost, String name) {
    this.HPrestore = hp;
    this.baseCost = cost;
		this.itemName = name;
	}


  public int getHPrestore() {
    return HPrestore;
  }
  

  	//constructor for sword, parameter of double cuz I can't have 2 int constructors
 	public Item(double damage, int cost, String name){
    	this.attackDMG = (int) damage;
    	this.baseCost = cost;
		this.itemName = name;
  }

  public Item(){}

	public int getAttackDMG() {

    return attackDMG;

  }

}