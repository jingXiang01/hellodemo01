package day05_works;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[arr.length+1];
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= number)
            {
                brr[i] = arr[i];
                index = i+1;
            }
            else if(arr[i] > number){
                brr[i+1] = arr[i];
            }
        }
        brr[index] = number;
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
