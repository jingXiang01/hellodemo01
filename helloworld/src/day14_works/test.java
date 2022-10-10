package day14_works;

import com.sun.org.apache.bcel.internal.generic.Select;

public class test {
    public static void main(String[] args) {
        Dog d = new Dog(2,"黑");
        Cat c = new Cat(3,"灰");
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);
       // p1.keepPet(d,"骨头");
        //p2.keepPet(c,"鱼");
        Animal a1 = new Dog(2,"黑");
        Animal a2 = new Cat(3,"灰");
        p1.keepPet(a1,"骨头");
        p2.keepPet(a2,"鱼");
    }


}
