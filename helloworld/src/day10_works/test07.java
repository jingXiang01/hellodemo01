package day10_works;

import java.util.StringJoiner;

public class test07 {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4};
        System.out.println(pingjie(arr));
    }

    public static String pingjie(int []num)
    {
        if(num == null)
        {
            return null;
        }
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < num.length; i++) {
            sj.add(num[i] + "");
        }
        return sj.toString();
    }
}
