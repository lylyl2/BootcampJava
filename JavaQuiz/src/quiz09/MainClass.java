package quiz09;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요 v
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정) v
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요. v
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요. v
		 */
		
		User user = new User();
		//User user = new User("홍길동", 123123, 20);  //한 번에 저장하는 방법
		
		//setter로 저장하는 방법
		user.setName("홍길동");
		user.setRrn(123123);
		user.setAge(20);
		
		System.out.println( "이름: " + user.getName() + " 번호: " + user.getRrn() + " 나이: " + user.getAge() );

		
		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.) v
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장. v
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		
		User[] arr = new User[2];
		
		arr[0] = user;
		arr[1] = new User("김길동", 456456, 30);
		/*
		 * User u2 = new User("김길동", 456456, 30);
		 * u2 = 
		 */
		
		for(User u : arr) {
			System.out.println(u.getName());
			System.out.println(u.getRrn());
			System.out.println(u.getAge());
		}
		
		
		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		User[] arr2 = new User[5];
		Scanner scan = new Scaner(System.in);
		
		int i = 0;
		while(i < arr2.length) {
			
			//name, rrn, age 입력
			String name = scan.next();
			int rrn = scan.nextInt();
			int age = scan.nextInt();
			
			//새로운 User객체에 저장
			User user1 new User(name, rrn, age);
			
			//arr2에 유저를 저장
			arr2[i] = user1;
			
			i++;
		}
		
	}

}
