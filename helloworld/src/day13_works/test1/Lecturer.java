package day13_works.test1;

public class Lecturer extends Teacher {
    public Lecturer() {
        super();
    }
    public Lecturer(int id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("讲师在工作");
    }
}
