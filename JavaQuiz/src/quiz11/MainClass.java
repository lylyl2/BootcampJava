package quiz11;

public class MainClass {
	
	public static void main(String[] args) {
		
		//player
		Warrior w = new Warrior("W1");
		
		//target
		Warrior w2 = new Warrior("W2");
		Sorceress s = new Sorceress("S1");
		
		w.smashing( w2 );
		w.smashing( s );
		
		w2.info();
		s.info();
		
		Player[] arr = {w2, s};  //플레이어 배열에 전사, 마법사가 들어갈 수 있음
		s.blizzad(arr);
		
		w.smashing( w2 );
		w.smashing( s );
		
	}

}
