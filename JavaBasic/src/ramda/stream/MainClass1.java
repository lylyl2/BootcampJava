package ramda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass1 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동", "이순신", "이호재", "신사임당");
		
		for(String s : list) {
			System.out.println(s); //프로그램 코드 처리
		}
		
		System.out.println("------------------------------------------------");
		//호재가 람다스트림을 알고 있다면
		//stream 함수로 시작
//		Stream<String> stream = list.stream();
//		
//		stream.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//			
//		});
		
		list.stream().forEach( t -> System.out.println(t) );
		
	}
	
}
