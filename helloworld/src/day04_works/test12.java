package day04_works;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int count = 0;
        if(number1 < number2)
        {
            for(int i = number1 ; i <=number2 ; i++)
            {
                if(i%3 == 0 && i%5 == 0)
                    count++;
            }
        }
        else{
            for(int i = number2 ; i <=number1 ; i++)
            {
                if(i%3 == 0 && i%5 == 0)
                    count++;
            }
        }
        System.out.println("个数为" + count);
    }
}
