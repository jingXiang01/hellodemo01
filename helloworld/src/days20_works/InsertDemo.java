package days20_works;

public class InsertDemo {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        printArr(Insert(arr));
    }

    public static int[] Insert(int []arr)
    {
        int index = youxu(arr);
        for (int i = index + 1; i < arr.length; i++) {
            int j = i;
                while( j > 0 && arr[j] < arr[j - 1]){
                    //交换位置
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;

            }
        }
        return arr;
    }

    //判断有序的部分
    public static int youxu(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1])
                return i;
        }
        return arr.length - 1;
    }

    private static void printArr(int[] arr) {
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
