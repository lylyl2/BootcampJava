package quize21;

import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class FileQuiz02 {

    public static void main(String[] args) {
    	
    	/*
    	 * 1. 날짜클래스를 이용해서 file의 경로에 20250124.txt 이름으로 파일을 씁니다. v
    	 * 2. 내용은 "그만" 을 입력할 때까지 작성해 주면 됩니다. v
    	 * 3. 파일을 썼다면 BufferedReader를 이용해서 파일의 내용을 읽어들이세요
    	 */
        
    	Scanner scan = 
    	Date date = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd");
    	String now = sdf.format(date);
    	
    	String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + now + ".txt";
    	
    	BufferedReader br = null;
    	BufferedWriter bw = null;
    	
    	try {
    		bw = new BufferedWriter( new FileWriter(path) );
    		br = new BufferedReader( new FileReader(path) );
    		
    		while(true) {
    			
    			System.out.println(">>");
    			String str = scan.nextLine();
    			
    			if(str.equals("그만")) break;
    			
    			str += "\r\n";
    			bw.write(str);
    			bw.flush();  //버퍼를 비운다
    		}
    		
    		System.out.println("파일 입력이 완료되었습니다.");
    		System.out.println("----------------------------");
    		
    		String word;
    		while( (word = br.readLine() ) != null ) {
    			System.out.println(word);
    		}
    	}
    	
    	
    	/*
        LocalDate today = LocalDate.now();
        String fileName = today.toString();
        String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + fileName + ".txt";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path)); 
             Scanner scanner = new Scanner(System.in)) {
            
        	System.out.println("'그만'을 입력할 때까지 작성해주면 됩니다");
            System.out.println("파일에 작성할 내용: ");
            

            while (true) {
                String input = scanner.nextLine();
                if ("그만".equals(input)) {
                    break;
                }
                writer.write(input);
                writer.newLine();
            }

        } catch (Exception e) {
        	e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println("파일 내용:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e2) {
        	
        }*/
    }
}
