package Quiz01;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		
		System.out.println("키(double)와 나이(int)를 입력하세요");
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		// 키를 입력하는 스캐너 생성
		System.out.print("키>");
		double height = scan.nextDouble();
		
		// 나이를 입혁하는 스캐너 생성
		System.out.print("나이>");
		int age = scan.nextInt();
		
		// 탑승 가능과 불가능의 if문 생성
		if(height >= 140 && age >= 8) {
			System.out.println("탑승 가능합니다");
			
		} else {
			System.out.println("탑승 불가능합니다");
		}
		
		scan.close();
	}

}
