package day03_works;

public class test1 {
    public static void main(String[] args) {
        double father = 177;
        double mother = 165;
        double son = (father +mother) * 1.08 / 2;
        double daughter = (father * 0.923 + mother) / 2;

        System.out.println("儿子的身高为：" + son);
        System.out.println("女儿的身高为：" + daughter);
    }
}
