package Quiz01;

import java.util.Random;

public class Quiz09 {
	
	public static void main(String[] args) {
		
		String[] arr = {"안녕하세요", "hello", "尼河吳", "%@#@"};
		
		/*
		 * 랜덤한 배열의 요소를 선택하고, 이 랜덤한 배열 요소에 따른 국가별 언어를 출력
		 */
		
		int ran = (int)(Math.random() * arr.length);
		
		System.out.println("선택된 단어:" + arr[ran]);
		
		switch (ran) {
		case 0:
			System.out.println("한국어 입니다");
			break;
		case 1:
			System.out.println("영어 입니다");
			break;
		case 2:
			System.out.println("중국어 입니다");
			break;
			
		default:
			System.out.println("알수 없는 언어 입니다");
			break;
		}
		
		
		
		
		
	}

}
