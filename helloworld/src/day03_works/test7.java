package day03_works;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一位数：");
        int number = sc.nextInt();
        int ge = number%10;
        int shi = (number / 10)%10;
        int bai = (number / 100)%10;
        int result = ge + shi + bai;
        System.out.println(result);
    }
}
