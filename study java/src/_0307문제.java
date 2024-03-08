import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _0307문제 {
    public static void main(String[] args){
        //6. 아래 배열에서 입력받은 값보다 큰 수만 출력하시오
        int [] intList1 = {1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);
        System.out.println("0~10까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();
        /*for (int i = 0; i<intList1.length; i++){
            if(intList1[i] >num){
                System.out.print(intList1[i] + " ");
            }
        }*/
        // 큰 수를 새로운 배열에 담기1(선생님) //count를 안 넣으면 0,0,0,0,0,0,7,8,9,10(6입력시)으로 출력됨
        /*int[] intList2 = new int[intList1.length];
        int count = 0;
        for (int i = 0; i < intList1.length; i++){
            if (intList1[i]>num){
                intList2[count] = intList1[i];
                count = count + 1;
            }
        }
        System.out.print(Arrays.toString(intList2));*/ //7,8,9,10,0,0,0,0,0,0으로 출력(6입력시)
        // 새로운 배열에 담기2(선생님) // 000출력 안되게
        ArrayList<Integer> intList3 = new ArrayList<Integer>();
        for(int i = 0; i < intList1.length; i++){
            if (intList1[i] > num){
                intList3.add(intList1[i]);
            }
        }
        System.out.print(intList3.toString());
        System.out.println();

        //7. 아래 배열의 총합과 평균을 구하시오
        int [] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int sum = 0;
        for (int i = 0; i < numberList.length; i++){
            sum = sum + numberList[i];
        }
        System.out.println(sum);
        System.out.println((double) sum/numberList.length);

        //8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        System.out.println("문자열을 입력 : ");
        Scanner str = new Scanner(System.in);
        String str1 = scan.next();
        char[] strList1 = str1.toCharArray();
        char[] strList2 = new char[strList1.length];
        int index = strList1.length-1;
        for (int i = 0;i < strList1.length; i++){
            strList2[i] = strList1[index];
            index = index - 1;
        }
        //System.out.println(Arrays.toString(strList2));
        for (int i = 0; i < strList2.length; i++){
            System.out.print(strList2[i]);
        }
        System.out.println();

        //난수생성법, random 숫자 만드는 법
        Random rd = new Random();
        int ranDom = rd.nextInt(10); //0부터 입력한 (정수값 -1)범위에서 랜덤
        System.out.println(ranDom);

        //9. 1~45까지의 랜덤한 정수를 length가 6인 배열에 넣으시오
        //단. 중복 숫자는 허용하지 않음
        int[] number1 = new int[6];
        Random number2 = new Random();
        for (int i = 0; i < number1.length; i++){
            int number3 = number2.nextInt(45)+1;
            for (int j = 0; j < i; j++){
                if (number3 == number1[j]){
                    i=i-1;
                    break;
                }else {
                    number1[i] = number3;
                }
            }
        }
        System.out.println(Arrays.toString(number1));
    }
}
