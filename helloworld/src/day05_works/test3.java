package day05_works;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
