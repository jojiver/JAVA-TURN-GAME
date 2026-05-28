class Mage extends Character {

    public Mage(String name, double hp) {
        super(name, hp);
    }

    @Override
    void skill1(Character enemy) {
        System.out.println(getName() + " cast Fireball!");
        enemy.setHp(enemy.getHp() - 16.32);
        System.out.println("--Dealt 16.32 DMG!!!--");
		System.out.println();
    }

    @Override
    void skill2(Character enemy) {
        System.out.println(getName() + " used Heal!");
        setHp(getHp() + 10.54);
        System.out.println("-- HP REGEN 10.54++ --");
		System.out.println();
    }
}