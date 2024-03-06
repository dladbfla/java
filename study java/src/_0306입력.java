import java.util.Scanner;

public class _0306입력 {
    public static void main(String[] args){
        //자바에서 입력값을 받는 방법
        Scanner sc1 = new Scanner(System.in);
        System.out.println("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc1.nextInt();
        if (inputNumber >= 0 && inputNumber <=6){
            System.out.println(inputNumber);
        }else {
            System.out.println("잘못입력하셨습니다.");
        }

        //자바에서 문자열을 입력 받는 방법
        Scanner sc2 = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 : ");
        String inputstr = sc2.nextLine();
        System.out.println(inputstr);
    }
}
