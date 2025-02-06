package day09.poly.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); //상속받은 메서드
		c.method02(); //오버라이드 메서드
		c.method03(); //자식의 메서드
		
		System.out.println("------------다형성 적용-------------");
		Parent p = c; //일시적으로 Parent형으로 형변환
		
		System.out.println("주소값:" + c);
		System.out.println("주소값:" + p);
		
		p.method01();
		p.method02();
		//p.method03(); //x
		/*
		 * 다형성이 적용되면, 본래 멤버에 접근 할 수 없다.
		 * 단, 오버라이드 된 메서드는 정상적으로 호출된다.
		 * 일시적인 형변환
		 */
		
		System.out.println("-----------클래스 캐스팅-----------");
		
		Parent pp = new Child();
		Child cc = (Child)pp; //클래스 캐스팅
		
		cc.method01();
		cc.method02();
		cc.method03();
		
		Object obj = new Object();
		Child ccc = (Child)obj;
		
	}

}
