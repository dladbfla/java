package _0313.문제;

public class 문제1 {
    public static void main(String[] args) {
        // 아래 배열중에 짝수만 출력
        int [] arr = new int [] {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}