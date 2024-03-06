import java.util.Arrays;
import java.util.Scanner;

public class _0306문제 {
    public static void main(String[] args){
        //1. 길이가 10인 배열에 1부터 10까지 값을 입력
        int[] intArray1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(intArray1));
        //반복문
        int[] intList1 = new int[10];
        for (int i = 0; i < 10; i++){
            intList1[i] = i + 1;
        }
        System.out.println(Arrays.toString(intList1));
        System.out.println();

        //2. 10~1
        int[] intArray2 = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(intArray2));
        //반복문 사용
        int[] intList2 = new int[10];
        int len = intList2.length;
        for (int i = 0; i < 10; i++){
            intList2[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intList2));
        System.out.println();

        //3. 아래 과일 배열에 "사과"가 몇번 들어있는지 확인
        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count = 0;
        for (int i = 0; i < fruitList.length; i++){
            if (fruitList[i] == "사과"){
                count = count + 1;
            }
        }
        System.out.println(count);
        System.out.println();

        //4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        Scanner scan = new Scanner(System.in);
        System.out.println("0~6까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();
        if (num>=0&&num<=6) {
            System.out.println(week[num]);
        }else {
        }

        //5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        //"~~~님 환영합니다"를 출력하고
        //없으면 "회원가입해주세요"를 출력(단, 대소문자 구분하지 마시오)
        //방법 1
        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        boolean a = false;
        for (int i = 0; i < members.length; i++) {
            a = members[i].equalsIgnoreCase(name);
            if (a) {
                break;
            }
        }
        if (a) {
            System.out.println(name + "님 환영합니다.");
        } else {
            System.out.println("회원가입해주세요");
        }
        //방법 2
        for (int i = 0;i<members.length;i++){
            if (members[i].equalsIgnoreCase(name)){
                System.out.println(members[i] + "님 환영합니다.");
                break;
            }
            if (i==members.length-1){
                System.out.println("회원가입해주세요");
            }
        }
    }
}
