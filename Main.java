
import java.util.*;
import java.lang.Thread;

class Main {
	public static void main(String[] args) {
    	Weapon w = new Weapon();
    	Potion p = new Potion();
    	Helper h = new Helper();
    	Item j = new Item();

    	Scanner scan = new Scanner(System.in);
    	int input = 0;
      	String sinput = "";
    	boolean isRunning = true;
		Player player = new Player();
		Helper helper = new Helper();
		Level level = new Level();

    	while(isRunning){

			
    		Hud.mainScreen();
    		input = h.errorCatch();

    		if(input == 1){
      			boolean gameTime = true, isntValid = true;

          		while(isntValid){
            		Hud.createCharacter();
            		input = h.errorCatch();
            		if(input == 1 || input == 2 || input == 3)
              			isntValid = false;
            		else
              			isntValid = true;
          		}
              //character class is chosen
          		if (input == 1){
           
            		player = new Barbarian();
            
          		} else if(input == 2){
			  	
            		player = new Rogue();

          		} else if(input == 3){
			
            		player = new Wizard();

          		}
            //displays stats before the start of the game
		    	player.displayStats();
      			scan.next();
      			sinput = scan.nextLine();

    			while(gameTime){
            		try {
              			Hud.gameScreen();
        				input = h.errorCatch();
        				if(input == 1){
          					System.out.println("Game would start here");
						  	level.scene1Part1(player);
        				} else if(input == 2){
          					Hud.shop(player);
                  			input = h.errorCatch();
                  			int money = player.money;

                  			if (input == 1 && player.money > 0) {
                    			Hud.clearScreen();
                    			System.out.println("==============================");
                    			Helper.slowPrint("Coin Balance : [" + money + "]");
                    			System.out.println("==============================\n");
                    			w.printWeaponArray();
                    			Helper.slowPrint("\nPlease select an Item");
                    			input = h.errorCatch();

                    			player.money -= Weapon.shopWeaponItems.get(input).getCost();

                    			if (player.money < 0) {
                      				player.money = money;
                      				Helper.slowPrint("LMAO smells like broke in here");
                      				Thread.sleep(1500);
                    			} else {
                      				player.addToInventory(Weapon.shopWeaponItems.get(input));
                      				Helper.slowPrint("You have bought " + Weapon.shopWeaponItems.get(input).getName());
                      				Helper.slowPrint("Coin Balance : [" + player.money + "]");
                      				Thread.sleep(1500);
                    			}

                  			} else if (input == 2 && player.money > 0) {
                    			Hud.clearScreen();
                    			System.out.println("==============================");
                    			Helper.slowPrint("Coin Balance : [" + money + "]");
                    			System.out.println("==============================\n");
                    			p.printPotionArray();
                    			Helper.slowPrint("\nPlease select an Item");
                    			input = h.errorCatch();

                    			player.money -= Potion.shopPotionItems.get(input).getCost();
                    
                    			if (player.money < 0) {
                      				player.money = money;
                      				Helper.slowPrint("You cannot afford this item");
                      				Thread.sleep(1500);
                    			} else {
                      				player.addToInventory(Potion.shopPotionItems.get(input));
                      				Helper.slowPrint("You have bought " + Potion.shopPotionItems.get(input).getName());
                      				Helper.slowPrint("Coin Balance : [" + player.money + "]");
                      				Thread.sleep(1500);
                    			}

                  			} else {
                    			Hud.clearScreen();
                    			// Helper.slowPrint("You have no money.");
                    			// scan.next();
                    			// sinput = scan.nextLine();
                  			}
            
                       

        				} else if(input == 3){
                    //accesses inventory
          					player.printInventory();
                  			Helper.slowPrint("Type Anything to Exit: ");
						    scan.next();
						    sinput=scan.nextLine();

        				} else if(input == 4){
                  //goes back to mainscreen
          					gameTime = false;
                    System.out.println("L");
        				}
            		} catch (InterruptedException E) {
              			System.out.println("L");
            	}

      		}

    		} else if (input == 2) {
    			System.exit(0);
    		}

    	}
	}
}