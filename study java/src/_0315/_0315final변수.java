package _0315;

class A1{
    int a = 3;
    final int b = 5;
    A1(){

    }
}
class A2{
    int a;
    final int b;
    A2(){
        a = 3;
        b = 5;
    }
}
class A3{
    int a = 3;
    final int b = 5;
    A3(){
        a = 5;
        // b = 5; -> final필드는 최초 선언된 이후 값을 대입할 수 없음.
    }
}
class B{
    void bcd() {
        int a = 3;
        final int b = 5;
        a = 7;
        //b = 9; -> final 지역변수도 최초 선언된 이후 값을 대입할 수 없음.
    }
}
public class _0315final변수 {
    public static void main(String[] args){
        //객체생성
        A1 a1 = new A1();
        A2 a2 = new A2();

        //필드값 변경
        a1.a = 7;
        //a1.b = 9; -> final 필드는 한 번 정해진 값을 변경할 수 없음.
        a2.a = 7;
        //a2.b = 9; -> final 필드는 한 번 정해진 값을 변경할 수 없음.
    }
}
