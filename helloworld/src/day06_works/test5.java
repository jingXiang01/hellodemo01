package day06_works;

import java.util.Scanner;

/*定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回

在main方法中打印该数字是几位数*/
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
        int result = weishu(num);
        System.out.println(num + "是" + result + "位数");
    }
    public static int weishu(int number){
        int count = 0;
        for(int i=0; number%10 !=0; i++)
        { count ++;
        number = number/10;
        }
        return count;
    }
}
