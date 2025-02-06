package Day04;

import java.util.Arrays;

public class ArrayCopy {
   
   
   public static void main(String[] args) {
      // 복사의 개념 2개가 있음
      // 얕은복사
      // 깊은복사
      
      int[] arr = {1, 2, 3, 4, 5};
      int[] newArr = arr;         //얕은복사 - 주소값의 복사(원본배열도 같이 바뀜)
      
      System.out.println("newArr:" + Arrays.toString(newArr));
      newArr[0] = 100;
      System.out.println("newArr:" + Arrays.toString(newArr));
      System.out.println("newArr:" + Arrays.toString(arr));
      
      //깊은복사 - 천천히 새로운 배열을 만들고, 요소를 옮겨 담는다
      int[] arr2 = new int[arr.length];
      
      for(int i = 0; i < arr2.length; i++) {
         arr2[i] = arr[i];
      }
      
      System.out.println(arr == arr2 );
      //값을 변경하더라 원본배열에 영향을 미치치 않는다
   }
   


}   
   
