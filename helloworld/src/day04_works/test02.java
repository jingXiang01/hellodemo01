package day04_works;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第2个数：");
        int number2 = sc.nextInt();
        System.out.println("请输入第3个数：");
        int number3 = sc.nextInt();
        int result1 = number1 > number2 ? number2:number1;
        int result2 = result1 > number3 ? number3:result1;
        System.out.println(result2);
    }
}
