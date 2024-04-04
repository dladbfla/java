package _4._0404;

import java.io.*;
import java.nio.charset.Charset;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(FileObject.CURRENT + "fileio.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        //쓰기
        OutputStream os = new FileOutputStream(file);
//        byte[] arrayByte = "Hello World. Let's study spring framework.".getBytes();
        byte[] arrayByte = "안녕하세요".getBytes(Charset.forName("UTF-16")); //UTF-16으로 인코딩 했을 때
        os.write(arrayByte);
        os.flush();
        os.close();

        //읽기
        InputStream is = new FileInputStream(file);
        int data = 0;
        byte[] buffer = new byte[1000];
        String str = "";
       /* while (data  != -1){  // ((data= is.read()) != -1)로 써도 됨//-1이 아니면 계속 읽는다
            data = is.read(buffer); //버퍼 크기만큼 읽겠다
            if (data>=0){
                str = str + new String(buffer,0, data,Charset.forName("UTF-16")); //읽을 때도 UTF-16으로 읽기

            }
        }*/
        while ((data= is.read()) != -1){  //-1이 아니면 계속 읽는다
            str = str + new String(buffer,0, data,Charset.forName("UTF-16")); //읽을 때도 UTF-16으로 읽기

        }
        System.out.println(str);
        is.close();
    }
}
