import exceptions.Mage;
import exceptions.Warrior;
import exceptions.WeaponException;

public class Main {

	public static void main(String[] args) {
		
		Character perso =  new TestCharacter ("Sabrine");
		System.out.println(perso.getName());
		System.out.println(perso.getLife());
		System.out.println(perso.getAgility());
		System.out.println(perso.getStrength());
		System.out.println(perso.getWit());
		System.out.println(perso.getRPGClass());
		perso.attack("my weapon");
		
		Warrior warrior = new Warrior ("Jean -Luc") ;
		Mage mage = new Mage (" Robert ") ;
		
		warrior . moveRight () ;
		warrior . moveLeft () ;
		warrior . moveBack () ;
		warrior . moveForward () ;
		mage . moveRight () ;
		mage . moveLeft () ;
		mage . moveBack () ;
		mage . moveForward () ;
	Warrior war = new Warrior("Sabrine");
	Mage mage = new Mage("Sabrina") ;
	try {
		war.tryToAttack("");
	} catch (WeaponException e) {
		System.out.println(e.getMessage()) ;
	}
	
	try {
		mage.tryToAttack("knife");
	} catch (WeaponException e) {
		System.out.println(e.getMessage()) ;
	}
		
		
	}

}
