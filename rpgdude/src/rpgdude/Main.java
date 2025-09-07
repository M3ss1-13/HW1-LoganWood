package rpgdude;

 abstract class MainCharacter {
	private final String name;
	private final int level;
	
	
public MainCharacter(String name, int level)	{
	
	this.name = name;
	this.level = level;
}

public void characterinformation() {
	System.out.println(name +" is at the level "+ level);
	
}
 public String getName() { return name;}
 public int getLevel() {return level;}
 }
 
 interface magicattack{
	 void spell();
 }

 final class Mage extends MainCharacter implements magicattack {
	 public Mage(String name, int level) {
	 	super(name, level);
 }
	 
 
 
  public void spell() {
	  System.out.println(getName() + "uses a fire spell");
  }
 }
 
 
 
 public class Main {
	 public static void main(String[] args) {
		 
	Mage mage = new Mage("john", 13); 
 
	mage.characterinformation();
	mage.spell();
	
	 }
 
 
}
 
 
 
 
  
 
