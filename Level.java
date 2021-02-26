//going to be the levels
import java.util.*;

public class Level {

  //each level needs a boss, player, and probably a monetary reward for being successful
    public Scanner scan = new Scanner(System.in);
    public String input = "";
	public String[] story = {"It is dark","Press [1] to light match", "In Front of you stands a tall Sbark. Go merk him", "Press [Enter] to battle this dude", "Nice, you totally mercced that guy", "You failed and got one-shotted, LMAO!"};

	public Level() {}

	public void scene1Part1(Player p) {

    	Enemy bob = new Enemy(50, 5, 5, 5, 20);
		Hud.clearScreen();
    	try {
			Helper.slowPrint(story[0]);
			Thread.sleep(100);
			Helper.slowPrint(story[1]);
    		input = scan.nextLine();
			
			while(!input.equals("1")) {
     			input = scan.nextLine();
			}

      		Helper.slowPrint(story[2]);
      		Helper.slowPrint(story[3]);
      		input = scan.nextLine();

		scene1Part2(p, bob);
      
    	} catch (InterruptedException E) {
        	System.out.println("L");
      	}	
		
	}

	public void scene1Part2(Player p, Enemy b) {
		while(!p.isDead() && !b.isDead()) {
        	Hud.clearScreen();
      		Hud.levelScreen(p, b);
			Hud.battleScreen(p);
			input=scan.nextLine();
			b.MoveForward(p);
        
			switch(input) {
				case "1":
					p.Attack(p, b);
					break;
				case "2":
					p.Run(p, b);
					break;
				case "3":
					p.Defend(p, b);
					break;
				case "4":
					p.MoveForward(p);
					break;
          		case "5":
					p.MoveBackward(p);
					break;
          		case "6":
					p.RunForward(p);
					break;
          		case "7":
					p.RunBackward(p);
					break;
          		case "8":
					p.equipItem();
					break;
				default:
					System.out.println("Please enter a valid response you noob");
					break;
			}

			if(b.rollDice()==20) 
				p.health = 0;
			else if(b.rollDice() > 10) 
				b.Attack(b, p);

		}

		if(p.isDead())
			System.out.println(story[5]);
		else 
			System.out.println(story[4]);
    
    scan.next();
		Hud.endCredits();    
	}
}