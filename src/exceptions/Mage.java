package exceptions;

public class Mage extends Character {

	@Override
	public int getAgility() {
		return 10;
	}

	@Override
	public int getLife() {
		return 70;
	}

	@Override
	public int getStrength() {
		return 3;
	}

	@Override
	public int getWit() {
		return 10;
	}

	@Override
	public String getRPGClass() {
		return "Mage";
	}

	public void attack(String Weapon) throws WeaponException {
		if (Weapon.equals("magic") || Weapon.equals("wand")) {
			System.out.println("[" + name + "] : Rrrrrrrr");
			System.out.println("[" + name + "] : Feel the power of my" + Weapon);
		}
		else {
			if(Weapon!="wand" && Weapon!="magic" && Weapon!="") {
			throw new WeaponException("[" + name + "] : A ["+Weapon+"] ?? What should I do with this ?!") ;
			}
			else {
				throw new WeaponException("[" + name + "] : I don 't need this stupid ["+ Weapon+" ]! Don 't misjudge my powers") ;
			}
		}
	}
	public void tryToAttack(String Weapon) throws WeaponException {
		attack(Weapon);
	}

	public Mage(String name) {
		super(name);
		System.out.println("[" + name + "] : May the gods be with me.");
	}

	@Override
	public void moveRight() {
		System.out.println("[" + name + "] : moves right furtively");

	}

	@Override
	public void moveLeft() {
		System.out.println("[" + name + "] : moves left furtively");

	}

	@Override
	public void moveForward() {
		System.out.println("[" + name + "] : moves forward furtively");

	}

	@Override
	public void moveBack() {
		System.out.println("[" + name + "] : moves back furtively");

	}
	
	

}
