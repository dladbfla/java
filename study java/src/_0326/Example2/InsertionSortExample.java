package _0326.Example2;

public class InsertionSortExample {
    // Insertion 정렬의 알고리즘을 이해하고
    // 어떤 정렬상태가 주어졌을때 가장 빨리 정렬을 마무리할지 생각해봅시다!! = Best Case
    // 반대로 어떤 정렬 상태가 주어졌을때 가장 오래 걸릴까?? = Worst Case
    public static void insertionSort(int array[]) {
        int n = array.length;  //n은 길이
        for (int j = 1; j < n; j++) {  //j가 1~길이 만큼 반복
            int key = array[j];  //key에 array[j](arr[1]) 저장
            int i = j-1;  //i는 j-1(0)
            while ( (i > -1) && ( array [i] > key ) ) {  //i가 -1보다 크고 arr[i](arr[0])가 key(arr[1)보다 크면 반복문 실행
                array [i+1] = array [i];   //array[i+1](arr[1])에 array[i](arr[0])저장
                i--;   //i 1감소  //i가 -1이 됨  //-1이 되면 반복문 정지
            }
            array[i+1] = key;  //i[0]에 key(i[1])저장
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");  //정렬 전 출력
        for(int i:arr1){  //i = 0; i<arr1.length; i++과 같이 진행
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort   //메서드 실행

        System.out.println("After Insertion Sort");   //정렬 후 출력
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
