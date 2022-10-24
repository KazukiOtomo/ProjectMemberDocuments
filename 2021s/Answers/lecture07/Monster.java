package lecture07;

import java.util.ArrayList;
import java.util.List;

public class Monster {
    private String name;
    private int hitpoint, attack, block, speed;
    private List<Move> moveList;

    public Monster(String name, int hitpoint, int attack, int block, int speed) {
        this.name = name;
        this.hitpoint = hitpoint;
        this.attack = attack;
        this.block = block;
        this.speed = speed;
        this.moveList = new ArrayList<>();

        System.out.println(this.name + "を選択しました");
    }

    public void addMove(Move move) {
        moveList.add(move);
        System.out.println(this.name + " は " + move.getName() + " を覚えた");
    }

    public void attack(Monster enemy, int i) {
        moveList.get(i).attack(this, enemy);
    }

    public void showMove() {//プレイヤーが技を選択するselectメソッド
        for (int i = 0; i < moveList.size(); i++) {
            System.out.print(i + ":" + moveList.get(i).getName() + " ");
        }
        System.out.println();
    }

    public boolean isAlive() {//ポケモンが生きているか確認するisAliveメソッド
        System.out.println(this.name + "　の残りHPは　" + this.hitpoint);
        if (this.hitpoint <= 0) {
            System.out.println(this.name + "　は　たおれた");
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitpoint = hitpoint;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }
}
