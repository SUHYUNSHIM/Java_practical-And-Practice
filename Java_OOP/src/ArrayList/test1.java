package ArrayList;

import java.util.ArrayList;

public class test1 {

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList(); //Collection
		System.out.println(arr1.size());

		arr1.add(new Integer(300));
		arr1.add(new Double(100.7));
		arr1.add(new Character('A'));
		arr1.add(new String("ondal"));
	
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}
		
		arr1.add("빵");
		arr1.add("라면");
		arr1.add("우유");
		arr1.add("김밥");
		
		System.out.println(arr1.size());  //8
		
		arr1.set(5, "과자"); //내용 수정은 set
		arr1.remove(6);//유유 삭제
		arr1.remove("빵");//빵 삭제
		
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
			
		}
		
	
	}

}
