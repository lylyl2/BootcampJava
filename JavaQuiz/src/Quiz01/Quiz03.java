package Quiz01;

import java.util.Scanner;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		/*
		 * 두 정수 A B를 한번에 입력 받은 다음에 A + B의 결과를 출력하는 프로그램 코드
		 * 
		 * 입력 
		 * 1 2
		 * 출력 3
		 * 
		 */
		
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 첫번째 수
		int num = scan.nextInt();
		
		//3. 두번째 수
		int num1 = scan.nextInt();
		
		//4. 결과 출력
		System.out.println(num + num1);
		
		scan.close();
		
	}

}
