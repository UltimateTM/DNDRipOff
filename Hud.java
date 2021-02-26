//going to print things to the screen
import java.util.*;

public class Hud {

  	public static Scanner scan = new Scanner(System.in);
//first screen when players first start game
  	public static void mainScreen(){
      	try {
        	Hud.clearScreen();
        	System.out.println("==============================");
        	System.out.println();
        	Helper.slowPrint("Diggity Dungeons and All That");
        	Helper.slowPrint("Play [1]");
        	Helper.slowPrint("Press [2] to quit");
        	System.out.println();
        	System.out.println("==============================");
        	Helper.slowPrint("Enter: ");
      	} catch (InterruptedException E) {
        	System.out.println("L");
      	}
    
  	}
//main menu of game
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
        System.out.println("Enter: ");
  	}
//one section of level HUD
    public static void levelScreen(Player p, Enemy b){
        System.out.println("====================================");
        System.out.println("Position: " + p.positionX + "\tEnemy's Position: " + b.positionX);
        System.out.println("Health: " + p.getPlayerHP() + "\tEnemy's Health: " + b.getPlayerHP());
		System.out.println("====================================");
        System.out.println("");
        System.out.println("Inventory");
		p.printInventory();
        System.out.println();

    }
//Another section of HUD, more focused on battle
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
          Helper.slowPrint("Step Backward[5]");
        	Helper.slowPrint("Run Forward[6]");
          Helper.slowPrint("Run Backward[7]");
        	Helper.slowPrint("Equip[8]");
        	System.out.println("==============================");
	    	System.out.println();
      	} catch (InterruptedException E) {
        	System.out.println("L");
      	}
    }
//Player selects class
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
//Main menu of the shop
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
//Death Screen
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
//end credits
	public static void endCredits() {
		try {
			String input = "";
			clearScreen();
			Helper.slowPrint("\t\t\t\t\tWritten and Directed by\n\t\t\t\t\t\tMartin Scorsese\n\n\n\n");
      Helper.slowPrint("Brought to By");
      pltw();
			input = scan.nextLine();
		} catch(InterruptedException E) {
			System.out.println("L");
		}
	}
//clear screen method
  	public static void clearScreen() {  
  		System.out.print("\033[H\033[2J");  
  		System.out.flush();  
	  } 

//Nothing to see here ;)
	public static void pltw() {
		try {
			Helper.slowPrint("___________    ___      __________  __                   __");
			Helper.slowPrint("|   ___   |   |   |    |___    ___| \\ \\                 / /");
			Helper.slowPrint("|  |___|  |   |   |        |  |      \\ \\      ___      / /");
			Helper.slowPrint("|  _______/   |   |        |  |       \\ \\    / _ \\    / /");
			Helper.slowPrint("|  |          |   |        |  |        \\ \\  / / \\ \\  / /");
			Helper.slowPrint("|  |          |   |        |  |         \\ \\/ /   \\ \\/ /");
			Helper.slowPrint("|  |          |   |___     |  |          \\  /     \\  /");
			Helper.slowPrint("|__|          |_______|    |__|           \\/       \\/");


		} catch (InterruptedException E) {
			System.out.println("L");
		}
	}

}