package quiz20;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz02 {

    public static void main(String[] args) {
        
		/*
		로또기기 당첨 시뮬레이터!
		
		{5, 23, 35, 7, 41, 13} 이 번호가 당첨 번호입니다.
		랜덤한 로또번호 6개를 생성해서, 당첨 번호와 일치하는지 확인합니다.
		몇 번의 시도 끝에 당첨되는지 계산하고, 소요된 비용을 출력하세요.
		로또 1회 구매 비용은 1,000원입니다.
		
		힌트)
		set이 요소가 동일한지 확인하는 메서드는 set.equals(set) 입니다
		*/   	
    	
    	/*
    	//당첨번호
        Set<Integer> winningNumbers = Set.of(5, 23, 35, 7, 41, 13);
        Random random = new Random();
        
        //횟수 비용 초기화
        int attempts = 0;
        long cost = 0;
        
        while (true) {
            // 랜덤 로또 번호 6개 생성
            Set<Integer> generatedNumbers = new HashSet<>();
            
            while (generatedNumbers.size() < 6) {
                generatedNumbers.add(random.nextInt(45) + 1);
            }
            
            attempts++;
            cost += 1000;
            
            // 당첨 여부 확인
            if (generatedNumbers.equals(winningNumbers)) {
            	System.out.println("WINNER WINNER CHICKEN DINNER!");
                System.out.println("당신의 로또번호: " + generatedNumbers);
                System.out.println( attempts + "회 로또를 구매하였고 " + cost + "원이 들었습니다");
                break;
            }
        }*/
    	
    	
    	Set<Integer> winning = new TreeSet<>();
    	Random ran = new Random();
    	int count = 0;
    	
    	while(true) {
    		winning.add( ran.nextInt(45) + 1);
    		
    		if(winning.size() == 6) {
    			if( lotto.equals(winning) ) {
    				break; //당첨이니까 그만
    			} else {
    				winning.clear();
    			}
    		}
    	}
    	
    	System.out.println("winner");
    	System.out.println("당신의 로또번호: " + winning );
    	System.out.println(count + "회 로또를 구매하였고" + (count * 1000L) + "원이 들엇습니다.");
    	
        
    }
}
