package quiz20;

import java.util.ArrayList;
import java.util.Scanner;

class User {
	private String name;
	private int age;
	
	
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
	
}


public class ListQuiz03 {
	
	public static void main(String[] args) {
		
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
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<User> userList = new ArrayList<>();
		
		while (true) {
			System.out.println("메뉴-------------");
			System.out.println("1) 유저등록");
			System.out.println("2) 전체회원정보출력");
			System.out.println("3) 회원정보검색");
			System.out.println("4) 회원정보 삭제");
			System.out.println("5) 프로그램 종료");
			System.out.println("메뉴를 선택하세요");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			
			
				case 1:
					System.out.println("유저등록----------");
					System.out.println("이름입력: ");
					String name = scanner.nextLine();
					System.out.println("나이입력: ");
					int age = scanner.nextInt();
					scanner.nextLine();
					userList.add(new User(name, age));
					System.out.println("등록이 되었습니다");
					break;
				
				case 2:
					System.out.println("전체회원정보----------");
					for (User user : userList) {
						System.out.println(user);
					}
					break;
			
				case 3:
					System.out.println("회원정보검색---------");
					System.out.println("검색할 이름입력: ");
					String searchName = scanner.nextLine();
					boolean found = false;
					for (User user : userList) {
						if (user.getName().equalsIgnoreCase(searchName)) {
							System.out.println("검색 회원정보: " + user);
							found = true;
							break;
						}
					}
					if (!found) {
						System.out.println(searchName + "님은 목록에 없습니다");
					}
					break;
				
				case 4:
					System.out.println("회원정보삭제----------");
					System.out.println("삭제할 이름입력: ");
					String deleteName = scanner.nextLine();
					boolean removed = false;
					for (int i = 0; i < userList.size(); i++) {
						if (userList.get(i).getName().equals(deleteName)) {
							userList.remove(i);
							removed = true;
							break;
						}
					}
					break;
			
				case 5:
					
					
					
					
					System.out.println("프로그램종료----------");
					scanner.close();
					return;
				
		}
			
	}

}
