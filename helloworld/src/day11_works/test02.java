package day11_works;

import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        ArrayList<Teacher>  teachers = new ArrayList<>();
        Teacher t1 = new Teacher("赵老师","javase");
        Teacher t2 = new Teacher("钱老师","javaee");
        Teacher t3 = new Teacher("孙老师","php");
        Teacher t4 = new Teacher("李老师","python");

        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
//增，读
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getName()+ " " + teachers.get(i).getMajor());
        }
        //删，改
        for (int i = 0; i < teachers.size(); i++) {
            if(teachers.get(i).getName() == "孙老师")
            {
                teachers.get(i).setName("孙等地");
            }

            if(teachers.get(i).getName() == "李老师")
            {
                teachers.remove(i--);
                // 注意，一旦删除元素，后面的元素会往前走，索引再加1就会有元素遗漏，所以删除后要--
            }
            if(teachers.get(i).getName() == "钱老师")
            {
                teachers.get(i).setMajor("C++");
            }
        }
        for (int j = 0; j < teachers.size(); j++) {
            System.out.println(teachers.get(j).getName()+ " " + teachers.get(j).getMajor());
        }
    }
}
