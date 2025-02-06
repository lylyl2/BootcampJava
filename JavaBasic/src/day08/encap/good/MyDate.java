package day08.encap.good;

public class MyDate {

	private int year;  //변수 만들기
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉 변수에 접근할 때, 미리 생성해 놓은 getter/setter를 사용합니다. 
	 * 
	 * setter 메서드 선언
	 * 1. 은닉 변수에 값을 저장하기 위한 메서드
	 * 2. 접근제어자를 public을 선언하고 이름 (set + 멤버변수명)으로 만듭니다.  //무조건 약속! //카멜표현법 필수
	*/
	
	//기본모양
	public void setYear(int year) {
		//유효성 검증 내용을 추가할 수도 있음
		if(year < 1950 || year > 2025) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		
		this.year = year;
		
	}
	
	/*
	 * getter메서드 선언
	 * 1. 은닉 변수에 값을 조회하기 위한 메서드
	 * 2. 접근제어자 public으로 하고 이름 (get + 멤버변수명) 으로 만듭니다.
	 */
	
	public int getYear() {  //기본모양
		//유효성 검사를 할 수도 있음
		
		return year;
	}
	
	/*
	 * month, day, ssn에 대한 getter, setter를 생성
	 * 
	 * month - 1~12월까지만 저장
	 * day - 1~31일 까지만 저장
	 * ssn - 문자열 13자리 까지만 저장
	 */
	
	//month
	public void setMonth(int month) {
		
		if(month < 0 || month > 12) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		
		this.month = month;
		
	}
	
	public int getMonth() {
		
		return month;
	}
	
	//day
	public void setDay(int day) {
		
		if(day < 0 || day > 31) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		
		this.day = day;
		
	}
	
	public int getDay() {
		
		return day;
	}
	
	//ssn
	public void setSsn(String ssn) {
		
		if(ssn.length() != 13) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		
		this.ssn = ssn;
		
	}
	
	public String getSsn() {
		
		return ssn;
	}
	
	
}












