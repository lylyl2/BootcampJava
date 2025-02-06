package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		/*
		 * | - or
		 * () - 집합
		 * ? - 0~1회 나옴
		 * * - 0회 이상 나옴
		 * + - 1회 이상 나옴
		 * 
		 * {4} - 4회 나옴
		 * {3, } - 3회 이상 나옴
		 * {3, 5} - 3~5회 나옴
		 * 
		 * [0-9] - 0~9사이의 문자 1개
		 * \\d - 0~9사이의 문자 1개( 같은 표현 )
		 * 
		 * [a-zA-Z가-힣] - 알파벳 or 한글 1개
 		 * \\w - 영문자 숫자 1개
 		 * 
 		 * 정규표현식에 사용되는 특수문자를 찾고 싶은 경우에는 \\를 붙이면 됩니다.
 		 * ex) ?는 정규표현식. 근데 ?라는 문자 자체를 찾을 때 => \\?
 		 * 
		 */
		
		String info = "30세/홍길동/02-123-1234/010-1234-5678/aaa@example.com";
		
		String pattern1 = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		Pattern p = Pattern.compile(pattern1); //정규표현문자열을 넣는다.
		Matcher m = p.matcher(info); //적용할 문자열을 넣는다.
		
		/*
		 * find - 정규표현식을 찾음(찾으면 true, 없으면 false)
		 * group - 정규표현 문자열을 얻음
		 * start - 시작 위치
		 * end - 끝 위치
		 */
		
//		if(m.find()) { //1번 수행시에 앞에서 한 번 찾음
//			System.out.println("정규표현식에 해당하는 문자를 찾음");
//			System.out.println(m.group());
//			System.out.println("시작위치: " + m.start() );
//			System.out.println("끝위치: " + m.end() );
//		}
//		
//		//하나 더 있어야 두 번째걸 찾음
//		if(m.find()) { //1번 수행시에 앞에서 한 번 찾음
//			System.out.println("정규표현식에 해당하는 문자를 찾음");
//			System.out.println(m.group());
//			System.out.println("시작위치: " + m.start() );
//			System.out.println("끝위치: " + m.end() );
//		}
		
		
		while(m.find()) { //1번 수행시에 앞에서 한 번 찾음
			System.out.println("정규표현식에 해당하는 문자를 찾음");
			System.out.println(m.group());
			System.out.println("시작위치: " + m.start() );
			System.out.println("끝위치: " + m.end() );
		}
		
		System.out.println("-------------------------------------------------------");
		
		//이메일 형식
		String pattern2 = "[a-z0-9]+@[a-z]+\\.[a-z]+";
		
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		
		if(m2.find()) {
			System.out.println(m2.group());
		}
		
		
		
		
	}
}
