package day05_works;

public class test7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] brr = new int[9];
        int count1 = 0,count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                brr[brr.length-1-count1] = arr[i];
                count1++;
            }
            else{
                brr[count2] = arr[i];
                count2++;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
