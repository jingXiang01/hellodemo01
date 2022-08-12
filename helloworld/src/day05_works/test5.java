package day05_works;

public class test5 {
    public static void main(String[] args) {
        double[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        double sum = 0, avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum/arr.length;
        System.out.println(avg);
    }
}
