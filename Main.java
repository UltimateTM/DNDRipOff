/*Plans

Parent Character {att: strength, dexterity}
  -Methods{run, attac, defend}

  -Player {Me Controlled, Inventory(Arraylist of Items)}
	  -barbarian{Types of Attacks}
	  -rogue
	  -wizard

  -Enemy {Computer Controlled, Base Damage}
    -boss{Multiplier}
	  -minion


Levels
  -Rooms

Behavior
  -Roll (1-20)

Hud
    -Main Screen
    -Player Inventory
    -Shop
    -End Credits

Items 
  -Sword
  -Potion
  -others

Helper class

*/

import java.util.*;

class Main {
	public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	int input = 0;
      	String sinput;
    	boolean isRunning = true;
		Player player=new Player();

    	while(isRunning){

			
    		Hud.mainScreen();
    		input = scan.nextInt();

    		if(input == 1){
      		boolean gameTime = true, isntValid = true;

          while(isntValid){
            Hud.createCharacter();
            input = scan.nextInt();
            if(input == 1 || input == 2 || input == 3)
              isntValid = false;
            else
              isntValid = true;
          }

			// Everyone's coins is 10
          if (input == 1){
            // Health: 17 Dex: 15 Speed: 15 Strength: 18 PosX: 0
            player = new Barbarian(17, 15, 15, 18, 0, 10);
            player.displayStats();
            
          } else if(input == 2){
			  	
            player = new Rogue(15, 17, 18, 15, 0, 10);
			player.displayStats();

          } else if(input == 3){
			
            player = new Wizard(12, 15, 17, 12, 0, 10);
            player.displayStats();

          }
          sinput = scan.next();


    			while(gameTime){
        			Hud.gameScreen();
        			input = scan.nextInt();
        			if(input == 1){
          				System.out.println("Game would start here");
        			} else if(input == 2){

          				Hud.shop();
          				input = scan.nextInt();

                  		if(input == 1){
                    		Potion p = new Potion(5, 2, "Health Potion");
                    		player.addToInventory(p);
                  		} else if(input == 2){
                    		Weapon w = new Weapon(2.0, 3, "tanto");
							player.addToInventory(w);
                  		} else if(input == 3){
                    		Weapon w = new Weapon(5.0, 5, "wakazashi");
							player.addToInventory(w);
                  		} else if(input == 4){
                    		Weapon w = new Weapon(7.0, 9, "Katana");
							player.addToInventory(w);
                  		}

        			} else if(input == 3){

          				player.printInventory();
						input=scan.nextInt();

        			} else if(input == 4){
          				gameTime = false;
        			}
      			}
    		} else {
    			System.out.println("L");
    			isRunning = false;
    		}

    	}
	}
}