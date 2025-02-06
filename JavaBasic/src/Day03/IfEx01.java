package Day03;

public class IfEx01 {

	public static void main(String[] args) {
		
		// 랜덤한 정수 값
		int point = (int)(Math.random()*100) + 1; // 1 ~ 100
		
		System.out.println("정수:" + point);
		
		if(point >= 60) {
			System.out.println("합격입니다");
			
		} else {
			System.out.println("불합격입니다");
		}
		
	}
	
}
