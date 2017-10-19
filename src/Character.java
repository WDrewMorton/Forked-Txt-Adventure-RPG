/**
 * @author Drew Morton
 *
 */
public class Character {
	
	/*
	* Ideally each of the required parameters will be an object or set by the player.
	* Name = set by user
	* Attack =  set by a Weapon object
	* Health and Power = set by Class object
	* PowerName = set by Class attribute maybe by user?? 
	* Weapon = set by Weapon object
	*/
	
	// Required Parameters
	  private String name;
	  private String attack;
	  private int health;
	  private int power;
	  private String powerName;
	  private String weapon;
	  
	// Optional Parameter
	// Can use optional parameters as Races ?



	/**
	* @return the name
	*/
	public String getName() {
		return name;
	}
	
	/**
	 * @return the attack
	 */
	public String getAttack() {
		return attack;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return attack;
	}
	
	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}
	
	/**
	 * @return the attack
	 */
	public String getPowerName() {
		return powerName;
	}
	
	/**
	 * @return the attack
	 */
	public String getWeapon() {
		return weapon;
	}


	private Character(CharacterBuilder builder) {
		  this.name = builder.name;
		  this.attack = builder.attack;
		  this.health = builder.health;
		  this.power = builder.power;
		  this.powerName = builder.powerName;
		  this.weapon = builder.weapon;
	}
	
	public static class CharacterBuilder{
		  private String name;
		  private String attack;
		  private int health;
		  private int power;
		  private String powerName;
		  private String weapon;
		  
		  public CharacterBuilder(String name, String attack, int health, int power, String powerName, String weapon) {
				  this.name = name;
				  this.attack = attack;
				  this.health = health;
				  this.power = power;
				  this.powerName = powerName;
				  this.weapon = weapon;
			}
	}

}
