package quiz03;

public class DmbPhone extends Phone {  //DmbPhone은 Phone클래스를 상속 받습니다.
	
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	int channel; //왜 String channel;이 아니지?!
	
	//생성자는 상속x니까 따로 만들어주기
	DmbPhone(String pModel, String pColor, int ch) {
		model = pModel;
		color = pColor;
		channel = ch;
	}
	
	
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	void turnOnDmb() {
		System.out.println("TV를 켭니다");
	}
	
	int chageChannel(int ch) {
		
	}

}
