package quiz20;

import java.util.ArrayList;
import java.util.Scanner;

public class ListQuiz03t1 {
	/*
	 * 회원정보 프로그램 시뮬레이터
	 * 
	 * 무한반복문 안에서 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
	 * 
	 * 메뉴
	 * 1)유저등록  2)전체회원정보출력  3)회원정보검색  4)회원정보삭제  5)프로그램종료
	 * 
	 * 1. 스캐너로 name, age 입력받아서 User객체를 리스트에 추가
	 * 2. 모든 회원 정보를 출력하면 됩니다
	 * 3. 찾을 이름을 입력받아서, 이름이 있으면 이름과 나이를 출력해 줍니다. 찾는 이름이 없으면 "~~님은 목록에 없습니다"를 출력합니다.
	 * 4. 삭제할 이름을 입력받아서, 동일한 이름을 가진 회원이 있으면 User를 삭제
	 * 5. 종료
	 * 
	 */
	
	Scanner scan = new Scanner(System.in);
	List<User> list = new ArrayList<>();
	
	
	while(true) {
		System.out.println("1, 2, 3, 4, 5");
		System.out.println("메뉴>");
		int menu = scan.nextIng();
		
		if(menu == 1) {
			System.out.println("이름>");
			String name = scan.next();
			System.out.println("나이>");
			int age = scan.nextInt();
			
			User user = new User(name, age);
			list.add(user)
		}
	}
}
