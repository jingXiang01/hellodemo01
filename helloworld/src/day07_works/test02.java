package day07_works;
/*判断101~200之间有多少个素数，并输出所有素数。

备注：素数就是质数*/
public class test02 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 101; i <= 200; i++)
        {
            if(sushu(i))
            {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean sushu(int number)
    {
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
