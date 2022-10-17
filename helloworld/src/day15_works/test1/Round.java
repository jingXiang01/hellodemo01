package day15_works.test1;

public class Round extends Shape {
    private  int r;
    final private double PI = 3.14;

    public Round() {
    }

    public Round(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double area() {

        return getR()*PI*getR();
    }

    @Override
    public double perimeter() {

        return PI*2*getR();
    }
}
