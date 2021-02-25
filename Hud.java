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
        System.out.print("Enter: ");
      } catch (InterruptedException E) {
        System.out.println("L");
      }
    
  	}

  	public static void gameScreen(){
    	Hud.clearScreen();
    	System.out.println("==============================");
    	System.out.println();
    	System.out.println("Start Level[1]");
    	System.out.println("Shop[2]");
      System.out.println("Inventory[3]");
    	System.out.println("Leave[4]");
    	System.out.println();
    	System.out.println("==============================");
    	System.out.print("Enter: ");
  	}

    public static void levelScreen(Player p){
      System.out.println("==============================");
      System.out.println("Position: " + p.positionX);
      System.out.println("Health: " + p.getPlayerHP());
      System.out.println(" ");
    }

    public static void createCharacter(){
      	Hud.clearScreen();
      	System.out.println("==============================");
      	System.out.println();
      	System.out.println("Barbarian[1]");
      	System.out.println("Rogue[2]");
      	System.out.println("Wizard[3]");
      	System.out.println();
      	System.out.println("==============================");
     	System.out.print("Enter: ");       
       
    }

  	public static void shop(Player p){
    	Hud.clearScreen();
    	System.out.println("==============================");
    	System.out.println();
    	System.out.println("Welcome to the Nearby Tavern");
      System.out.println("Coins: " + p.money);
    	System.out.println("Health Pot[1], 2 coins");
    	System.out.println("Trash Sword[2], 3 coins");
    	System.out.println("Okay Sword[3], 5 coins");
    	System.out.println("God Tier Sword[4], 9 coins");
      	System.out.println("Leave[5]");
    	System.out.println();
    	System.out.println("==============================");
   		System.out.print("Enter: ");
  	}

  	public static void clearScreen() {  
  		System.out.print("\033[H\033[2J");  
  		System.out.flush();  
	  } 

}