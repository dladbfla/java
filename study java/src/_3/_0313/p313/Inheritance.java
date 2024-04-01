package _0313.p313;

class Human{
    String name;
    int age;
    void eat(){}
    void sleep(){}
}
class Student extends Human {
    int studentID;
    void goToSchool(){}
}
class Worker extends Human {
    int workerID;
    void goToWork(){}
}
public class Inheritance {
    public static void main(String[] args) {
        Human h = new Human(); //휴먼 객체생성
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        Student s = new Student(); //Student 객체 생성
        s.name = "김민성";
        s.age = 16;
        s.studentID = 128;
        s.eat();
        s.sleep();
        s.goToSchool();

        Worker w = new Worker(); //Worker 객체생성
        w.name = "봉윤정";
        w.age = 45;
        w.workerID = 128;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}
