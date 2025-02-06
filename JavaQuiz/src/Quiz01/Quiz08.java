package Quiz01;

import java.util.Scanner;

public class Quiz08 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1>");
		int num = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+, -, *, /]");
		String A = scan.next();
		
		
		System.out.print("정수2>");
		int num2 = scan.nextInt();	
		
		
		switch (A) {
		case "+":
			System.out.println("두수의 덧셈은:" + (num + num2));
			break;
			
		case "-":
			System.out.println("두수의 뻴셈은:" + (num - num2));
			break;
			
		case "*":
			System.out.println(num * num2);
			break;
			
		case "/":
			System.out.println(num / num2);
			break;

		default:
			System.out.println("연산기호 선택하세요[+, -, *, /]");
			
		}
				
	}

}
