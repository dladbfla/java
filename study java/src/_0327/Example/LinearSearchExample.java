package _0327.Example;

public class LinearSearchExample {
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){ //i가 배열의 길이만큼 반복
            if(arr[i] == key){  //값이 찾으려는 숫자랑 같으면
                return i;  // 값이 들어있는 인덱스 반환
            }
        }
        return -1; //찾으려는 숫자가 인덱스에 없으면 -1반환
    }
    public static void main(String a[]){
        int[] a1= {10,20,30,50,70,90};
        int key = 5;  //50이 몇번 인덱스에 있나
        System.out.println(key+" is found at index: "+linearSearch(a1, key)); //key의 위치는 ?번 인덱스에 있다.
    }
}
