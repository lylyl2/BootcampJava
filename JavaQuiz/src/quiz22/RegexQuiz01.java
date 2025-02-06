package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	
	public static void main(String[] args) {
		/*
		 * 가격형식만 찾아서 순서대로 출력해보세요.
		 * 
		 * 4,500원
		 * 1,200원
		 * 6000원
		 */
		
		String str = "헐4,500원 일 수도 있고~ 1,200원 일 수도 있지. 하지만 가격은 6000원 일 수도 있어";
		
//		String pattern1 = "\\d{1,}\\,?\\d{0,}[가-힣]{1}";
		String pattern1 = "[0-9]+,?[0-9]+원";
		
		Pattern p = Pattern.compile(pattern1);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println("가격형식을 찾음");
			System.out.println(m.group());
		}
		
	}
}
