package day09.poly.instansof_;

public class Teacher extends Person{

	String subject;
	
	Teacher(String name, int age, String subject) {
		//super();  //우리가 안써도 들어있음
		super(name, age); //부모님이 가지고 있는 name, age에 한번에 저장함
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
	String info() {
		return super.info() + ", 학번:" + subject;
		
	}

}
