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
	public String[] story = {"It is dark","Press [1] to light match", "In Front of you stands a tall Sbark. Go merk him", "Press [Enter] to battle this dude", "Nice, you totally mercced that guy", "You failed, try to merc him again!"};

	public Level(Player p, Enemy b, int mon, boolean finished) {
		this.player = p;
    	this.boss = b;
    	this.reward = mon;
    	this.completed = finished;
	}

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

	public void scene1Part2(Player p, Enemy b) throws InterruptedException{

		try {
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
						p.RunForward(p);
						break;
					default:
						System.out.println("Please enter a valid response you noob");
						break;
				}
			}

			Helper.slowPrint(story[4]);

		} catch (InterruptedException E){
			System.out.println("L");
		}
		
	}

	public void miniGame() {
		// trash
	}
}