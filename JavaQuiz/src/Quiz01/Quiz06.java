package Quiz01;

import java.util.Scanner;

public class Quiz06 {
	
	public static void main(String[] args) {
		 
		/* 
		 * 어떤 정수를 2개 입력 받습니다
		 * A>B 큰경우 A를 출력
		 * B<A 큰 경우 B를 출력
		 * A==B 같은 경우에는 "같은 수 입니다" 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("A>");
		int A = scan.nextInt();
		System.out.print("B>");
		int B = scan.nextInt();
		
		if(A>B) {
			System.out.println(A);
		} else if(A<B) {
			System.out.println(B);
		} else {
			System.out.println("같은 수 입니다");
		}
			
	}

}
