package Day04;

import java.util.Arrays;

public class ArrayDelete {
	
	public static void main(String[] args) {
		
		//배열의 삭제
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int index = 5; //삭제할 인덱스 번호
		
		//크기가 -1인 배열 하나 생성 -> 원본 배열의 삭제할 위치부터 마지막까지 당겨옴 -> 배열 복사
		
		int[] newArr = new int[arr.length-1];
		
		//잘못된 코딩
		/*for(int i = index; i < arr.length; i++) {
			arr[i] = arr[i+1];
		}*/
		
		for(int i = index; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		
		arr = newArr;
		newArr = null;
		
		System.out.println(Arrays.toString(arr));
		
	}
}
