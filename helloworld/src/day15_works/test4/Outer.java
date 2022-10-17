package day15_works.test4;

public class Outer {

    public static Inter method() {
        //普通内部类
        class Son implements Inter {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        }
        //这里要实例化，因为返回的是一个对象
        return new Son();
    }
}
