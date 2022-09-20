package day11_works;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
