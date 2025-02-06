package thread.join;

public class TestA implements Runnable{

	@Override
	public void run() {

		//1~100까지의 누적 합
		for(int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("A현재 누적합: " + sum);
			
			Thread.sleep(100);
		}
		
	}

}
