package Quiz01;

import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
		/*
		 * 어껀 수 1개를 입력받습니다
		 * 이 숫자가 홀수, 짝수, 0, 음수 인지를 구분해서 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int A = scan.nextInt();
		
		if (A == 0) {
			System.out.println("0 입니다");
			
		} else if(A < 0) {
			System.out.println( A + "는 음수 입니다");
		} else if(A % 2 == 0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}
		scan.close();
	}

}
