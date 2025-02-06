package quiz09;

public class User {

	//멤버 변수 선언
	private String name;
	private int rrn;
	private int age;
	
	//기본 생성자
	public User() {
		//기본값으로 초기화
		this.name = "Unknown";
		this.rrn = 0;
		this.age = 0;
	}
	
	//모든 멤버변수 초기화 생성자
	public User(String name, int rrn, int age) {
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}
	
	//name getter
	public String getName() {
		return name;
	}
	//name setter
	public void setName(String name) {
		this.name = name;
	}
	
	//rrn getter
	public int getRrn() {
		return rrn;
	}
	//rrn setter
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	//age getter
	public int getAge() {
		return age;
	}
	//age setter
	public void setAge(int age) {
		this.age = age;
	}
	
}
