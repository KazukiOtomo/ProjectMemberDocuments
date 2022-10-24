package lecture07;

public class AttackMove extends Move {
    private int power;

    public AttackMove(String name, int power) {
        super(name);
        this.power = power;
    }

    @Override
    public void attack(Monster monster, Monster enemy) {//numberは技の番号（０～２）
        enemy.setHitpoint(enemy.getHitpoint() - monster.getAttack() - this.power);
        System.out.println(monster.getName() + "　の　" + this.name);//例：Penguinのつつく
        System.out.println(enemy.getName() + " に　" + (monster.getAttack() + this.power) + " のダメージを与えた");//例：MonkeyにXダメージを与えた
    }
}
