package day06_works;

public class test1 {
    public static void main(String[] args) {
        System.out.println(compare(10.3,1.5));
    }
    public static double compare(double number1,double number2)
    {
        if(number1 > number2)
        {
            return number2;
        }
        else
        {
            return number1;
        }
    }
}
