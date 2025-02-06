package quize21;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileQuiz1 {

    public static void main(String[] args) {
    	
    	
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. 사용자로부터 파일명을 입력받기
            System.out.print("파일명 입력: ");
            String fileName = scanner.nextLine();

            // 경로 지정 (file 폴더 하위에 파일 저장)
            String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + fileName + ".txt";
            
            System.out.println("경로지정완료!");

            // 2. 사용자로부터 파일에 쓸 내용을 입력받기
            System.out.print("내용 입력: ");
            String content = scanner.nextLine();

            // Writer 객체 생성 및 파일에 내용 쓰기
            Writer fw = new FileWriter(path);

            fw.write(content);  // 사용자 입력 내용 작성

            fw.close();  // 파일 닫기
            
            System.out.println("파일출력완료!");
            
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally {
        	
            scanner.close();  // Scanner 닫기
            
        }
    }
}
