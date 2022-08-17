package day07_works;

import java.util.Scanner;

/*在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为
：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。*/
public class test05 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6名评委的分数：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //最大数
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        //最小数
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int score = ( sum - max - min ) / 4;
        System.out.println("得分为：" + score);
    }
}
