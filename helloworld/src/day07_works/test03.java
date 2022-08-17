package day07_works;

import java.util.Random;

/*需求：

​	定义方法实现随机产生一个5位的验证码

验证码格式：

​	长度为5

​	前四位是大写字母或者小写字母

​	最后一位是数字
*/
public class test03 {
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'D' ,'E' ,'F','G', 'H','I','J','K','L','M','N','O','P'
        ,'Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k'
        ,'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] crr = {'0','1','2','3','4','5','6','7','8','9'};
        Random r = new Random();
        char[] brr = new char[5];
        for (int i = 0; i < brr.length-1; i++) {
            brr[i] = arr[r.nextInt(arr.length)];
        }
        brr[4] = crr[r.nextInt(crr.length)];
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
