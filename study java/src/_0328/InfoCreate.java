package _0328;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Dictionary;

public class InfoCreate {
    public static void createInfos(ArrayList<LectureRegistration> lectureRegistrations){  //매개변수에 입력해서 가져올 수도 있고
        Main.users = new ArrayList<>();                                                   //배열명 앞에 Main을 붙여줘도 됨
        User user1 = new User("steve", "abc1", "123!",
                LocalDate.of(1999,1,2), "ABC.gmail.com");
        Main.users.add(user1);
        User user2 = new User("Tom", "bcd2", "234!",
                LocalDate.of(2002,2,5), "BCD.naver.com");
        Main.users.add(user2);
        User user3 = new User("Paul", "cde3", "345!",
                LocalDate.of(1997,6,21), "CDE.gmail.com");
        Main.users.add(user3);
        User user4 = new User("susie", "def4", "456!",
                LocalDate.of(2003,12,12), "DEF.daum.net");
        Main.users.add(user4);
        User user5 = new User("alex", "efg5", "567!",
                LocalDate.of(1989,10,30), "EFG.naver.com");
        Main.users.add(user5);

        Main.lectures = new ArrayList<>();
        Lecture lecture1 = new Lecture(1, "Java", 100
                , Category.PROGRAMING, Defficulty.ADVANCED);
        Main.lectures.add(lecture1);
        Lecture lecture2 = new Lecture(2, "Spring", 150
                , Category.PROGRAMING, Defficulty.BEGINNER);
        Main.lectures.add(lecture2);
        Lecture lecture3 = new Lecture(3, "Javascript", 80
                , Category.PROGRAMING, Defficulty.INTERMEDIATE);
        Main.lectures.add(lecture3);

        lectureRegistrations = new ArrayList<>();  //선언은 위에서 했고 대입만 함 // 같이 하려면 ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
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

        Main.reviews = new ArrayList<>();
        Review review1 = new Review(1, 1, "abc1", 5, "ㅋㅋ");
        Main.reviews.add(new Review(2,2,"bcd", 10,"good"));
    }
}
