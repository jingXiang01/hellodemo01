package day14_works;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   /* public void keepPet(Dog dog,String something)
    {
        dog.eat(something);
    }

    public void keepPet(Cat cat,String something)
    {
        cat.eat(something);
    }*/

    public void keepPet(Animal a,String something)
    {
        if(a instanceof Dog )
        {
            Dog d1 = (Dog) a;
            d1.eat("骨头");
        } else if (a instanceof Cat) {
            Cat c1 = (Cat) a;
            c1.eat("鱼");
        }
        else {
            System.out.println("没有这个类型，错误");
        }
    }
}
