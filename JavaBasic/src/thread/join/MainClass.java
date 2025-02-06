package thread.join;

public class MainClass {
	
	public static void main(String[] args) {
		
		TestA a = new TestA();
		
		thread.start();
		
		thread.join(); //이 스테드가 종료될 때까지 다른 쓰레드를 정지 시킴
	}

}
