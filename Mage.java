class Mage extends Character {

    public Mage(String name, int hp) {
        super(name, hp);
    }

    @Override
    void skill1(Character enemy) {
        System.out.println(getName() + " cast Fireball!");
        enemy.setHp(enemy.getHp() - 18);
    }

    @Override
    void skill2(Character enemy) {
        System.out.println(getName() + " used Heal!");
        setHp(getHp() + 15);
    }
}