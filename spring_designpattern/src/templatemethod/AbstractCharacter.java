package templatemethod;

import java.util.Random;

public abstract class AbstractCharacter implements Character {

    private String name;
    private int hp;
    private int currentHp;
    private int atk;
    private int def;

    public AbstractCharacter(String name, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.currentHp = hp;
        this.atk = atk;
        this.def = def;
    }

    @Override
    public void attack(Character target) {
        Random random = new Random();
        int damage = random.nextInt(atk/2, atk*2);
        damage = calAtkWeight(damage);
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        damage = calDefWeight(damage);
        damage = Math.max(0, damage);

        this.currentHp -= damage;
        this.currentHp = Math.max(0, this.currentHp);

        System.out.println(name + " " + damage + " 데미지를 받았습니다.");
        System.out.println(name + " 체력 : " +  + currentHp);
    }

    public boolean isDead() {
        return currentHp == 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    protected abstract int calAtkWeight(int damage);
    protected abstract int calDefWeight(int damage);
}
