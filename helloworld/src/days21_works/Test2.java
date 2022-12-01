package days21_works;
/*有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!
        以后每天猴子都吃当前剩下来的一一半，然后再多吃一个，
        第10天的时候(还没吃)，发现只剩下一个桃子了，请问，最初总共多少个桃子?*/

public class Test2 {
    public static void main(String[] args) {
        System.out.println(getnum(1));
    }

    //反向递归
    public static int getnum(int num)
    {
        if(num == 10)
            return 1;
        return (getnum(num+1)+1)*2;
    }
}
