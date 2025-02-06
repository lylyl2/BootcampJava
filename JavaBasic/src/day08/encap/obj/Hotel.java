package day08.encap.obj;

public class Hotel {
	
	//String name;
	//Chef chef;  //멤버변수에 클래스타입이 올 수 있다
	//int[] arr;  //멤버변수에 배열타입도 올 수 있다
	
	private Chef chef;
	private Employee emp;
	
	//호텔이 생성될 때 chef를 같이 생성한다
	//chef객체 초기화
	public Hotel() {
		this.chef = new Chef();
		this.emp = new Employee();
	}
	
	//chef 변수의 getter, setter
	//setter - 매개변수로 객체를 받는 타입
	public void setChef(Chef chef) {  //반환은 void
		this.chef = chef;
	}
	
	//getter - 객체를 반환으로 돌려주는 형태
	/*public 반환유형타입 getChef() {
		
	}*/
	public Chef getChef() {
		return chef;
	}
	
	
	//emp - getter, setter
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
	}
	
}
