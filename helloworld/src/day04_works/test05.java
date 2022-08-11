package day04_works;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的工资：");
        double salary = sc.nextInt();
        double shui_money = 0;
        if((salary - salary*0.1) < 5000)
        {
            shui_money = 0;
        }
        else if((salary - salary*0.1 - 5000) > 0 && (salary - salary*0.1 - 5000) <= 3000)
        {
            shui_money = (salary - salary*0.1 - 5000) * 0.03;
        }
        else if((salary - salary*0.1 - 5000) > 3000 && (salary - salary*0.1 - 5000) <= 12000)
        {
            shui_money = 3000*0.03 + (salary - salary*0.1 - 5000 - 3000)*0.1;
        }
        else if((salary - salary*0.1 - 5000) > 12000&& (salary - salary*0.1 - 5000) <= 25000)
        {
            shui_money = 3000*0.03 + 9000*0.1 + (salary - salary*0.1 - 5000 - 3000 - 9000)*0.2;
        }
        else if((salary - salary*0.1 - 5000) > 25000&& (salary - salary*0.1 - 5000) <= 35000)
        {
            shui_money = 3000*0.03 + 9000*0.1 + 13000*0.2 + (salary - salary*0.1 - 5000 - 3000 - 9000 - 13000)*0.25;
        }
        else if((salary - salary*0.1 - 5000) > 35000&& (salary - salary*0.1 - 5000) <= 55000)
        {
            shui_money = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25+ 
                    (salary - salary*0.1 - 5000 - 3000 - 9000 - 13000 - 10000)*0.3;
        }
        else if((salary - salary*0.1 - 5000) > 55000&& (salary - salary*0.1 - 5000) <= 80000)
        {
            shui_money = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25+20000*0.3+
                    (salary - salary*0.1 - 5000 - 3000 - 9000 - 13000 - 10000 - 20000)*0.35;
        }
        else if((salary - salary*0.1 - 5000) > 80000)
        {
            shui_money = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25+20000*0.3+25000*0.35+
                    (salary - salary*0.1 - 5000 - 3000 - 9000 - 13000 - 10000 - 20000 - 25000)*0.45;
        }
        System.out.println("您需要交的税为" + shui_money);
    }
}
