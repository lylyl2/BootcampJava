package day09.poly.basic2;


public class Student extends Person{

	String studentId;
	
	Student(String name, int age, String studentId) {
		//super();  //우리가 안써도 들어있음
		super(name, age); //부모님이 가지고 있는 name, age에 한번에 저장함
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info() + ", 학번:" + studentId;
		
	}
}
