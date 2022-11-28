package days20_works;
/*
## 2. 选择排序

        ### 2.1 算法步骤

        1. 从0索引开始，跟后面的元素一一比较
        2. 小的放前面，大的放后面
        3. 第一次循环结束后，最小的数据已经确定
        4. 第二次循环从1索引开始以此类推
        5. 第三轮循环从2索引开始以此类推
        6. 第四轮循环从3索引开始以此类推。
*/
public class SelectionDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};
        printArr(SelectSearch(arr));
    }
    public static int[] SelectSearch(int []arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }
    private static void printArr(int[] arr) {
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
