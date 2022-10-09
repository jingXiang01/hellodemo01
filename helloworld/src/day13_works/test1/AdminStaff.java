package day13_works.test1;

public class AdminStaff extends Employee {
    public AdminStaff() {
    }

    public AdminStaff(int id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("行政部员工工作");
    }
}
