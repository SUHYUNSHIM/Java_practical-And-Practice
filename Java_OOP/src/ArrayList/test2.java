package ArrayList;
//제너릭
import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {
		ArrayList <String> arr1 = new ArrayList<String>();
		
		//arr1.add(30); // 제너릭은 문자열만 들어가는 것. one data type.
		arr1.add("빵");
		arr1.add("라면");
		arr1.add("우유");
		arr1.add("김밥");
		
		//ArrayList는 입력은 add(), 출력은 get(i)
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}
		for(String imsi:arr1) {
			System.out.println(imsi);
		}

	}

}
