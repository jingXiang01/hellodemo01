package day06_works;

import java.util.Scanner;
/*在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        compare(number1,number2,number3);
    }
    public static void compare(int a, int b, int c){
        int max =  (a>b?a:b)>c?(a>b?a:b):c;
        int min =  (a<b?a:b)<c?(a<b?a:b):c;
        int mid = a + b + c - max - min;
        System.out.println(min + " " + mid + " " + max);
    }
}
