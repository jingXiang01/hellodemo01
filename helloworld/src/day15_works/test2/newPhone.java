package day15_works.test2;

public class newPhone extends Phone implements IPlay{
    @Override
    public void playGame() {
        System.out.println("新手机在玩游戏");
    }

    @Override
    public void call() {
        System.out.println("新手机在打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机在发短信");
    }
}
