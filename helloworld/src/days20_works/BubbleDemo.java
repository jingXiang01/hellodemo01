package days20_works;

public class BubbleDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};
        printArr(Bubble(arr));
    }

    public static int[] Bubble(int []arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
