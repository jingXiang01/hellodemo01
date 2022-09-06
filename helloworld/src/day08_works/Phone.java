package day08_works;

public class Phone {
    private String brand;
    private double price;
    private char color;

    public Phone()
    {}
    public Phone(String brand, double price, char color)
    {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public char getColor() {
        return color;
    }

    public  void call(){
        System.out.println("正在使用价格为" + price + "元" + color + "色的" + brand + "手机打电话....");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为" + price + "元" + color + "色的" + brand + "手机发短信....");
    }
}
