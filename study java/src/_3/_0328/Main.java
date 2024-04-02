package _3._0328;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<User> users;
    static ArrayList<Lecture> lectures;
    static ArrayList<LectureRegistration> lectureRegistrations;
    static ArrayList<Review> reviews;
    static ArrayList<Teacher> teachers;
    static ArrayList<LectureTeacher> lectureTeachers;
    static ArrayList<FreeBoard> freeBoards;


    public static void main(String[] args){
        //정보초기화
        InfoCreate.createInfos();
        reviews = new ArrayList<>();


        //2. 강의 1번 수강생의 loginId 찾기
        lectureLoginId(2);


        //3. 유저의 loginId로 강의명 찾기
        System.out.println("찾을 유저의 아이디 입력 : ");
        Scanner sc2 = new Scanner(System.in);
        String id = sc2.nextLine();

        loginIdLecture(id);

        //4. 강의명으로 수강생들의 이메일 찾기
        System.out.println("찾을 강의 입력 : ");
        Scanner sc3 = new Scanner(System.in);
        String lec = sc3.nextLine();

        titleEmail(lec);

        //review
        boolean canAddReview = false;
        canAddReview = createReview("abc1", 1, 10, "gg");
        createReview("bcd2",2, 3, "ㅋㅋ");  //String loginId, int lectureId, int rating, String text

        //특정 과목Id로 해당 과목을 가르치는 teacher의 이름 출력
        getTeacherByLectureId(1);

        //특정 teacher가 가르치는 과목명 리스트 출력
        getLectureTitleListByTeacherId("bbb2");



    }

    //메서드

    public static void lectureLoginId(int lectureId){
        for (int i = 0; i < lectureRegistrations.size(); i++){
            if (lectureRegistrations.get(i).getLectureId() == lectureId){
                System.out.println(lectureRegistrations.get(i).getUserId());
            }
        }
    }

    public static void loginIdLecture(String id){
        for (int i = 0; i < lectureRegistrations.size(); i++){
            if (lectureRegistrations.get(i).getUserId().equals(id)){
                for (int j = 0; j < lectures.size(); j++){
                    if (lectureRegistrations.get(i).getLectureId() == lectures.get(j).getLectureId()){
                        System.out.println(lectures.get(j).getTitle());
                    }
                }
            }
        }
    }

    public static void titleEmail(String lec){
        for (int i = 0; i<lectures.size(); i++){
            if (lectures.get(i).getTitle().equals(lec)){
                for (int j = 0; j<lectureRegistrations.size(); j++){
                    if (lectureRegistrations.get(j).getLectureId() == lectures.get(i).getLectureId()){
                        for (int k = 0; k<users.size(); k++){
                            if (lectureRegistrations.get(j).getUserId() == users.get(k).getLoginId()){
                                System.out.println(users.get(k).getEmail());
                            }
                        }
                    }
                }
            }
        }
    }

    // 리뷰를 생성하는 메서드 만들기 public boolean createReview(유저아이디, 강의아이디, 레이팅, 텍스트){
    // 내부 기능 : 점수는 1~10점 사이, 점수는 필수 / 한명의 유저가 하나의 강의에 한번 리뷰를 남길 수 있음/ 수강하지 않은 강의에는 리뷰를 남길 수 없음
    // 기능에 에러가 나는 경우에는 메서드가 false 객체가 정상적으로 생성되는 경우에만 true ==> 생성객체는 ArrayList로 관리
    // ex) createReviw("hero11", 1, 10, "좋은 강의였어요") //객체 생성하고 true 리턴
    // ex) createReviw("hero11", 1, 100, "좋은 강의였어요") //정수에러이므로 false 리턴
    // ex) createReviw("tommy", 3, 5, "좋은 강의였어요") //tommy는 3번 강의를 수강하지 않으므로 false 리턴
    public static boolean createReview(String loginId, int lectureId, int rating, String text){
        if (rating < 1 || rating > 10){
            return false;
        }
        for (Review review : reviews){  //배열에서만 쓸 수 있음 //i=0일 때 Review review = reviews[0] => 1씩 증가
            if (review.getLoginId().equals(loginId) && review.lectureId == lectureId){ //string은 equals 씀
                return false;
            }
        }
        boolean canReview = false;
        for (int j = 0; j<lectureRegistrations.size(); j++){
            if (lectureRegistrations.get(j).getUserId().equals(loginId) && lectureRegistrations.get(j).lectureId == lectureId){
                canReview = true;
            }
        }
        if (!canReview){
            return false;
        }
        reviews.add(new Review(reviews.size()+1, lectureId, loginId, rating, text));
        System.out.println(reviews.get(reviews.size()-1).toString());

        return true;
    }

    //3. 관련 메서드 만들기(teacher)
    //getTeacherByLectureId: 특정 과목Id로 해당 과목을 가르치는 teacher의 이름 출력
    //getLectureTitleListByTeacherId: 특정 teacher가 가르치는 과목명 리스트 출력
    //(반드시 String[]또는 List<String>에 담아서 리턴

    public static void getTeacherByLectureId(int lectureId){
        for (LectureTeacher lectureTeacher : lectureTeachers){
            if (lectureTeacher.getLectureId() == lectureId){
                for (Teacher teacher : teachers){
                    if(lectureTeacher.getTeacherId() == teacher.teacherLoginId){
                        System.out.println(teacher.teacherName);
                    }
                }

            }
        }
    }

    public static void getLectureTitleListByTeacherId(String teacherId){
        ArrayList<String> lectureTitle = new ArrayList<>();
        for (LectureTeacher lectureTeacher : lectureTeachers){
            if (lectureTeacher.teacherId == teacherId){
                for (Lecture lecture : lectures){
                    if (lecture.lectureId ==lectureTeacher.lectureId){
                        lectureTitle.add(lecture.title);
                    }
                }
            }
        }
        System.out.println(lectureTitle);
    }

}










