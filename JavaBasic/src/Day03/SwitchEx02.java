package Day03;

import java.util.Scanner;

public class SwitchEx02 {
	
	public static void main(String[] args) {
		
		//switch 문장은 else if 문과 90% 유사함
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수>");
		int point = scan.nextInt();
		
		switch (point / 10) { //switch문장의 소괄호에는 변수 or 연산식이 들어갈수 있음
		case 9:
			
			if(point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;

		default:
			System.out.println("재수강");
			break;
		}
		
	}

}
