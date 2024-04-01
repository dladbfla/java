package _3._0325;

abstract public class JavaAbstract {
    //필드
    int a;
    String b;

    //생성자
    public JavaAbstract() {
        a = 10;
        b = "default";
    }

    public JavaAbstract(int a, String b) {
        this.a = a;
        this.b = b;
    }

    //메서드
    public int getvalue(){
        return a;
    }
    abstract public String getString();

    public void setValue(int a){ //세터(setter) 메서드
        this.a = a;
    }

    public void setString(String b){ //세터(setter) 메서드
        this.b = b;
    }
}
