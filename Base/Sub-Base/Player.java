import java.util.*;


public class Player extends Character {

	public String name;
	public int money;
  	public int hp;
	public Scanner sc = new Scanner(System.in);

  	public ArrayList<Item> inventory = new ArrayList<Item>();
//each player has stats that are specific to their choice of character
	public Player(int hp, int dex, int spd, int str, int posX, int mon) {
		super(hp, dex, spd, str, posX);
		Hud.clearScreen();
    	this.money = mon;
		System.out.println("Please enter your name brave warrior: ");
		this.name = sc.nextLine();
    	if (this.name.equals("Bjerkaas")){
      		this.money = 10000;
		}
    	this.hp = hp;
	}

	public Player() {
		super(0, 0, 0, 0, 0);
	}
//returns players money
	public int getMoney(){
		return this.money;
	}
//equips current weapon or uses potion from inventory
  	public void equipItem() {
    	this.inventory.get(0).equip(this);

      	Potion pot = new Potion();

      	if(this.inventory.get(0).getClass() == pot.getClass()){
        	this.inventory.remove(0);
        }
  	}
//displays the stats of the character
  	public void displayStats(){
	  	System.out.println("--------------------------------------------");
	  	System.out.println("| " +  "Health: " + this.health + "   | " +  "Dexterity: " + this.dexterity + " | " +  "Speed: " + this.speed + "\n| " +  "Strength: " + this.strength + " | " + "Coins: " + this.money + "     | Range: 5");
	  	System.out.println("--------------------------------------------");
  	}
	//adds item to inventory
	public void addToInventory(Item item) {
		if(this.inventory.size() < 5){
			this.inventory.add(item);
    	}
    	else {
      		System.out.println("Nah fam. That inventory is already too thiccc");
    	}
	}
//Removes item from inventory
	public void discardItem(Item item) {
		boolean isFound=false;
		for(Item i: inventory) {
			if(item == i)
				isFound = true;
		}
		if(isFound) {
			inventory.remove(item);
		}
	}
//removes item from inventory and returns money to character
	public void sellItem(Item item) {
		boolean isFound=false;
		for(Item i: inventory) {
			if(item == i)
				isFound = true;
		}
		if(isFound) {
			this.money += item.baseCost;
			inventory.remove(item);
		}
	}
//prints inventory of the player
  	public void printInventory(){
		  for(Item i: inventory) {
			  System.out.print("| " + i.getName());
		  }
		  System.out.print(" |\n");
  	}

}