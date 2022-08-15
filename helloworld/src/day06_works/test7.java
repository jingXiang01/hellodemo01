package day06_works;

/*需求：

​	定义一个方法fill(int[] arr,int value)

功能：

​	将数组arr中的所有元素的值改为value*/
public class test7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 96, 7, 3};
        int[] brr = fill(arr, 6);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    public static int[] fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
