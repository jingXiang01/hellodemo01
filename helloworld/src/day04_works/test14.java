package day04_works;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int number1 = sc.nextInt();
        int temp = number1;
        int result = 0,ge = 0;
        while(number1 != 0) {
            ge = number1 % 10;
            number1 = number1 / 10;
            result = result * 10 + ge;
        }
        System.out.println(result);
        if(result == temp)
            System.out.println("是回文数");
        else{
            System.out.println("不是回文数");
        }
    }
}
