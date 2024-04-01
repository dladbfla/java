package _0313.문제;

import java.util.Arrays;

public class 문제2 {
    public static void main(String[] args) {
        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;
        char[] a = string.toCharArray();
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++){
            if (a[i] != ' ')
                count = count + 1;
        }
        System.out.println(count);
    }
}
