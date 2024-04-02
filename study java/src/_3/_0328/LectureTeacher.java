package _3._0328;

//2. LectureTeacher 클래스
//어느 teacher가 어느 과목을 가르치는지 관계를 저장하는 클래스
public class LectureTeacher {
    String teacherId;
    int lectureId;

    public LectureTeacher() {
    }

    public LectureTeacher(String teacherId, int lectureId) {
        this.teacherId = teacherId;
        this.lectureId = lectureId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}
