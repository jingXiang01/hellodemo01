package day15_works.test6;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        B b = new B(new InterB() {
            @Override
            public void showB() {
                System.out.println("内部类输出show函数");
            }
        });
        b.methodB();
    }
}
