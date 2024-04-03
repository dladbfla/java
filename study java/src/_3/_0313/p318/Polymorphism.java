package _3._0313.p318;

class A1{}
class B1 extends A1{}
class C1 extends B1{}
class D1 extends B1{}

public class Polymorphism {
    public static void main(String[] args){
        //A타입의 다향적 표현
        A1 a1 = new A1();  //A는 A이다(ㅇ)
        A1 a2 = new B1();  //B는 A이다(ㅇ)
        A1 a3 = new C1();  //C는 A이다(ㅇ)
        A1 a4 = new D1();  //D는 A이다(ㅇ)

        //B타입의 다향적 표현
//      B1 b1 = new A1();  //A는 B이다(x)
        B1 b2 = new B1();  //B는 B이다(ㅇ)
        B1 b3 = new C1();  //C는 B이다(ㅇ)
        B1 b4 = new D1();  //D는 B이다(ㅇ)

        //C타입의 다향적 표현
//      C1 c1 = new A1();  //A는 C이다(X)
//      C1 c2 = new B1();  //B는 C이다(X)
        C1 c3 = new C1();  //C는 C이다(ㅇ)
//      C1 c4 = new D1();  //D는 C이다(X)

        //D타입의 다향적 표현
//      D1 d1 = new A1();  //A는 D이다(X)
//      D1 d2 = new B1();  //B는 D이다(X)
//      D1 d3 = new C1();  //C는 D이다(X)
        D1 d4 = new D1();  //D는 D이다(ㅇ)
    }
}
