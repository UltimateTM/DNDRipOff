//going to be the levels
import java.util.*;

public class Level {

  //each level needs a boss, player, and probably a monetary reward for being successful
   	public Player player;
    public Enemy boss;
  	public int reward;
    public boolean completed;
    public Scanner scan = new Scanner(System.in);
    public String input= "";
	public String[] story= {"It is dark","Press [1] to light match", "Oop, You've encountered an enemy. Go merk him", "Press[1] to battle this dude"};;

	public Level(Player p, Enemy b, int mon, boolean finished) {
		this.player = p;
    	this.boss = b;
    	this.reward = mon;
    	this.completed = finished;
	}

	public Level() {}

  

	public void scene1Part1() {
		Hud.clearScreen();
		String coolness="It is very dark, nothing can be seen...";
		String coolness2="Press [1] to light match";
    	try {
			Helper.slowPrint(coolness, 30);
			Thread.sleep(100);
			Helper.backspace(coolness.length());
			Helper.slowPrint(coolness2, 80);
			scan.next();
      		input = scan.nextLine();
			

      		if(input.equals("1")){
        		Helper.slowPrint("OwO, You've encountered an enemy. Go merk him");
      		}
      
    	} catch (InterruptedException E) {
        	System.out.println("L");
      	}	
		
	}

	public void miniGame() {
		//trash
	}
}