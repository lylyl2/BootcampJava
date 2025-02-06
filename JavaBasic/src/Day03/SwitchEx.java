package Day03;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		int a = 5;
		
		switch (a) {
		case 0:
		case 1:
			System.out.println("1입니다");
			break; //switch 문장을 탈출
		case 2:
			System.out.println("2입니다");
			break;
		case 3: 
			System.out.println("3입니다");
			break;
		case 4: 
			System.out.println("4입니다");
			break;

		default: 
			System.out.println("1~4값이 아닙니다");
			break;
		}
		
		
		
	}

}
