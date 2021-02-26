//going to include arraylist of things

import java.lang.Thread;
import java.util.*;

public class Helper {

  	public static ArrayList<Character> characters = new ArrayList<Character>();
    public static ArrayList<Item> items = new ArrayList<Item>();
    
    Scanner scan = new Scanner(System.in);
	
	public Helper() {

	}

  //prints...but however fast you want
  	public static void slowPrint(String text, int time) throws InterruptedException {
    	char[] chars = text.toCharArray();

    	for (int i = 0; i < chars.length; i++) {
      		System.out.print(chars[i]);
      		try {
        		Thread.sleep(time);
      		} catch (InterruptedException e) {
        		System.out.println("Something happened");
      		}
    
    	}

    	System.out.println();

    	chars = null;
  	}
  //prints...but slowly
  	public static void slowPrint(String text) throws InterruptedException {
    	char[] chars = text.toCharArray();

    	for (int i = 0; i < chars.length; i++) {
      		System.out.print(chars[i]);
      		try {
        		Thread.sleep(25);
      		} catch (InterruptedException e) {
        		System.out.println("Something happened");
      		}
    
    	}

    	System.out.println();

    	chars = null;
  	}

  //ask Gabe
  	public int errorCatch() {
    	boolean isValid = false;
    	int userInput = 0;
    
    	while (isValid == false) {
      		if (scan.hasNextInt()) {
        		userInput = scan.nextInt();
        		scan.nextLine();
      		} else {
        		System.out.println("\nPlease enter only integers with no decimals");
        		scan.next();
        		continue;
      		}
      		isValid = true;
    	}

    	return userInput;

  	}

  //ask Stevan
  	public void add(Object obj) {
	  	Item item = new Item();
	  	Character chara = new Character();
	  	if(obj.getClass()==chara.getClass()) {
		  	characters.add((Character)obj);
	  	} else if (obj.getClass()== item.getClass()) {
		  	items.add((Item)obj);
	  	}
  	}

}