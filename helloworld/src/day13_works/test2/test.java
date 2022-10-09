package day13_works.test2;

public class test {
    public static void main(String[] args) {
        xiaomi p = new xiaomi("xiaomi",1999.9);
        System.out.println(p.getBrand() + "," + p.getPrice());
        p.call();
        System.out.println(p.getSize());
    }
}
