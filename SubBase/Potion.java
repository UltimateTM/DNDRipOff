import java.util.ArrayList;

public class Potion extends Item{
    // public static ArrayList<Item> shopPotionItems = new ArrayList<Item>();
  	//constructor, calls the 1st one in Item
  	public Potion(int hp, int cost, String name){
    	super(hp, cost, name);
  	}

  	//health potion adds its effect to the character's health
  	public void useItem(Character me){
   		me.health += this.HPrestore;
  	}

    protected Potion() {
      shopPotionItems.add(new Potion(2, 1, "Weak Potion of Healing"));
      shopPotionItems.add(new Potion(4, 5, "Moderate Potion of Healing"));
      shopPotionItems.add(new Potion(8, 10, "Strong Potion of Healing"));
      shopPotionItems.add(new Potion(16, 30, "Major Potion of Healing"));
      shopPotionItems.add(new Potion(1000, 2000, "Bjerkaas' Blessing"));
    }


    public void printPotionArray() {
      for (int i = 0; i < shopPotionItems.size(); i++) {
        System.out.println(shopPotionItems.get(i).getName() + " : [" + i + "]");
        System.out.println("Cost : " + shopPotionItems.get(i).getCost());
      }
    }
}