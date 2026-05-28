public class Archer extends Character{

    public Archer(String name, double hp){
        super(name,hp);
    }

    @Override
	void skill1(Character enemy){
		System.out.println();
		System.out.println(getName() + "Arrow Rain!");
		enemy.setHp(enemy.getHp() -20);
		System.out.println("--Dealt 20 DMG!!!--");
		System.out.println();
	}
	
	@Override
	void skill2(Character enemy){
		System.out.println();
		System.out.println(getName() + "Burst ARROW");
		enemy.setHp(enemy.getHp() -30);
		System.out.println("--Dealt 40 DMG!!!--");
		System.out.println();
	}
}
