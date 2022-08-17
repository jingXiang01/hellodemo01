package day07_works;

import java.util.Scanner;

/*需求:
注：选中代码，ctrl+alt+m，自动提取方法

​	机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。

​	按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。*/
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入机票原价、月份和头等舱（1）或经济舱（0）");
        double ticket = sc.nextInt();
        int month = sc.nextInt();
        int kind = sc.nextInt();
        ticket = getTicket(ticket, month, kind);
        System.out.println(ticket + " " + month + " " + kind);
        System.out.println("打折后价格为：" + ticket);
    }

    private static double getTicket(double ticket, int month, int kind) {
        if(month >= 5 && month <= 10)
        {
            if(kind == 1)
            {
                ticket *= 0.9;
            }
            else if(kind == 0)
            {
                ticket = ticket*0.85;
            }
        }
        else
        {
            if(kind == 1)
            {
                ticket *= 0.7;
            }
            else if(kind == 0)
            {
                ticket *=0.65;
            }
        }
        return ticket;
    }
}
    /*public static double price(double ticket, int month, String kind)
    {
        if(month >= 5 && month <= 10)
        {
            if(kind == "头等舱")
            {
                ticket *= 0.9;
            }
            else if(kind == "经济舱")
            {
                ticket = ticket*0.85;
            }
        }
        else
        {
            if(kind == "头等舱")
            {
                ticket *= 0.7;
            }
            else if(kind == "经济舱")
            {
                ticket *=0.65;
            }
        }
        return ticket;
    }
}
*/