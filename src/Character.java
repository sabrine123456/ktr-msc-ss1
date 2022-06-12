
public abstract class Character implements Movable  {
	protected String name ;
	protected int life ;
	protected int agility ;
	protected int strength ;
	protected int wit ;
	String RPGClass ="Character" ;
	public Character(String name, String RPGClass ,int life, int agility, int strength, int wit) {
		super();
		this.name = name;
		this.RPGClass = RPGClass;
		this.life = life;
		this.agility = agility;
		this.strength = strength;
		this.wit = wit;
	}

	public String getName() {
		return name;
	}
	
	public Character(String name) {
		this.name = name;
	}

	public int getLife() {
		return 50;
	}
	
	public int getAgility() {
		return 2;
	}
	
	public int getStrength() {
		return 2;
	}
	
	public int getWit() {
		return 2;
	}
	
	public String getRPGClass() {
		return RPGClass;
	}
	
	public void attack (String Name) {
		
		System.out.println("["+name+"] : Rrrrrrrr");
	}

	public Character() {
		super();
	
	}
	@Override
	public void moveRight() {
		System.out.println("[" + name + "] : moves right ");

	}

	@Override
	public void moveLeft() {
		System.out.println("[" + name + "] : moves left ");

	}

	@Override
	public void moveForward() {
		System.out.println("[" + name + "] : moves forward ");

	}

	@Override
	public void moveBack() {
		System.out.println("[" + name + "] : moves back ");

	}
	
	public final void unsheathe () {
		System.out.println("[" + name + "] : unsheathes his weapon . ");
	}
	
	
	
	
	
	
	
	

}
