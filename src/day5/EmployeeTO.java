package day5;

public class EmployeeTO {
    private int empID;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "EmployeeTO{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public EmployeeTO(int empID, String name, int age) {
        this.empID = empID;
        this.name = name;
        this.age = age;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
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
}
