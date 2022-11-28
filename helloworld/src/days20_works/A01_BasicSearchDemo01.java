package days20_works;

public class A01_BasicSearchDemo01 {
    public static void main(String[] args) {
        //顺序查找
        int []arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 23;
        int result = BasicSearch(number,arr);
        System.out.println(result);
        }


    public static int BasicSearch(int num, int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i])
                return i;
        }
        return -1;
    }
}
