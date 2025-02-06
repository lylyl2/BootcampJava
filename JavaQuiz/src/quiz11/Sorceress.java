package quiz11;

import java.util.Random;

public class Sorceress extends Player{
	//마법사
	
	//1. 생성자 - 이름을 전달받아서, hp = 500, mp = 1000으로 하세요. v
	public Sorceress(String name) {
		this.name = name;
		this.hp = 500;
		this.mp = 1000;
	}
	
	//2. 블리자드스킬 - 광역공격기
	//블리자드스킬은 mp 200을 소모 v
	//배열 안에 들어 있는 모든 객체에 5~15사이의 랜덤한 피해를 한번 발생을 시킵니다.
	//타격당한 플레이어는 체력을 소모해 주면 됩니다.
	//타격당한 플레이어의 이름을 출력하세요.
	public void blizzad(Player[] players) {
		/*if (this.mp >= 200) {
			this.mp -= 200;
			Random random = new Random();
			System.out.println(this.name + "는(은) 블리자드스킬을 사용했다");
			
		} else {
			System.out.println("마나가 부족해 스킬을 사용할 수 없습니다");
		}*/
		this.mp -= 200;
		for( Player target : players) {
			
			int ran = (int)(Math.random() * 6) + 10;
			target.hp -= ran; //상대방 hp에서 데미지 받은 만큼을 빼준다
			
			System.out.println(target.name + "이" + ran + "피해를 입었습니다");
			
		}
	}
	
}
