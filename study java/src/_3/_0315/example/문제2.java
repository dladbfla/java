package _0315.example;

public class 문제2 { //오름차순 정렬
    static void bubble(int[] arr) {
        int n = arr.length;
        int temp = 0; //배열 값을 잠시 저장해두기 위한 변수
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){ //앞에 있는 수랑 현재 수랑 비교해서 앞에 수가 더 크면
                    temp = arr[j-1]; //앞에 있는 수를 temp에 저장
                    arr[j-1] = arr[j]; // 앞에 배열에 현재 수를 앞에 저장
                    arr[j] = temp; //현재 배열에 temp에 저장해둔 앞에 수를 저장
                }

            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        for(int i=0; i < arr.length; i++){ //기존의 배열값을 출력
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubble(arr); //bubble 메서드 실행(오름차순 정렬)

        for(int i=0; i < arr.length; i++){ //오른차순으로 정렬된 배열값을 출력
            System.out.print(arr[i] + " ");
        }
    }
}
