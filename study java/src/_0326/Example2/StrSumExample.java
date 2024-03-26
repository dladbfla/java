package _0326.Example2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StrSumExample {
    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        char[] str1 = str.toCharArray();
        for (int i = 0; i<str1.length; i++){
            sum = sum + str1[i] -48;
        }
        System.out.println("합계는 " + sum); // 15
    }
}
