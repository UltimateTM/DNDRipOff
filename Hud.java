//going to print things to the screen

public class Hud{
  
  	public static void mainScreen(){
      try {
        Hud.clearScreen();
        System.out.println("==============================");
        System.out.println();
        Helper.slowPrint("Diggity Dungeons and All That");
        Helper.slowPrint("Play [1]");
        Helper.slowPrint("Type any other number to foolishly quit");
        System.out.println();
        System.out.println("==============================");
        Helper.slowPrint("Enter: ");
      } catch (InterruptedException E) {
        System.out.println("L");
      }
    
  	}

  	public static void gameScreen(){
      try {
        Hud.clearScreen();
        System.out.println("==============================");
        System.out.println();
        Helper.slowPrint("Start Level[1]");
        Helper.slowPrint("Shop[2]");
        Helper.slowPrint("Inventory[3]");
        Helper.slowPrint("Leave[4]");
        System.out.println();
        System.out.println("==============================");
        Helper.slowPrint("Enter: ");
      } catch (InterruptedException E) {
        System.out.println("L");
      }
    	
  	}

    public static void levelScreen(Player p, Enemy b){
      try {
        System.out.println("====================================");
        Helper.slowPrint("Position: " + p.positionX + "\tEnemy's Position: " + b.positionX);
        Helper.slowPrint("Health: " + p.getPlayerHP() + "\tEnemy's Health: " + b.getPlayerHP());
		System.out.println("====================================");
        System.out.println("");
        System.out.println("Inventory");
		    p.printInventory();
        System.out.println();
      } catch (InterruptedException E) {
        System.out.println("L");
      }
    }

    public static void battleScreen(Player p){
      try {
        p.displayStats();
        System.out.println();
		System.out.println("==============================");
        Helper.slowPrint("It's Time to D DDD D DUEL");
        System.out.println();
        Helper.slowPrint("Attack[1]");
        Helper.slowPrint("Dodge[2]");
        Helper.slowPrint("Guard[3]");
        Helper.slowPrint("Step Forward[4]");
        Helper.slowPrint("Run Forward[5]");
        System.out.println("==============================");
	    System.out.println();
      } catch (InterruptedException E) {
        System.out.println("L");
      }
    }

    public static void createCharacter(){
      try {
        Hud.clearScreen();
      	System.out.println("==============================");
      	System.out.println();
      	Helper.slowPrint("Barbarian[1]");
      	Helper.slowPrint("Rogue[2]");
      	Helper.slowPrint("Wizard[3]");
      	System.out.println();
      	System.out.println("==============================");
     	  Helper.slowPrint("Enter: "); 
      } catch (InterruptedException E) {
        System.out.println("L");
      }     
       
    }

  	public static void shop(Player p){
      try {
        Hud.clearScreen();
        System.out.println("==============================");
        System.out.println();
        Helper.slowPrint("Welcome to the Nearby Tavern");
        Helper.slowPrint("Coins: " + p.money);
        Helper.slowPrint("Please select a category\n");
        Helper.slowPrint("Weapons [1] \t Potions [2]\n");
        Helper.slowPrint("\t\tLeave [3]\t\t\n");
        System.out.println("==============================");
        Helper.slowPrint("Enter: ");
      } catch (InterruptedException E) {
        System.out.println("L");
      }
  	}

    public static void death(Player p){
      try {
        System.out.println("==============================");
        System.out.println();
        Helper.slowPrint("Here lies " + p.name);
        System.out.println();
        if(p.money >= 50)
        Helper.slowPrint("He died a rich man after defeating many enemies");
        else
        Helper.slowPrint("He kinda sucked ngl");

        System.out.println();
        System.out.println("==============================");
    
      } catch (InterruptedException E) {
        System.out.println("L");
      }
    
    }

  	public static void clearScreen() {  
  		System.out.print("\033[H\033[2J");  
  		System.out.flush();  
	  } 

}