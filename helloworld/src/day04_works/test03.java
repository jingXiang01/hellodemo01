package day04_works;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存的钱：");
        int money = sc.nextInt();
        if(money < 1000)
        {
            System.out.println("存入的钱太少");
        }
        else{
            System.out.println("选择一定年限：");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    money += money*0.0225*1;
                    System.out.println(money);
                    break;
                case 2:
                    money += money*0.027*2;
                    System.out.println(money);
                    break;
                case 3:
                    money += money*0.0325*3;
                    System.out.println(money);
                    break;
                case 5:
                    money += money*0.036*5;
                    System.out.println(money);
                    break;
                default:
                    System.out.println("没有此年份情况");
            }
        }
    }
}
