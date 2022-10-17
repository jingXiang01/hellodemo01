package day15_works.test3;
//一个抽象类Fun中有一个抽象方法 fun() , 在测试类中如何调用该方法?
//
//​		要求1.创建子类继承抽象类的方式实现
//		要求2:用匿名内部类实现
public class Test2 {
    public static void main(String[] args) {
        Funimp fp = new Funimp();
        fp.fun();

        Fun f = new Fun(){
            @Override
            public void fun() {
                System.out.println("匿名内部类中的fun方法");
            }
        };
        f.fun();
    }
}
