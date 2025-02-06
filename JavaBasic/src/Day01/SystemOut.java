package Day01;

public class SystemOut {
	   
	   public static void main(String[] args) {
	      //main이라고 쓰고 ctrl + space 누르면 실행함수 자동생성
	      
	      //sysout 이라고 적고  ctrl + space 출력문 생성
	      
	      //1. ptintln() - 개행을 마지막에 포함 자동으로 줄바꿈
	      System.out.println("곧 쉬는 시간이네");
	      System.out.println("아 나는 집에 가야겠다. 나만 간다");
	      
	      //2. print()- 개행 미포함
	      System.out.print("줄바꿈이 없다~\n");
	      System.out.print("줄바꿈이\t 없다~\n");
	      
	      //3. printf() - 형식 지정 출력문
	      /*
	       * 서식문자 
	       * \n - 줄바꿈
	       * \t - 텝버튼 정렬 
	       * %d - 정수를 받음
	       * %s - 문자를 받음
	       * %f - 실수를 받음
	       */
	      
	      // 단축키 <--
	      /*
	         ctrl + / - 힌줄 주석
	         ctrl + shift + / - 여러줄 주석
	         alt + 방향키 - 코드 이동
	         shift + 방향키 - 영역
	         shift + home - 영역
	         shift + end - 영역
	         ctrl + a, ctrl + i - 정렬
	         ctrl + alt + 방향키 - 행 복사        
	       */

	      
	      System.out.printf("맨 처음에 하고 싶은 말을 적습니다. %s은 %d월 %d일 입니다", "오늘", 12, 30);
	      System.out.printf("\n원주율은 %f입니다", 3.14);
	      System.out.printf("\n원주율은 %.2f입니다", 3.14); //%.2f 소수 2자리 까지 표현
	      
	      //이 구문에서 숫자는 모두 %d 로 표현해 보세요
	      System.out.printf("\n%dx%d=%d %dx%d=%d", 2, 1, 2, 2, 2, 4);
	   }
	}
