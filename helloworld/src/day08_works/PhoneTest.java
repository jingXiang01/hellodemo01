package day08_works;

public class PhoneTest {

   public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("小米");
        p.setColor('R');
        p.setPrice(3998);
        p.call();
        p.sendMessage();
    }

}
