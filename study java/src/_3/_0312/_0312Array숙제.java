package _3._0312;

import java.util.Arrays;

public class _0312Array숙제 {
    public static void main(String[] args) {
    //배열안에 있는 값의 중복이 몇개인지 확인하는 코드
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            if (fr[i]==visited){
                continue;
            }
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited) {
                fr[i] = count;
            }
            System.out.println(Arrays.toString(fr));
        }
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
    }
}
