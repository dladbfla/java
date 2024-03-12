import java.util.Arrays;

public class _0312Array문제2 {
    public static void main(String[] args) {
        //배열안에 있는 값의 중복이 몇개인지 확인하는 코드
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int [] fr = new int [arr.length];
        int visited = -1; //같은 값을 중복으로 체크하지 않기 위한 변수
        for(int i = 0; i < arr.length; i++){
            int count = 1; //중복이 몇개인지 카운트 하는 변수
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){ //arr[i]랑 arr[j]가(중복 값을 만나면)같으면 카운트를 1더해주고
                    count++;
                    fr[j] = visited; // fr[j]에 -1을 넣고 나중에 fr[]에 -1이 있으면 프린트 하지 않음
                }
            }
            if(fr[i] != visited)  // 만약에 fr[i]가
                fr[i] = count;       // -1이 아니면 카운트를 넣어줌
        }
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)  // 만약에 fr[i]가 -1이면 출력하지 않음
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
    }
}

