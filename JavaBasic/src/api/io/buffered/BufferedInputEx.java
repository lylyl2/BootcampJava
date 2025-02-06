package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputEx {

	public static void main(String[] args) {
		
		/*
		 * BufferedInputStream - 1바이트 기반으로 데이터를 읽는 성능향상 스트림입니다.
		 */
		
		//InputStream is = new FileInputStream(null)  //굳이 이렇게 안쓰고 밑의 괄호에 넣어서 한 번에 한다!
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test01.txt";
		
		BufferedInputStream bis = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(path));
			
			int result;
			
			while( (result = bis.read()) != -1) {
				System.out.println( (char)result );
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				bis.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
		
	}
}
