package day10_works;

import java.util.Random;
/*生成验证码

内容：可以是小写字母，也可以是大写字母，还可以是数字

规则：

  	长度为5

  	内容中是四位字母，1位数字。

  	其中数字只有1位，但是可以出现在任意的位置。*/
public class test03 {
    public static void main(String[] args) {
        char []arr = new char[52];
        for (int i = 0; i < 52; i++) {
            if(i < 26) {
                arr[i] = (char)(97 + i);
            }
            else{
                arr[i] = (char)(39 + i);
            }
        }
        char []brr = new char[5];
        for (int i = 0; i < brr.length - 1; i++) {
            Random r1 = new Random();
            int index = r1.nextInt(52);
            brr[i] = arr[index];
        }
        Random r = new Random();
        int number = r.nextInt(10) ;
        brr[4] = (char)(number + 48);



        //打乱
        for (int i = 0; i < brr.length; i++) {
            Random r2 = new Random();
            int number1 = r2.nextInt(5);
            char temp;
            temp = brr[i];
            brr[i] = brr[number1];
            brr[number1] = temp;
        }
        String result = new String(brr);
        System.out.println(brr);
    }
}
