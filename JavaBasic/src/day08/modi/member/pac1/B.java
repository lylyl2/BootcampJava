package day08.modi.member.pac1;

public class B {
	
	A a = new A(1); //public
	A a2 = new A("홍길동");  //default
	//A a3 = new A(true); //private(X)

	public B() {
		//여기에서 A안에 변수를 사용하고 싶으면? -> 객체를 만든다
		A a4 = new A();
		a4.a = 1;  //public
		a4.b = 1;  //default
		//a4.c = 1;  //private(x)
		
		a4.method01();
		a4.method02();
		//a4.method03();  //private (x)
	}
	
}
