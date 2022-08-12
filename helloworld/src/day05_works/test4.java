package day05_works;

public class test4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4};
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum = sum*10 + arr[i];
        }
        System.out.println(sum);
    }
}
