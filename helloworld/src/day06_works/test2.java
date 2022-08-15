package day06_works;

public class test2 {
    public static void main(String[] args) {
       int result =  getMax(5,12,19);
        System.out.println(result);
    }
    public static int getMax(int a, int b, int c){
      int result =  (a>b?a:b)>c?(a>b?a:b):c;
      return result;
    }
}
