package quiz23;

public class Download implements Runnable {

	@Override
	public void run() {
		
		System.out.println("동영상 다운을 시작합니다: ");
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("*");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
		System.out.println("\n동영상 다운로드가 완료되었습니다.");
		
	}
	
}
