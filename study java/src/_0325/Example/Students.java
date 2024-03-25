package _0325.Example;

public class Students {
    String name;
    String department;
    int studentId;

    public Students(String name, String department, int studentId) {
        this.name = name;
        this.department = department;
        this.studentId = studentId;
    }

    public Students() {

    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String toString(){
        return this.name+", "+this.department+", "+this.studentId;
    }
}
