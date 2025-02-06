package day07.overrloading.basic;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic(); //객체 먼저 만들기
		b.abc(1);
		b.abc(3.14);
		b.abc("a", 1);
		b.abc(1, "a");
		
	}
}