//going to be the levels

public class Level {

  //each level needs a boss, player, and probably a monetary reward for being successful
   	public Player player;
  	public Enemy boss;
  	public int reward;
    public boolean completed;


	public Level(Player p, Enemy b, int mon, boolean finished) {
		this.player = p;
    this.boss = b;
    this.reward = mon;
    this.completed = finished;
	}

	public void miniGame() {
		
	}
}