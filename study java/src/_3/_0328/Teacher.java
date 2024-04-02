package _3._0328;

import java.time.LocalDate;

//1. Teacher클래스
//User의 로그인ID처럼 teacherId필요
//이름필드 필요
//기타 필요한 필드는 각자 알아서
public class Teacher {
    String teacherName;
    String teacherLoginId;
    String teacherPassword;

    public Teacher() {
    }

    public Teacher(String teacherName, String teacherLoginId, String teacherPassword) {
        this.teacherName = teacherName;
        this.teacherLoginId = teacherLoginId;
        this.teacherPassword = teacherPassword;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherLoginId() {
        return teacherLoginId;
    }

    public void setTeacherLoginId(String teacherLoginId) {
        this.teacherLoginId = teacherLoginId;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    public String toSting(){
        return teacherName+", "+teacherLoginId+", "+teacherPassword;
    }


}
