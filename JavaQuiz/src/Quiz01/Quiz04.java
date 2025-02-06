package Quiz01;

import java.util.Scanner;

public class Quiz04 {
	
	public static void main(String[] args) {
		
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 첫번째 수 생성
		long a = scan.nextLong();
		
		//3. 두번째 수 생성
		long b = scan.nextLong();
		
		//4. 세번째 수 생성
		long c = scan.nextLong();
		
		System.out.println(a + b + c);
		
		scan.close();
		
	}

}
