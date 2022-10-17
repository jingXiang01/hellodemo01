package day15_works.test1;

public class Test {
    public static void main(String[] args) {
        Round r = new Round(2);
        System.out.println("圆的：");
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println("长方形的：");
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

    }
}
