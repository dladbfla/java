package _4._0404;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileObject {
    public static final String CURRENT = "C:/Users/DW/Documents/GitHub/java/study java/temp/";

    public static void main(String[] args) {
        String currentPath =  System.getProperty("user.dir");
        System.out.println(currentPath);  //현재 작업하고 있는 파일 경로

//        File tempDir = new File("C:\\Users\\DW\\Documents\\GitHub\\java\\study java\\temp");
        File tempDir = new File("C:/Users/DW/Documents/GitHub/java/study java/temp"); // 둘다 가능
        if (tempDir.exists()){
            System.out.println("폴더가 이미 존재합니다."); //temp 파일이 있으면
        }else {
            System.out.println("폴더를 생성합니다.");
            tempDir.mkdir(); //make directory  //temp파일 생성
        }

        //파일생성
        File newFile = new File(CURRENT + "/newFile.txt");
        if (!newFile.exists()){ //존재하지 않으면
            try {
                newFile.createNewFile();
            }catch (IOException e){
                System.out.println("IOException 예외");
            }
        }else {
            System.out.println("이미 파일이 존재합니다.");
        }

        //file 객체가 가르키는 대상(폴더 또는 파일)의 절대 경로 확인
        System.out.println("절대경로 위치 : " + newFile.getAbsoluteFile());

    }
}
