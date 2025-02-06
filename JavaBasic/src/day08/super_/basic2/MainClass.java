package day08.super_.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20, "123456");
		
		System.out.println(s.info());
		
		//teacher, Employ도 생성자를 만들고, 객체 생성 해주세요.
		
		Teacher t = new Teacher("집가고싶다", 30, "4444");
		
		System.out.println(t.info());
		
		Employ e = new Employ("아아아", 40, "6666");
		
		System.out.println(e.info());
		
	}

}
