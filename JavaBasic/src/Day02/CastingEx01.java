package Day02;

public class CastingEx01 {
	
	public static void main(String[] args) {
	
		/*
		 * 크기가 작은 타입틀 큰 타입에 대입하면
		 * 자동으로 형변환을 한다
		 * JVM(자바가상머신)인한 자동 변한
		 */
		
		byte b = 10;
		short c = b; //byte -> short 자동형변환
		int i = b; //byte -> int형 자동형변환
		long l = b;
		
		char cc = 'A';
		int ii = cc; //char -> int 자동형변환
		System.out.println(ii);
		
		int k = 10;
		double d = k;
		System.out.println(d);
		
		
		
	}

}
