package _3._0325;

public class JavaChild extends JavaAbstract{

    public JavaChild(){
        super();
    }
    public JavaChild(int a, String b){
        super(a,b);
    }

    @Override
    public String getString() {
        return b;
    }

    public void setValue(int a){
        super.setValue(a); // 자바스타일. 자바는 세터와게터를 사용하는 것을 추천
        //super.a = a; //비추천. 자바스타일이 아님
    }

    public void setString(String b){
        super.setString(b);
    }
}
