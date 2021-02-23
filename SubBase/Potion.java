public class Potion extends Item{

  	//constructor, calls the 1st one in Item
  	public Potion(int hp, int cost, String name){
    	super(hp, cost, name);
  	}

  	//health potion adds its effect to the character's health
  	public void useItem(Character me){
   		me.health += this.HPrestore;
  	}

}