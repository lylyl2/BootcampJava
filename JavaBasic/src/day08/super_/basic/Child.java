package day08.super_.basic;

public class Child extends Parent {

	//너가 아무것도 안적어도 첫줄의 super(); 생략.
	//Child(){
	//	super();
	//}
	
	//부모님의 기본생성자가 없으면, 상속 받았을 때, 강제로 생성자 연결을 해야 합니다.
	Child(){
		super("김xx", "박xx");
	}
	
}
