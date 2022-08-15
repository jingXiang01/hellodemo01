package day06_works;

/*需求：

​	定义一个方法copyOf(int[] arr, int newLength)

功能：

​	将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始*/
public class test9 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 96, 7, 3};
        int[] brr = copyOf(arr, 3);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] brr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
}
