package day15_works.test2;

public class oldPhone extends Phone{
    @Override
    public void call() {
        System.out.println("旧手机在打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("旧手机在发信息");
    }
}
