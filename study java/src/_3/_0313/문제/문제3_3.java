package _3._0313.문제;

public class 문제3_3 { //3_1에서 왼쪽으로 값 이동 -> 오른쪽으로
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};

        int n = 3;

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) { //arr배열의 기존 값을 출력
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){ //아래 작업을 3번 반복
            int j, first;

            first = arr[arr.length-1]; // 포인트 1 //first에 배열의 첫번째 값을 저장
            for(j = arr.length-1; j > 0; j--){ //아래 작업을 4번(인덱스 길이의 -1) 반복
                arr[j] = arr[j-1]; //배열의 j인덱스에 j+1의 값을 넣음(j는 1씩 증가)`
            }
            arr[j] = first;  // 포인트 2  //인덱스4에 first에 저장해둔 배열의 첫번째 값을 저장
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){ //현재 배열 출력
            System.out.print(arr[i] + " ");
        }
    }
}
