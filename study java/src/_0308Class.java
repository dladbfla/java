public class _0308Class {
    public static void main(String[] args){
        //생성자의 오버로딩
        Students tom = new Students("Tom", 18, "Daejeon", "1234" );
        Students steve = new Students("Steve", 25, "Seoul");
        Students paul = new Students();
        /*paul.name = "Paul";
        paul.age = 22;
        paul.address = "Incheon";*/
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");

        tom.displayAll();
        steve.displayAll();
        paul.displayAll();
        System.out.println(tom.getPersonalNum());

        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList2 = {123, 345,235,7898,467};
        //메소드 호출
        getSumAvg(numberList);
        getSumAvg(numberList2);

    }
        public static void getSumAvg(int[] numberList){
            int sum = 0;
            for (int i = 0; i < numberList.length; i++){
                sum = sum + numberList[i];
            }
            double avg = (double) sum/ numberList.length;
            System.out.println(sum);
            System.out.println(avg);
        }
}
