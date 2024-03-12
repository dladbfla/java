public class _0312Main {

    int a = 3;
    static int b = 5;
    public static void main(String[] args){
        print();
       // print(a); //a는 인스턴스 영역
        print(b);  //b는 static을 사용해서 정적필드로 만들어줌
    }

    public static void print(){
        System.out.println("Hello World");
    }

    public static void print(int x){
        System.out.println("Hello World");
    }
}
