package _3._0305;

public class _0305제어키워드 {
    public static void main(String[] args){
        //break = 제어중괄호를 탈출 시키는 키워드
        for (int i = 0; i<10; i++){
            System.out.println(i);
            if (i>5){
                break;
            }
        }

        //이중 for문에서의 break 사용법
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<10; j++){
                if (j == 3){
                   // i = 999999; //매우 큰 수를 세팅해서 바깥 for문 탈출
                    break;
                }
                System.out.println(i + ", " + j);
            }
        }

        //바깥 for문까지 탈출하는 다른 방법
        out:
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<10; j++){
                if (j == 3){
                    break out;
                }
                System.out.println(i + ", " + j);
            }
        }
        //continue 사용법
        for (int i = 0; i < 10; i++){
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if(j == 3){
                    continue;
                }
                System.out.println(i + ", " + j);
            }
        }


    }
}
