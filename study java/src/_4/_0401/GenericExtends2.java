package _4._0401;

class E{}
class F extends E{}
class G extends F{}
class H extends G{}
class Goods2<T>{
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}
//제네릭 클래스를 메서드의 입력매개변수(=파라미터)로 사용하는 경우의 문법!
class Test{
    void method1(Goods2<E> g){} //<T>를 사용할 수 없음! 구체적인 클래스 명시
    void method2(Goods2<?> g){} //어떤 것이든 받고 싶어서 만든게 ?를 넣는 것 //어떤 클래스던 가능
    void method3(Goods2<? extends F> g){}  //그중에서도 제한하기 //F의 자식들로 제한 //F와 F의 자식클래스 가능
    void method4(Goods2<? super F> g){} //F의 부모로 제한 //F와 F의 부모클래스 가능
}

public class GenericExtends2 {
    public static void main(String[] args){
        Test test = new Test();

        //case1 : Goods2<E>
        test.method1(new Goods2<E>()); //E만 가능
        //test.method1(new Goods2<F>()); //불가능

        //case2 : Goods<?>    //다 가능
        test.method2(new Goods2<E>());
        test.method2(new Goods2<F>());
        test.method2(new Goods2<G>());
        test.method2(new Goods2<H>());

        //case3 : Goods2<? extends F>
        //test.method3(new Goods2<E>()); //=> 불가능   //F와 F의 자식만 가능
        test.method3(new Goods2<F>());
        test.method3(new Goods2<G>());
        test.method3(new Goods2<H>());

        //case4 : Goods2<? super F>
        test.method4(new Goods2<E>());
        test.method4(new Goods2<F>());
        //test.method4(new Goods2<G>());  //=>불가능   //F와 F의 부모만 가능
        //test.method4(new Goods2<H>());  //=> 불가능

    }
}
