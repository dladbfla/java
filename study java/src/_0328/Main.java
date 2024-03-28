package _0328;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<User> users;
    static ArrayList<Lecture> lectures;
    static ArrayList<LectureRegistration> lectureRegistrations;

    public static void main(String[] args){
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("steve", "abc1", "123!",
                LocalDate.of(1999,1,2), "ABC.gmail.com");
        users.add(user1);
        User user2 = new User("Tom", "bcd2", "234!",
                LocalDate.of(2002,2,5), "BCD.naver.com");
        users.add(user2);
        User user3 = new User("Paul", "cde3", "345!",
                LocalDate.of(1997,6,21), "CDE.gmail.com");
        users.add(user3);
        User user4 = new User("susie", "def4", "456!",
                LocalDate.of(2003,12,12), "DEF.daum.net");
        users.add(user4);
        User user5 = new User("alex", "efg5", "567!",
                LocalDate.of(1989,10,30), "EFG.naver.com");
        users.add(user5);

        ArrayList<Lecture> lectures = new ArrayList<>();
        Lecture lecture1 = new Lecture(1, "Java", 100
                , "Programming", "beginner");
        lectures.add(lecture1);
        Lecture lecture2 = new Lecture(2, "Spring", 150
                , "Programming", "intermediate");
        lectures.add(lecture2);
        Lecture lecture3 = new Lecture(3, "Javascript", 80
                , "Programming", "beginner");
        lectures.add(lecture3);

        ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
        LectureRegistration lectureRegistration1 = new LectureRegistration("abc1",1);
        lectureRegistrations.add(lectureRegistration1);
        LectureRegistration lectureRegistration2 = new LectureRegistration("bcd2",2);
        lectureRegistrations.add(lectureRegistration2);
        LectureRegistration lectureRegistration3 = new LectureRegistration("bcd2",3);
        lectureRegistrations.add(lectureRegistration3);
        LectureRegistration lectureRegistration4 = new LectureRegistration("cde3",1);
        lectureRegistrations.add(lectureRegistration4);
        LectureRegistration lectureRegistration5 = new LectureRegistration("def4",2);
        lectureRegistrations.add(lectureRegistration5);
        LectureRegistration lectureRegistration6 = new LectureRegistration("dfg5",3);
        lectureRegistrations.add(lectureRegistration6);


        //2. 강의 1번 수강생의 loginId 찾기
        lectureLoginId();


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

    }
    public static void lectureLoginId(){
        for (int i = 0; i < lectureRegistrations.size(); i++){
            if (lectureRegistrations.get(i).getLectureId() ==1){
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

}
