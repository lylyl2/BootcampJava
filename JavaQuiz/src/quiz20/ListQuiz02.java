package quiz20;

import java.util.ArrayList;

/*
 * 1. User클래스는 은닉된 변수로 name, age를 선언.
 *    User클래스의 생성자도 선언.
 * 
 * 2. User클래스를 저장할 수 있는 ArrayList선언
 * 3. User객체를 2개 생성해서 리스트에 추가하세요.
 * 
 * 4. list에 저장된 모든 이름,나이를 for문으로 출력, 향상된 for문으로 출력
 * 5. list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
 * 
 * 6. list에 "홍길동" 이 있다면 객체를 삭제.   
 */


class User{
	
	//은닉된 변수 name, age 선언
	private String name;
	private int age;
	
	//생성자 선언
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
		return "이름: " + name + ", 나이: " + age;
	}
	
}


public class ListQuiz02 {

	public static void main(String[] args) {
		
		//User 클래스를 저장할 수 있는 ArrayList 선언
		ArrayList<User> userList = new ArrayList<>();
		
		//User 객체 2개 생성해서 리스트에 추가
		userList.add(new User("홍길자", 25));
		userList.add(new User("홍길동", 30));
		
		//list에 저장된 모든 이름, 나이를 for문으로 출력
		System.out.println("일반 for문---------");
		for (int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			System.out.println("이름: " + user.getName() + ", 나이: " + user.getAge());
		}
		
		//list에 저장된 모든 이름, 나이를 향상된 for문으로 출력
		System.out.println("향상된 for문----------");
		for (User user : userList) { 
			System.out.println(user);
		}
		
		//list에 "홍길자"가 있다면 홍길자의 이름, 나이 출력
		System.out.println("홍길자 이름, 나이 출력----------");
		for (User user : userList) {
			if ("홍길자".equals(user.getName())) {
				System.out.println("이름: " + user.getName() + ", 나이: " + user.getAge());
			}
		}
		
		System.out.println("리스트 출력----------");
		System.out.println(userList);
		
		//리스트에 "홍길동"이 있다면 객체를 삭제
		userList.removeIf(user -> "홍길동".equals(user.getName()));
		
		
		System.out.println("리스트 출력----------");
		System.out.println(userList);
		
	}
	
}
