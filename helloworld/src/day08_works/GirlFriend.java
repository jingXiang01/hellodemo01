package day08_works;

public class GirlFriend {
    private String name;
    private double height;
    private double weight;

    public GirlFriend() {
    }

    public GirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void show()
    {
        System.out.println("身高为" + this.height + "姓名为" + this.name + this.weight);
    }

    public void wash()
    {
        System.out.println("女朋友在洗衣服");
    }
    public void cook()
    {
        System.out.println("女朋友在做饭");
    }
}
