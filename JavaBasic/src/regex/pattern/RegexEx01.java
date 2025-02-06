package regex.pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		
		String info = "홍길자|30|서울시 강남구|010-1234-5678";
		
		//전화번호 형식만 찾아서 **** 이렇게 암호처리 한다.
		
		String pattern = "\\d{3}-\\d{3,4}-\\d{4}";
		
		String result = info.replaceFirst(pattern, "***-****-****");
		
		System.out.println(result);
		
	}
}
