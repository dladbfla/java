package Homework._0403;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함 //힌트 중복을 허용하지 않는 구현체를 쓰면 됨(아마도 set)

        // 여기 코드 작성 !!
        Set<String> ss = new HashSet<>();
        for (int i =0; i<5; i++){
            Scanner sc = new Scanner(System.in);
            String sc1 = sc.nextLine();
            ss.add(sc1);
        }
        System.out.println(ss.toString());

    }
}
