package _4._0401;

class MyClass<T>{
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
public class Generic {
    public static void main(String args){
        //Myclass<T>  //생성 단계는 T를 둘 수 없고 구체적인 클래스 이름이 들어가야한다
        MyClass<String> mc1 = new MyClass<String>(); //클래스의 생성 단계
        mc1.set("안녕");  //생성단계에서 자료형을 결정했기 때문에 입력단계에서 특정 자료형만 받음
        System.out.println(mc1.get());

        MyClass<Integer> mc2 = new MyClass<Integer>();//Integer는 int자료형의 warapper클래스 //기본자료형은 쓸 수 없고 래퍼클래스로 써야함
        mc2.set(100);
        System.out.println(mc2.get());
    }
}
