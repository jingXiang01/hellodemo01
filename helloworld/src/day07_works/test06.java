package day07_works;
/*需求：

​	某系统的数字密码（大于0），比如1983，采用加密方式进行传输。

规则如下：

​	先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
*/
public class test06 {
    public static void main(String[] args) {
        int key = 1983;
        int secret = 0;
        while (key % 10 != 0)
        {
            int ge = key % 10;
            ge = (ge + 5)%10;
            secret = secret*10 + ge;
            key = key/10;
        }
        System.out.println(secret);
    }
}
