package Quiz01;

import java.util.Arrays;

public class Quiz22 {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int data = 100; //추가할 데이터
		
		int[] newArr = new int[arr.length + 1];
		
		int target = 0;
		
		//복사
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		//공간만들기
		for(int i = newArr.length-1; i > target; i--) {
			newArr[i] = newArr[i-1];
		}
		
		newArr[target] = data;
		
		arr = newArr;
		newArr = null;

		System.out.println(Arrays.toString(arr));
	}
}
