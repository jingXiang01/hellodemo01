package day10_works;

import static java.lang.String.valueOf;

/*我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。*/
public class test06 {
    public static void main(String[] args) {
        String num = "34242720000128004X";
        boolean result = idtrue(num);
        System.out.println(result);
    }

    public static boolean idtrue(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        if(sb.length() == 18)
        {
            System.out.println(sb.length());
            if(sb.substring(0,1).equals('0'))
            {
                return false;
            }
            else{
                String str1 = sb.substring(0,17);
                System.out.println(str1);
                char []arr = str1.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] > '0' && arr[i] < '9')
                    {
                        String end = sb.substring(17,18);
                        if(end.charAt(0) > '0' && end.charAt(0) < '9' || end.charAt(0) == 'X')
                        {
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        else{
            return false;
        }
    }

}//分开判断即可
