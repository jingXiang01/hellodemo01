package day07_works;

/*把上一题加密之后的数据进行解密*/
public class test07 {
    public static void main(String[] args) {
        int secret = 8346;
        int key = 0;
        //新数首先加上10 减去5 再模10，再翻转
        while (secret % 10 != 0) {
            int ge = secret % 10;
            ge = (ge + 10 - 5) % 10;
            key = key * 10 + ge;
            secret = secret / 10;
        }
        System.out.println(key);
    }
}
