import java.util.*;
public class Barbarian extends Player {

	Scanner scan = new Scanner(System.in);
  int choice = 0;

	public Barbarian() {
		super(17, 15, 15, 18, 0, 10);
	}
//Barbarian has a strength boost on their defense
  public void Defend(Character attacker, Character opponent) {
		if(attacker.strength >= opponent.strength + 2) {
			Attack(attacker, opponent);
		}
	}
//Barbarian has 2 attacks, they are able to use heavy and light attacks
  public void Attack(Character attacker, Character opponent) {
      	System.out.println();
        System.out.println("[1] Heavy Attack");
        System.out.println("[2] Light Attack");
        System.out.println();
        System.out.println("==============================");
        choice = scan.nextInt();

      while(choice != 1 && choice != 2){
       System.out.println("Pick a better number, nerd");
        choice = scan.nextInt();
    }
//Heavy
  if(choice == 1){
    if(opponent.positionX - attacker.positionX <= 5){
		if(opponent.health - (attacker.strength + 3) <= 0 )
    		opponent.health = 0;
    	else 
    		opponent.health -= (attacker.strength + 3);

          attacker.health -= 3;
    }
    else System.out.println("get closer... L");
  }
//Light
  else if(choice == 2)
  if(opponent.positionX - attacker.positionX <= 5){
		if(opponent.health - attacker.strength <= 0 )
    		opponent.health = 0;
    	else 
    		opponent.health -= attacker.strength;
  }
    else System.out.println("get closer... L");

    
	}
  
}