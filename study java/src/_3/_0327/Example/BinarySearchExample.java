package _3._0327.Example;

public class BinarySearchExample {
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;  //인덱스의 중간
        while( first <= last ){  //first가 last보다 커질 때까지 반복
            if ( arr[mid] < key ){ //배열의 mid 인덱스에 들어있는 수가 찾으려는 수(key)보다 작을 때
                first = mid + 1;  //first에 mid + 1을 저장
            }else if ( arr[mid] == key ){  //배열의 가운데 인덱스에 들어있는 수가 찾으려는 수랑 같으면
                System.out.println("Element is found at index: " + mid); //찾으려는 수가 들어있는 인덱스 출력
                break; //반복문을 빠져나감
            }else{  //배열의 mid인덱스에 들어있는 수가 찾으려는 수(key)보다 클 때
                last = mid - 1;  //last에 mid-1 저장
            }
            mid = (first + last)/2; //mid값을 다시 저장(원래 mid에 들어있던 수가 key보다 크면 last-1이 되었고 작으면 first+1이 되었음
        }
        if ( first > last ){  //first가 last가 커지면(전부 조회 했음)
            System.out.println("Element is not found!"); //찾을 수 없다고 출력
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int last=arr.length-1;  //last는 배열의 마지막 인덱스
        binarySearch(arr,0,last,key);  //first는 배열의 첫번째 인덱스 = 0
    }
}
