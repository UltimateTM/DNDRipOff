
import java.util.*;

class Main {
	public static void main(String[] args) {
    Weapon w = new Weapon();
    Potion p = new Potion();
    Item j = new Item();

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
						  level.scene1Part1(player);
        			} else if(input == 2){
          				Hud.shop(player);
                  input = scan.nextInt();
                  int money = player.money;

                  if (input == 1 && player.money > 0) {
                    Hud.clearScreen();
                    Hud.shop(player);
                    System.out.println("Please select an Item");
                    w.printWeaponArray();
                    input = scan.nextInt();
                    switch (input) {
                      case 0:
                      player.money -= Weapon.shopWeaponItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Weapon.shopWeaponItems.get(input));
                      }
                      break;

                      case 1:
                      player.money -= Weapon.shopWeaponItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Weapon.shopWeaponItems.get(input));
                      }
                      break;

                      case 2:
                      player.money -= Weapon.shopWeaponItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Weapon.shopWeaponItems.get(input));
                      }
                      break;

                      case 3:
                      player.money -= Weapon.shopWeaponItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Weapon.shopWeaponItems.get(input));
                      }
                      break;

                      case 4:
                      player.money -= Weapon.shopWeaponItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Weapon.shopWeaponItems.get(input));
                      }
                      break;
                    }
                  } else if (input == 2 && player.money > 0) {
                    Hud.clearScreen();
                    Hud.shop(player);
                    System.out.println("Please select an Item");
                    p.printPotionArray();
                    input = scan.nextInt();
                    switch (input) {
                      case 0:
                      player.money -= Potion.shopPotionItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Potion.shopPotionItems.get(input));
                      }
                      break;

                      case 1:
                      player.money -= Potion.shopPotionItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Potion.shopPotionItems.get(input));
                      }
                      break;

                      case 2:
                      player.money -= Potion.shopPotionItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Potion.shopPotionItems.get(input));
                      }
                      break;

                      case 3:
                      player.money -= Potion.shopPotionItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Potion.shopPotionItems.get(input));
                      }
                      break;

                      case 4:
                      player.money -= Potion.shopPotionItems.get(input).getCost();
                      if (player.money < 0) {
                        player.money = money;
                        System.out.println("You cannot afford this item");
                      } else {
                        player.addToInventory(Potion.shopPotionItems.get(input));
                      }
                      break;
                    }
                  } else {
                    Hud.clearScreen();
                    System.out.println("You have no money.");
                    scan.next();
                    sinput = scan.nextLine();
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