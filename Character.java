abstract class Character {
	
	private String name;
	private int hp;
	
	public  Character(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
	
	public String getName(){
		return name;
	}
	
	public int getHp(){
		return hp;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
	
	abstract void skill1(Character enemy);
	abstract void skill2(Character enemy);
}