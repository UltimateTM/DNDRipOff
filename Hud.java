//going to print things to the screen

public class Hud{
  
  	public static void mainScreen(){
    	Hud.clearScreen();
    	System.out.println("==============================");
    	System.out.println();
    	System.out.println("Welcome to the Coolest Game");
    	System.out.println("Play[1]");
    	System.out.println("Type any other number to foolishly quit");
    	System.out.println();
    	System.out.println("==============================");
   		System.out.print("Enter: ");
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

  	public static void shop(){
    	Hud.clearScreen();
    	System.out.println("==============================");
    	System.out.println();
    	System.out.println("Welcome to the Nearby Tavern");
    	System.out.println("Health Pot[1]");
    	System.out.println("Trash Sword[2]");
    	System.out.println("Okay Sword[3]");
    	System.out.println("God Tier Sword[4]");
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