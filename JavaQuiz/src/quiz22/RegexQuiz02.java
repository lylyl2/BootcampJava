package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	
	public static void main(String[] args) {
	
		//상품번호, GS25, (상품명), 가격 분리해서 출력.
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(김혜자도시락) 6,000";
		String[] arr = {str, str2, str3};
		
		//패턴 4개
		String number = "[0-9]{6}-[0-9]{4,}";
		String gs = "GS[25]*";
		String name = "\\([가-힣]+\\)";
		String cost = "[0-9]+,[0-9]+원?";
		
//		Pattern p = Pattern.compile(gs);
//		Matcher m = p.matcher(str);
//		
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		
		
		
		int i = 0;
		while(i < arr.length) {
			
			Matcher m1 = Pattern.compile(number).matcher(arr[i]);
			Matcher m2 = Pattern.compile(gs).matcher(arr[i]);
			Matcher m3 = Pattern.compile(name).matcher(arr[i]);
			Matcher m4 = Pattern.compile(cost).matcher(arr[i]);
			
			if( m1.find() && m2.find() && m3.find() && m4.find() ) {
				System.out.println( m1.group() );
				System.out.println( m2.group() );
				System.out.println( m3.group() );
				System.out.println( m4.group() );
				System.out.println("-----------------------");
			}
			
			i++;
		}
		
	}
}
