abstract class Character {
	
	private String name;
	private double hp;
	
	public  Character(String name, double hp){
		this.name = name;
		this.hp = hp;
	}
	
	public String getName(){
		return name;
	}
	
	public double getHp(){
		return hp;
	}
	
	public void setHp(double hp){
		this.hp = hp;
	}
	
	abstract void skill1(Character enemy);
	abstract void skill2(Character enemy);
}