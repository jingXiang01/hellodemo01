package day10_works;

public class test05 {
    public static void main(String[] args) {
        String str = "abcba";
        boolean result = reverseequal(str);
        System.out.println(result);
    }

    public static boolean reverseequal(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString();
        if(str.equals(str2))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
