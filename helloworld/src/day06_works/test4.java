package day06_works;
/*数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。*/

public class test4 {
    public static void main(String[] args) {
        double result = jueduizhi(-3.6);
        System.out.println(result);
    }

    public static double jueduizhi(double number) {
        if (number >= 0)
            return number;
        else
            return -1 * number;
    }
}
