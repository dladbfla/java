package _4._0403;

interface A{
    void method1();  //public abstract 생략 //입력x 리턴x
}

interface B{
    void method2(int a);  //입력ㅇ 리턴x
}

interface C{
    int method3(); //입력x 리턴ㅇ
}

interface D{
    double method4(int a, double b); //입력ㅇ 리턴ㅇ
}
public class Lambda {
    public static void main(String[] args){
        A a0 = new A(){ //익명이너클래스
            public void method1(){
                System.out.println("pattern 1");
            }
        };
        a0.method1();

        A a = () -> System.out.println("pattern 1");  //A에 public void method 메서드 한개만 있기 때문에 생략 //람다식 단축형
        a.method1();

        B b = (int x) -> System.out.println("pattern 2 : " + x);
        B b1 = (x) -> System.out.println("pattern 2 : " + x);
        B b2 = x -> System.out.println("pattern 2 : " + x);  //매개변수가 하나인 경우에만 소괄호 삭제
        b2.method2(5);

        C c = () -> {return 4;};  //리턴이 있으므로 중괄호가 필요함
        C c1 = () -> 4; //리턴을 생략하려면 중괄호도 같이 생략해야함
        System.out.println(c1.method3());

        D d = (int x, double y) -> {return x + y;};
        D d1 = (int x, double y) -> x+y;
        D d2 = (x, y) -> x+y;
        System.out.println(d2.method4(10,5.5));

    }
}
