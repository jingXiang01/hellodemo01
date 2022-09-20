package day11_works;

public class Teacher {
    private String name;
    private String major;

    public Teacher()
    {}

    public Teacher(String name, String major)
    {
        this.name = name;
        this.major = major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }
}
