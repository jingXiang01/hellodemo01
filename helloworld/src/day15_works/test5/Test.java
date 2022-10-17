package day15_works.test5;

public class Test {
    public static void main(String[] args) {

        A a = new A();
        a.methodA(new InterA() {
            @Override
            public void showA() {
                System.out.println("123");
            }
        });
        InterAImpl b = new InterAImpl();
        a.methodA(b);//接口的实现类对象调用show方法
    }

    }

