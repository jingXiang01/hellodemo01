package day13_works.test1;

import day13_works.test1.Employee;

public class Teacher extends Employee {
    public Teacher(int id, String name) {
        super(id,name);
    }

    public Teacher() {
    }

    @Override
    public void work(){
        System.out.println("教研部员工工作");
    }
}
