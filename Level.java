//going to be the levels
import java.util.*;

public class Level {

  //each level needs a boss, player, and probably a monetary reward for being successful
   	public Player player;
    public Enemy boss;
  	public int reward;
    public boolean completed;
    public Scanner scan = new Scanner(System.in);
    public String input = "";
	public String[] story = {"It is dark","Press [1] to light match", "In Front of you stands a tall Sbark. Go merk him", "Press[1] to battle this dude", "Nice, you totally mercced that guy", "You failed, try to merc him again!"};

	public Level(Player p, Enemy b, int mon, boolean finished) {
		this.player = p;
    	this.boss = b;
    	this.reward = mon;
    	this.completed = finished;
	}

	public Level() {}

  

	public void scene1Part1(Player p) {

    	Enemy bob = new Enemy(5, 5, 5, 5, 5);
		Hud.clearScreen();
    	try {
			Helper.slowPrint(story[0]);
			Thread.sleep(100);
			//Helper.backspace(coolness.length());
			Helper.slowPrint(story[1]);
    input = scan.nextLine();
			
			while(!input.equals("1")) {
     			input = scan.nextLine();
			}

      	Helper.slowPrint(story[2]);
      	Helper.slowPrint(story[3]);
      	input = scan.nextLine();

      	if(input.equals("1")){
        	boolean game = true;

        	while(game){

				while(!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4")) {
					Hud.clearScreen();
      				Hud.levelScreen(p);
					Hud.battleScreen(p);
					System.out.println("Invalid Response. Please enter valid response you noob");
              		scan.next();
      				input = scan.nextLine();
				}

				Hud.clearScreen();
      			Hud.levelScreen(p);
				Hud.battleScreen(p);
      			scan.next();
      			input = scan.nextLine();
			

          		if(input.equals("1")){
            		p.Attack(p, bob);
          		} else if(input.equals("2")){

            	if(p.Run())
              		p.Defend(p, bob);
            	else
              		bob.Attack(bob, p);

          	} else if(input.equals("3")){
            p.Defend(p, bob);
          }

        }

		Helper.slowPrint(story[4]);
		input=scan.nextLine();
      }

      
      
    	} catch (InterruptedException E) {
        	System.out.println("L");
      	}	
		
	}

	public void miniGame() {
		// trash
	}
}