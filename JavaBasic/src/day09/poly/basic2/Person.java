package day09.poly.basic2;

public class Person {
	//공통클래스(부모클래스)
	String name;
	int age;
	
	//생성자 연결 - this()
	//사용이유1. 중복되는 프로그램 코드를 생성자 연결을 통해서 줄여 줄 수 있음
	//사용이유2. this()는 생성자의 첫번째 줄에 있어야 한다
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//생성자를 통해서 연결
	Person(String name){
		this(name, 1);
	}
	
	//직접 연결
	/*Person(String name){
		this.name = name;
		this.age = 1;
	}*/
	
	//생성자를 통해서 연결
	Person() {
		this("이름x",1);
	}
	
	/*Person() {
		this.name = "이름x";
		this.age = 1;
	}*/
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
}
