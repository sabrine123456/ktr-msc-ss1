package exceptions;

public class Warrior extends Character {

	@Override
	public int getAgility() {
		return 8;
	}

	@Override
	public int getLife() {
		return 100;
	}

	@Override
	public int getStrength() {
		return 10;
	}

	@Override
	public int getWit() {
		return 3;
	}

	@Override
	public String getRPGClass() {
		return "Warrior";
	}

	@Override
	public void attack(String Weapon) throws WeaponException {
		if (Weapon.equals("hammer") || Weapon.equals("sword")) {
			System.out.println("[" + name + "] : Rrrrrrrr");
			System.out.println("[" + name + "] : I'll crush you with my" + Weapon);
		}
		else {
			if(Weapon!="hammer" && Weapon!="sword" && Weapon!="") {
			throw new WeaponException("[" + name + "] : A ["+Weapon+"] ?? What should I do with this ?!") ;
			}
			else {
				throw new WeaponException("[" + name + "] : I refuse to fight with my bare hands . ") ;
			}
		}
	}

	public void tryToAttack(String Weapon) throws WeaponException {
		attack(Weapon);
	}

	public Warrior(String name) {
		super(name);
		System.out.println("[" + name + "] : My name will go down in history !");
	}

	@Override
	public void moveRight() {
		System.out.println("[" + name + "] : moves right like a bad boy");

	}

	@Override
	public void moveLeft() {
		System.out.println("[" + name + "] : moves left like a bad boy");

	}

	@Override
	public void moveForward() {
		System.out.println("[" + name + "] : moves forward like a bad boy");

	}

	@Override
	public void moveBack() {
		System.out.println("[" + name + "] : moves back like a bad boy");

	}

	

}
