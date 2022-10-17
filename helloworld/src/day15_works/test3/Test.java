package day15_works.test3;
//接口IPlay中有一个方法playGame()，在测试类中如何调用该方法？
//
//​		要求1.创建子类实现接口的方式实现
//		要求2:用匿名内部类实现
public class Test {
    public static void main(String[] args) {
        IPlayimp ip = new IPlayimp();
        ip.playGame();

        IPlay IP = new IPlay(){

            @Override
            public void playGame() {
                System.out.println("匿名内部类的玩游戏");
            }
        };
        IP.playGame();
    }
}
