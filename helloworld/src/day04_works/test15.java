package day04_works;

public class test15 {
    public static void main(String[] args) {
        int dividend = 1001;
        int divisor = 3;
        int count = 0;
        while (dividend > divisor)
        {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("商为" + count + "余数为" + dividend);
    }
}
