import java.util.*;


public class Player extends Character {

	public String name;
	public int money;
	public String[] codes;
	public Scanner sc = new Scanner(System.in);
  public ArrayList<Item> inventory = new ArrayList<Item>();

	public Player(int hp, int dex, int spd, int str, int posX, int mon) {
		super(hp, dex, spd, str, posX);
		Hud.clearScreen();
		System.out.println("Please enter your name brave warrior: ");
		this.name = sc.nextLine();
		this.money = mon;
		codes = new String[3];
	}

	public Player() {
		super(0, 0, 0, 0, 0);
	}

	public int getMoney(){
		return this.money;
	}

	public void addCode(String code) {
		String temp[] = new String[codes.length+1];
		temp[codes.length+1] = code;
		codes = temp;
	}

  	public void displayStats(){
	  	System.out.println("--------------------------------------------");
	  	System.out.println("| " +  "Health: " + this.health + "   | " +  "Dexterity: " + this.dexterity + " | " +  "Speed: " + this.speed + "\n| " +  "Strength: " + this.strength + " | " + "Coins: " + this.money + "     |");
	  	System.out.println("--------------------------------------------");
  	}
	
	public void addToInventory(Item item) {
		if(this.inventory.size() < 5){
			this.inventory.add(item);
    	}
    	else {
      		System.out.println("Nah fam. That inventory is already too thiccc");
    	}
	}

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

  	public void printInventory(){
		  for(Item i: inventory) {
			  System.out.print(" | " + i);
		  }
		  System.out.print(" |\n");
  	}

}