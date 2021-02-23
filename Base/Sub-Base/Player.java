public class Player extends Character {

	public String name;
	public int money;

	public Player(int hp, int dex, int spd, int str, int posX, int mon, String nm) {
		super(hp, dex, spd, str, posX);
		this.name = nm;
		this.money = mon;
	}

	public int getMoney(){
		return this.money;
	}
}