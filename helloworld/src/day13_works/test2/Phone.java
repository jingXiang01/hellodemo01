package day13_works.test2;

public class Phone {
    private String brand;
    private double price;

    private static int size = 6;
    //默认所有手机尺寸都是6寸

    public static int getSize() {
        return size;
    }

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("faxinxi");
    }
    public void playGame(){
        System.out.println("wanyouxi");
    }
}
