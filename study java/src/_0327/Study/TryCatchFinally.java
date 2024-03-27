package _0327.Study;

public class TryCatchFinally {
    public static void main(String[] args){

        //1. try-catch
        try {
            System.out.println(3/0);
            System.out.println("프로그램 종료1");
        }
        catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료2");
        }

        //2. try-catch-finally
        try {
            System.out.println(3/0);
        }
        catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        }
        finally {
            System.out.println("프로그램 종료3");
        }
        System.out.println();

        try {
            System.out.println(3/1 );
            int a = Integer.parseInt("20");
            int[] arr = {1,2,3,4,5};
            arr[5] = 6;
            System.out.println("프로그램 종료 1");
        }catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료2");
        }catch (NumberFormatException e){
            System.out.println("숫자로 변환할 수 없습니다.");
        }catch (NullPointerException e){
            System.out.println("null 관리 좀 잘하자");
        }catch (Exception e){
            System.out.println("예기치 못한 에러로 인하여 프로그램을 종료합니다.");
        }finally {
            System.out.println("프로그램 종료3");
        }

    }
}
