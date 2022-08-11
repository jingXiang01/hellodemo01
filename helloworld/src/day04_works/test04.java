package day04_works;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("您是会员么？");
        int huiyuan =sc.nextInt();
        System.out.println("您购买了多少钱？");
        double price = sc.nextInt();
        if(huiyuan == 0)
        {
            if(price < 100)
            {
                price = price;
            }
            else
            {
                price = price*0.9;
            }
        }
        else{
            if(price < 200)
            {
                price = price*0.8;
            }
            else
            {
                price = price*0.75;
            }
        }
        System.out.println(price);
    }
}
