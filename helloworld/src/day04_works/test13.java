package day04_works;

public class test13 {
    public static void main(String[] args) {
        double mountain = 8844430;
        int count = 0;
        double height = 0.1;
        while(height < mountain)
        {
            height *= 2;
            count++;
        }
        System.out.println(count);
    }
}
