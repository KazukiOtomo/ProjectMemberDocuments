package lecture01;

public class Kadai5 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};
        int min = score[0];
        int max = score[0];
        int sum = 0;

        for(int i =0; i < score.length; i++) {
            sum += score[i];
            //System.out.println(sum);
            if(100 >= score[i] && score[i] >= 90) {
                System.out.println(i + 1 + "番" + score[i] + "点" + " 秀");
            }else if(90 > score[i] && score[i] >= 80) {
                System.out.println(i + 1 + "番" + score[i] + "点" + " 優");
            }else if(80 > score[i] && score[i] >= 70) {
                System.out.println(i + 1 + "番" + score[i] + "点" + " 良");
            }else if(70 > score[i] && score[i] >= 60) {
                System.out.println(i + 1 + "番" + score[i] + "点" + " 可");
            }else {
                System.out.println(i + 1 + "番" + score[i] + "点" + " 不可");
            }
            min = Math.min(min, score[i]);
            max = Math.max(max, score[i]);

        }

        double ave = sum / score.length;

        System.out.println("最高点:" + max + "点");
        System.out.println("最低点:" + min + "点");
        System.out.println("平均点:" + ave + "点");
    }
}
