package day03_works;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int number1 = sc.nextInt();
        System.out.println("输入第二个数：");
        int number2 = sc.nextInt();
        boolean result = (number1 == 6) || (number2 == 6) || ((number1 + number2)%6 == 0);
        System.out.println(result);
    }
}
