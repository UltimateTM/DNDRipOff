
import java.util.*;

class Main {
	public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	int input = 0;
      	String sinput = "";
    	boolean isRunning = true;
		Player player = new Player();
		Helper helper = new Helper();
		Level level=new Level();

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
           
            player = new Barbarian();
            
          } else if(input == 2){
			  	
            player = new Rogue();

          } else if(input == 3){
			
            player = new Wizard();

          }
		  
		    player.displayStats();
      	scan.next();
      	sinput = scan.nextLine();


    			while(gameTime){
        			Hud.gameScreen();
        			input = scan.nextInt();
        			if(input == 1){
          				System.out.println("Game would start here");
						  level.scene1Part1();
        			} else if(input == 2){

          				Hud.shop(player);
          				input = scan.nextInt();

                  		if(input == 1){
                        if(player.money >= 2){
                    		  Potion p = new Potion(5, 2, "Health Potion");
                          player.money -= 2;
                    		  player.addToInventory(p);
                        } else { 
                          System.out.println("Error 432: Too Broke");
                          scan.next();
						              sinput=scan.nextLine();
                        }
                  		} else if(input == 2){
                        if(player.money >= 3){
                    		  Weapon w = new Weapon(2.0, 3, "Tanto");
                          player.money -= 3;
							            player.addToInventory(w);
                        } else {
                          System.out.println("Error 432: Too Broke");
                          scan.next();
						              sinput=scan.nextLine();
                        }
                  		} else if(input == 3){
                        if(player.money >= 5){
                    		  Weapon w = new Weapon(5.0, 5, "Wakazashi");
                          player.money -= 5;
							            player.addToInventory(w);
                        } else {
                          System.out.println("Error 432: Too Broke");scan.next();
						              sinput=scan.nextLine();
                        }
                  		} else if(input == 4){
                        if(player.money >= 9){
                    		  Weapon w = new Weapon(7.0, 9, "Katana");
                          player.money -= 9;
							            player.addToInventory(w);
                        } else {
                          System.out.println("Error 432: Too Broke");
                          scan.next();
						              sinput=scan.nextLine();
                        }
                  		}

        			} else if(input == 3){

          				player.printInventory();
                  System.out.println("Type Anything to Exit: ");
						      scan.next();
						      sinput=scan.nextLine();

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