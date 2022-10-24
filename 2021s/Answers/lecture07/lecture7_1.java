package lecture07;

import java.util.Random;

public class lecture7_1 {
    public static void main(String[] args) {
        Monster monster1 = new Monster("Penguin", 53, 12, 13, 20);

        AttackMove tackle = new AttackMove("tackle", 10);
        AttackMove peck = new AttackMove("peck", 15);
        AttackMove bubble = new AttackMove("bubble", 10);

        monster1.addMove(tackle);
        monster1.addMove(peck);
        monster1.addMove(bubble);

        Monster monster2 = new Monster("Monkey", 44, 14, 11, 31);

        AttackMove scratch = new AttackMove("scratch",10);
        AttackMove ember = new AttackMove("ember", 10);

        monster2.addMove(tackle);
        monster2.addMove(scratch);
        monster2.addMove(ember);

        Field field = new Field(monster1, monster2);

        field.battleStart();
    }
}
