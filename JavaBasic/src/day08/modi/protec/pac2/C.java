package day08.modi.protec.pac2;

import day08.modi.protec.pac1.A;

public class C extends A {
	
	public C() {
		
		//A a = new A();
		//a.bool = true;
		//a.method();
		
		//super를 통한 접근은 가능함  //protected라면 패키지가 달라도 상속받고 접근받을 수 있음
		super.bool = true;
		super.method();
	}
}
 