package _0325.Example;

public class SelectionSortExample {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) //arr이 0~배열길이만큼 반복
        {
            int index = i; //index에 i 저장
            for (int j = i + 1; j < arr.length; j++){ //arr[i] 0일 때 arr[1]~배열길이만큼
                if (arr[j] < arr[index]){ //기준(arr[i]가 비교대상(arr[j]보다 작으면
                    index = j; //index에 j저장 //가장 작은 수가 있는 배열의 인덱스가 저장됨
                }
            }
            int smallerNumber = arr[index]; //smallerNumber 변수에 가장 작은 수를 저장
            arr[index] = arr[i]; //가장 작은 수가 저장되어 있던 인덱스에 비교 기준이 되었던 수를 저장
            arr[i] = smallerNumber; // 처음 기준 인덱스에 가장 작은 수 저장
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr1){     //처음 배열 출력
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1); //메소드 불러오기

        System.out.println("After Selection Sort");
        for(int i:arr1){        // 정렬된 배열 출력
            System.out.print(i+" ");
        }
    }
}
