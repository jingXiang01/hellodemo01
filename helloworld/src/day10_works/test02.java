package day10_works;

import java.util.Random;
import java.util.Scanner;

import static java.lang.String.copyValueOf;

//键盘输入任意字符串，打乱里面的内容
public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        char[] arr = str.toCharArray();
        char temp;
        for(int i = 0; i < str.length(); i++)
        {
            Random r = new Random();
            int number = r.nextInt(str.length());
            temp = arr[number];
            arr[number] = arr[i];
            arr[i] = temp;
        }
        String result = copyValueOf(arr);
        System.out.println(result);
    }


}
