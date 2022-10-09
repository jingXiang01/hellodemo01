package day13_works.test1;

import day13_works.test1.Lecturer;
import day13_works.test1.Maintainer;

public class test {
    public static void main(String[] args) {
        Maintainer m = new Maintainer(01,"zhangdan");
        System.out.println(m.getId());
        Lecturer l = new Lecturer(02,"lisi");
        l.work();
    }



}
