package _3._0326.Study;

public class ChildA implements A,B{

    @Override
    public void abc() {
        System.out.println("Child of A");
    }


    @Override
    public void bcd() {
        System.out.println("Child of B");
    }
}

