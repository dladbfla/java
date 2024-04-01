package _0401;

class KeyValue<K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class Generic2 {
    public static void main(String[] args){
        KeyValue<String, Integer> kv1 = new KeyValue<>();
        kv1.setKey("사과");
        kv1.setValue(100);
        System.out.println(kv1.getKey()+" : "+kv1.getValue());

        //두번째 제네릭을 사용하지 않더라도 void타입을 지정해줘야 함
        KeyValue<String,Void> kv3 = new KeyValue<>();
        kv3.setKey("키값만 사용");
        System.out.println("Key: "+kv3.getKey());
    }

}
