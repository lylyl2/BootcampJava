package day09.poly.instansof_;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person hong = new Student("홍길동", 10, "123");
		Person park = new Teacher("박찬호", 20, "체육");
		Person choi = new Employ("아아아", 30, "가수");
		
		printPerson(hong); //바로 호출이 되지 않음. void 앞에 static 붙여야 함
		
		Arrays.to
	}
	
	public static void printPerson(Person p) {
		
		//p가 Student였으면 Student 캐스팅
		//p가 Teacher였으면 Teacher 캐스팅
		
		if(p intanceof Student) {  //p가 student였으면 true
			Student s = (Student)p;
			System.out.println("p는 원래 Student였음");
			System.out.println( s.info() );
			
		} else if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println("p는 원래 Teacher였음");
			System.out.println( t.info() );
			
		} else if(p instanceof Employ)p; {
			Employ e = (Employ)p;
			System.out.println("p는 원래 Employee였음");
			System.out.println( e.info() );
		}
		
	}

}
