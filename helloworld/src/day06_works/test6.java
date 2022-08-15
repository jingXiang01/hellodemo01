package day06_works;

/*	定义一个方法equals(int[] arr1,int[] arr2).

功能：

​	比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）*/
public class test6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,8,9};
        int[] arr2 = {1,2,3,8,9,5};
        boolean flag = equals(arr1,arr2);
        System.out.println("两个数组相等为：" + flag);
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i])
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
