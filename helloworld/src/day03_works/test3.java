package day03_works;

public class test3 {
    public static void main(String[] args) {
        double fish = 24, huasheng = 8, rice = 3;
        double fangan1 = (fish + huasheng + rice) > 30? (fish + huasheng + rice) * 0.8 : 30;
        double fangan2 = 16 + huasheng + rice ;
        String final_ = fangan1 > fangan2 ? "方案2更划算，价格为：" + fangan2 : "方案2更划算，价格为：" + fangan1;
        System.out.println(final_);

    }
}
