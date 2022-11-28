package days20_works;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        int []arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int num = 25;
        System.out.println(BinarySearch(num, arr));
    }

    public static int BinarySearch(int num, int []arr)
    {
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while (true) {
            if(start > end){
                return -1;
            }
            if (num == arr[mid]) {
                return mid;
            } else if (num > mid) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else if (num < mid) {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
    }

/*    public static int binarySearch(int[] arr, int number){
        //1.定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length - 1;

        //2.利用循环不断的去找要查找的数据
        while(true){
            if(min > max){
                return -1;
            }
            //3.找到min和max的中间位置
            int mid = (min + max) / 2;
            //4.拿着mid指向的元素跟要查找的元素进行比较
            if(arr[mid] > number){
                //4.1 number在mid的左边
                //min不变，max = mid - 1；
                max = mid - 1;
            }else if(arr[mid] < number){
                //4.2 number在mid的右边
                //max不变，min = mid + 1;
                min = mid + 1;
            }else{
                //4.3 number跟mid指向的元素一样
                //找到了
                return mid;
            }

        }
    }*/
}

