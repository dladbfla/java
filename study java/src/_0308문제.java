import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _0308문제 {
    public static void main(String[] args){
        //10. 양의정수 10개를 입력
        //배열에 담는다
        //3의 배수만 출력
        System.out.println("정수 10개 입력 : ");
        int[] intArray = new int[10];
        for (int i = 0; i<10; i++){
            Scanner sc = new Scanner(System.in);
            intArray[i] = sc.nextInt();
        }
        for (int i = 0; i<10; i++) {
            if (intArray[i] % 3 == 0) {
                System.out.print(intArray[i] + " ");
            }
        }
    }
}
