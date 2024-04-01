package _0401;

class GenericMethods{ //일반클래스 안에 정의한 제네릭메서드 예제
    public int method0(int a){ //일반메서드  //타입이 고정
        return a;
    }
    public <T> T method1(T t){  //제네릭 메서드  //파라미터, 리턴의 타입이 아무거나
        return t;
    }
    public <T> boolean method2(T t1, T t2){ //한개의 제네릭 타입 사용
        return t1.equals(t2);
    }
    public <K,V> void method3(K k, V v){ //두개의 제네릭 타입 사용
        System.out.println(k + " : "+ v);
    }
    public <A,B,C> void method4(A a, B b,C c){ //세개의 제네릭 타입 사용
        System.out.println(a + " : "+ b+ " : "+ c);
    }

    //제네릭메서드 내부에서 사용할 수 있는 메서드
    //반드시 제네릭메서드 T의 위치에 올 수 있는 모든 클래스들이 사용 가능한 메서드만 쓸 수 있음
    public <T> void method5(T t){
        //System.out.println(t.length()); //현재는 string일 때만 쓸 수 있기 때문에 오류
        System.out.println(t.equals("안녕")); //모든 클래스의 부모인 object의 메서드는 가능
    }


}
public class GenericMethod {
    public static void main(String[] args){
        GenericMethods gm = new GenericMethods();
        String str1 = gm.<String>method1("안녕");
        String str2 = gm.method1("안녕"); //<String> 생략(앞 뒤 정보로 유추 가능하기 때문에)
        System.out.println(str1);
        System.out.println(str2);

        boolean bool1 = gm.<Double>method2(2.5,2.5);
        boolean bool2 = gm.method2(2.5,2.5); //<Double> 생략
        System.out.println(bool1);
        System.out.println(bool2);

        gm.<String, Integer>method3("국어",80);
        gm.method3("국어",80); //<String, Integer>생략

        gm.method4("평균", 88.5, 10);//<String, Double, Integer> 생략

        gm.method5("안녕");
    }
}
