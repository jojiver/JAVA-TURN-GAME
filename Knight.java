class Knight extends Character{
	public Knight(String name, int hp){
		super(name,hp);
	}
	
	@Override
	void skill1(Character enemy){
		System.out.println(getName() + " Dragon Breath!");
		enemy.setHp(enemy.getHp() -15);
	}
	
	@Override
	void skill2(Character enemy){
		System.out.println(getName() + "Dragon Tail!");
		enemy.setHp(enemy.getHp() -20);
	}
}