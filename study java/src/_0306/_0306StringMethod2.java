package _0306;

import java.util.Arrays;

public class _0306StringMethod2 {
    public static void main(String[] args){
        //문자열 수정
        //@toLowerCase(), toUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        //@replace()
        System.out.println(str1.replace("Study", "공부"));

        //@substring()
        System.out.println(str1.substring(0, 5));

        //@split()
        //splite 메소드의 리턴형은 String[] 문자열의 배열이다
        String[] strArray ="abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));

        //@trim()//앞뒤 공백 제거
        String _str1 = "    abc  def    ";
        _str1 = _str1.trim();
        System.out.println(_str1);
        //@replaceAll()//모든 공백 제거
        System.out.println(_str1.replaceAll(" ",""));

        System.out.println();

        //문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        //@stack 메모리 비교(==): 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);

        //@equals(), equalsIgnoreCase(): 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str2.equalsIgnoreCase(str4));

    }
}
