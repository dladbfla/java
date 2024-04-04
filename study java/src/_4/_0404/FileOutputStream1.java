package _4._0404;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStream1 {
    public static void main(String[] args) throws IOException {
        //파일 데이터 입력
        //1. 파일 대상 설정
        File outFile = new File(FileObject.CURRENT + "/file2.txt");
        if (!outFile.exists()){
            outFile.createNewFile();
        }
        //2. 대상에 연결되는 stream 생성
        OutputStream os = new FileOutputStream(outFile);
        //3. 데이터 쓰기 (1바이트씩 쓰기)
        os.write('J');
        os.write('A');
        os.write('V');
        os.write('A');
        os.write('\r'); //캐리지 리턴(carriage return) //라인의 맨 앞으로 이동?
        os.write('\n'); //라인 피드(line feed) //줄바꿈
        os.write('S');
        os.write('\r');
        os.write('\n');


        os.flush(); //버퍼에 담겨 있는 데이터를 파일에 쓰는 메소드
        //4. stream 종료
        os.close();

        //여러 바이트를 한번에 쓰는 예제
        //두번째 파라미터(boolean append)는 기존 파일에 있던 데이터를 삭제하고 쓸지
        //뒤에 이어서 쓸지 결정하는 것(true = 이어쓰기)
        OutputStream os2 = new FileOutputStream(outFile, true);
        //getBytes()는 문자열을 바이트 배열로 변경시켜주는 메서드
        byte[] byteArray = "Spring and Datavase".getBytes();
        //write()는 매개변수에 바이트배열 형태로 넣어주면 배열에 담긴 데이터를 모두 쓴다
        os2.write(byteArray);
        os2.write('\r');
        os2.write('\n');

        os.flush();
        os.close();

    }
}
