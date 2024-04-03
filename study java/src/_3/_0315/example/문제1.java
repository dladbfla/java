package _3._0315.example;

public class 문제1 {
    public static void main(String[] args){
        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        char[] 모음 = {'a', 'e', 'i', 'o', 'u'};
        char[] 자음 = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        String str = "This is a really simple sentence";  // 모음 10개 자음 17개
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        int jcount = 0;
        int mcount = 0;
        for (int i = 0; i < charArray.length; i++){
            for (int j = 0; j < 모음.length; j++) {
                if (모음[j] == charArray[i]) {
                    mcount = mcount + 1;
                }
            }
            for (int k = 0; k < 자음.length; k++) {
                if (자음[k] == charArray[i]) {
                    jcount = jcount + 1;
                }
            }
        }
        System.out.println(jcount);
        System.out.println(mcount);
    }
}
