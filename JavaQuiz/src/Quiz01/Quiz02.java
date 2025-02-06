package Quiz01;

public class Quiz02 {

	public static void main(String[] args) {

		//1. 랜덤한정수 1~100 주어질 때, 이 값이 5의 배수인지 확인하고, 출력하세요
		int r = (int)(Math.random() * 100) + 1;
		System.out.println(r);

		String result = r % 5 == 0 ? "5의배수" : "5의배수 x";
		System.out.println(result);

		System.out.println("--------------------");

		//2. 랜덤한정수 -5 ~ 5가 주어질 때, 언제나 이값을 절대값으로 출력해주세요
		int t =(int)(Math.random() * 11) - 5;
		System.out.println(t);

		System.out.println("랜덤수: " + t);
		System.out.println(t < 0 ? -t :t);
		
		System.out.println("--------------------");

		/*
		 * 사과 x개를 상자에 담을 때 필요한 상자의 개수를 구하려고합니다.
		   한 상자에는 최대 10개의 사과가 들어 갈 수 있습니다.

		 * 사과의 개수가 1~150개 랜덤하게 주어질 때, 
		   필요한 바구니의 개수를 구하는 프로그램을 작성하세요.
		 */
		int x =(int)(Math.random() * 150) + 1; //무작위 사과
		System.out.println("사과의 개수" + x);
		
		System.out.println("필요한 바구니 수 " + (x % 10 == 0 ? x/10 : x/10 +1)+ "개");
		
		
		
		
		
	}

}



