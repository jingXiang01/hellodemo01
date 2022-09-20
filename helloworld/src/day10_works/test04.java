package day10_works;

import java.util.Scanner;

/*请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。*/
public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int numbercount = 0;
        int lettercount = 0;
        char []arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 'a' && arr[i] < 'z')
            {
                lettercount ++;
            } else if (arr[i] > 'A' && arr[i] < 'Z') {
                lettercount ++;
            } else if (arr[i] > '0' && arr[i] < '9') {
                numbercount ++;
            }
        }
        System.out.println("数字个数为" + numbercount);
        System.out.println("字母个数为" + lettercount);
    }
}
