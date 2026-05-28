public class Tank extends Character {
    public Tank(String name, double hp){
        super(name,hp);
    }
    @Override
	void skill1(Character enemy){
		System.out.println(getName() + " Shiel Slam");
		enemy.setHp(enemy.getHp() -10);
		System.out.println("--Dealt 10 DMG!!!--");
		System.out.println();
	}
	
	@Override
	void skill2(Character enemy){
		System.out.println(getName() + " Iron Defense");
		enemy.setHp(enemy.getHp() -15);
        setHp(getHp()+ 18.67);
		System.out.println("--Dealt 15 DMG & HP REGEN 18.67++ --");
		System.out.println();
	}
}
