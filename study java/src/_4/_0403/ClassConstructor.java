package _4._0403;

interface CC{
    Myclass method();
}

interface CC2{
    Myclass method(int k);
}

class Myclass{
    int k;
    Myclass(){
        System.out.println("MyClass 기본 생성자");
    }
    Myclass(int k){
        System.out.println("매개변수 생성자" + k);
        this.k = k;
    }
}


public class ClassConstructor {
    public static void main(String[] args) {
        //함수인터페이스 메서드가 외부클래스를 리턴하는 경우
        //메스드내에서 외부클래스의 생성자를 이용하여 객체를 생성해야함
        CC a1 = new CC() {  //익명이너클래스
            @Override
            public Myclass method() {
                return new Myclass();
            }
        };

        CC a2 = () -> new Myclass();  //람다식 단축형1
        CC a3 = Myclass::new;  //람다식 단축형2
        a3.method();

        CC2 c1 = (int k) -> new Myclass(k);
        CC2 c2 = Myclass::new;
        c1.method(5);
    }
}
