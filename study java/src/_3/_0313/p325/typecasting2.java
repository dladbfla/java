package _0313.p325;

class A{
    int m = 3;
    void abc(){
        System.out.println("A 클래스");
    }
}
class B extends A{
    int n = 4;
    void bcd(){
        System.out.println("B 클래스");
    }
}
public class typecasting2 {
    public static void main(String[] args){
        //A타입 /A생성자
        A aa = new A();
        System.out.println(aa.m);
        aa.abc();

        //B타입 /B생성자
        B bb = new B();
        System.out.println(bb.m);
        System.out.println(bb.n);
        bb.abc();
        bb.bcd();

        //A 타입 / B생성자 : 다향적 표현
        A ab = new B();
        System.out.println(ab.m);
        ab.abc();
    }



}
