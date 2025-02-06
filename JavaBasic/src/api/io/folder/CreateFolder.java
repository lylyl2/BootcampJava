package api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		//마우스가 아닌, 프로그램으로 폴더를 생성하고 삭제할 수 있음! 터미널(명령문)로도 가능!
		
		/*
		 * 폴더 생성할 때는 File클래스를 사용합니다.
		 * 생성자 매개변수로 폴더를 생성할 경로 + 폴더명을 지정합니다.
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\myfolder";
		
		try {
			File file = new File(path);
			
			if( !file.exists() ) {  //파일이 존재하면 true
				file.mkdir(); //폴더생성  //mk: make 디렉토리
				System.out.println("폴더가 생성되었습니다");
				
			} else {
				file.delete();  //폴더삭제(파일 삭제)
				System.out.println("폴더가 이미 있습니다");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();  //에러났는지 확인하는 코드!! 꼭 쓰기
		}
	}
}
