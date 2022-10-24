package lecture07;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Field {
    List<Monster> monsterList;

    public Field(Monster monster1, Monster monster2) {
        this.monsterList = new ArrayList<>();

        this.monsterList.add(monster1);
        this.monsterList.add(monster2);
    }

    public void battleStart() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(3);   //0～2の乱数を生成
        monsterList.sort((a, b) -> b.getSpeed() - a.getSpeed());

        battle : while(true) {
            for (Monster monster : monsterList) {
                monster.showMove();
                System.out.println("技を選択してください。:");
                int i = scanner.nextInt();
                Monster enemy = monsterList.stream()
                        .filter(m -> !monster.equals(m))
                        .collect(Collectors.toList())
                        .get(0);
                monster.attack(enemy, i);

                if(!enemy.isAlive()){
                    System.out.println(monster.getName()+"　の　かち");
                    break battle;
                }
            }
        }
    }
}
