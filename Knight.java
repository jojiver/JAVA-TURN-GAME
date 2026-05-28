class Knight extends Character{
	public Knight(String name, double hp){
		super(name,hp);
	}
	
	@Override
	void skill1(Character enemy){
		System.out.println(getName() + " Dragon Breath!");
		enemy.setHp(enemy.getHp() -30);
		System.out.println("--Dealt 30 DMG!!!--");
		System.out.println();
	}
	
	@Override
	void skill2(Character enemy){
		System.out.println(getName() + "Dragon Tail!");
		enemy.setHp(enemy.getHp() -20);
		System.out.println("--Dealt 20 DMG!!!--");
		System.out.println();
	}
}