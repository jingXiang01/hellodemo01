package day07_works;
/*需求：

​	把一个数组中的元素复制到另一个新数组中去。*/
public class test04 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,9};
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
                brr[i] = arr[i];
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
