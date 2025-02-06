package Day02;

public class CastingEx02 {
	
	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입으로 저장항때는 (type) 캐스팅을 
		 * 이용해서 명시적으로 형변환을 진행해야 한다.
		 */
		
		int i = 65;
		char c= (char)i;
		short s = (short)i;
		
		System.out.println(s);
		
		float f = 3.14f;
		int j = (int)f;
		
		System.out.println(j);
		
		//주의할점 - 값을 받을 수 없는 범위가 되면, 잘려나간값(쓰레기값)이 저장된다
		int a = 256;
		byte b = (byte)a;
		System.out.println(b);
		
		
	}

}
