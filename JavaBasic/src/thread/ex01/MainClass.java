package thread.ex01;

public class MainClass {

	public static void main(String[] args) {
		//메인쓰레드
		ThreadTeat th = ThreadTest();
		
		Thread thread = new Thread(th, "A");
		thread.start();
		
		
		
		
	}
	}
}
