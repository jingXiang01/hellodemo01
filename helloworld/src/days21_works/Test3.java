package days21_works;
/*可爱的心明特别喜欢爬楼梯，他有的时候一次爬- 一个台阶，有的时候一次爬两个台 阶。
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢?*/
//F(n) = F(n - 1) + F(n - 2)
public class Test3 {
    public static void main(String[] args) {
        System.out.println(getkind(20));
    }

    public static int getkind(int num){
        if(num == 1)
            return 1;
        if(num == 2)
            return 2;
        return getkind(num - 1) + getkind(num - 2);
    }
}
