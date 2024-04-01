package _0313.p322;

//클래스의 상속 관계
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class typecasting1 {
    public static void main(String[] args){
        //업캐스팅(자동 변환) : 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
        A ac = (A) new C(); //C -> A업캐스팅(자동변환)
        B bc = (B) new C();

        B bb = new B();
        A a = (A) bb;

        A aa = new A();
//        B b = (B) aa;
//        C c = (C) aa;

        A ab = new B();
        // 1000라인의 코드가 없음
        // 아래에서 ab변수를 B 또는 C타입으로 캐스팅이 필요한 경우!
        if(ab instanceof B){
            B b = (B) ab;
        } else if (ab instanceof C) {
            C c = (C) ab;
        }else {
            System.out.println("둘 다 아니네,, 망했음");
        }

        B bd = new D();
        D d = (D) bd;

        A ad = new D();
        B b1 = (B) ad;
        D da = (D) ad;
    }
}
