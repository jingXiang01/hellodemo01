package days20_works;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,1, 6, 2, 7, 9, 3, 4, 5, 1,10, 8};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int []arr, int i, int j)
    {

        int start = i;
        int end = j;

        if(start > end)
        {
            return;
        }
        int principle = arr[i];
        while(end != start){
            while (true){
                if(arr[end] < principle || end <= start)
                    break;
                end--;
            }
            while (true){
                if(arr[start] > principle || end <= start)
                    break;
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quicksort(arr,i,start - 1);
        quicksort(arr,start + 1,j);
    }
}
