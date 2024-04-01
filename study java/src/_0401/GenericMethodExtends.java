package _0401;

class AA {
    public <T extends Number> void methods1(T t){ //제네릭메서드 범위 제한
        System.out.println(t.intValue());
    }
}
interface Myinterface{
    public abstract void print();

}
class BB{
    public <T extends Myinterface> void methods2(T t){
        //사용자가 정의한 Myinterface의 자식만 제네릭T 위치에 올 수 있음
        //이렇게 함으로써 사용자 정의 메서드인 print()를 사용할 수 있게 됨
        t.print();
    }
}
class CC implements Myinterface{
    @Override
    public void print() {
        System.out.println("print() 구현");
    }
}

public class GenericMethodExtends {
    public static void main(String[] args){
        AA a = new AA();
        a.methods1(5.8); //<Double>

        BB b = new BB();
        b.methods2(new Myinterface() {  //1) 익명 이너클래스 사용한 경우
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });

        b.methods2(new CC()); //2) Myinterface의 구현체를 사용한 경우
    }
}
