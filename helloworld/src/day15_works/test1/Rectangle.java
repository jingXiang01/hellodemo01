package day15_works.test1;

public class Rectangle extends Shape {

    private double heigh;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double heigh, double width) {
        this.heigh = heigh;
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return getHeigh()*getWidth();
    }

    @Override
    public double perimeter() {
        return 2*(getHeigh()+getWidth());
    }
}
