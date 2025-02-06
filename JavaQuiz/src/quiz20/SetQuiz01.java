package quiz20;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {

    public static void main(String[] args) {

        /*
         * 로또 번호 자동 생성기
         * Set만 이용해서 6개의 랜덤한 로또 번호를 만들어내는 프로그램
         */

        // 1~45 숫자를 저장할 Set
        Set<Integer> allNumbers = new HashSet<>();
        for (int i = 1; i <= 45; i++) {
            allNumbers.add(i);
        }

        // 랜덤으로 6개의 번호를 저장할 Set
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        while (lottoNumbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1; // 1~45 범위의 숫자
            if (allNumbers.contains(randomNumber)) { // 1~45 범위 내에서만 추가
                lottoNumbers.add(randomNumber); // 중복 방지는 Set이 처리
            }
        }

        // 결과 출력
        System.out.println("생성된 로또 번호: " + lottoNumbers);
        
        
    }
}
