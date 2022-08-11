package day04_works;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("键盘录入参加运算的两个数据：");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("输入运算方式：1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算");
        int operate = sc.nextInt();
        double result = 0;
        switch (operate){
            case 1:result = number1 + number2;
            break;
            case 2:result = number1 - number2;
            break;
            case 3:result = number1 * number2;
            break;
            case 4:result = (double)(number1)/(double)(number2);
            break;
        }
        System.out.println("结果为：" + result);
    }
}
