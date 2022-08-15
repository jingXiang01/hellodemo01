package day06_works;
/*需求：

​	定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)

功能：

​	将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value*/
public class test8 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 96, 7, 3};
        int[] brr = fill(arr, 1, 3, 2);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value)
    {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
