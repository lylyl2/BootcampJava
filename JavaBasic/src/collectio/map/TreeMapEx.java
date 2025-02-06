package collectio.map;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		//사용방법은 HashMap이랑 같음
		//키를 -> 정렬시켜서 저장함
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(2, "a");
		map.put(3, "b");
		map.put(5, "c");
		map.put(1, "밥먹자!");
		
		//key를 순서로 정렬시켜준다.  //입력순서로x
		System.out.println(map.toString());
		
	}
	
	
}
