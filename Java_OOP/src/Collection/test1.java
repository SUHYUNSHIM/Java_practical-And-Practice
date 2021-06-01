package Collection;
//hashmap, 속도가 빠르다. hashing 기법.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test1 {

	public static void main(String[] args) {
		//제너릭, Integer와 String이 짝을 지어서 나와야 한다.
		HashMap <Integer,String> hm1 = new HashMap<Integer, String>();
		
		System.out.println(hm1.size()); //0
		//wrap
		//KEY(Integer) //Value(String)
		hm1.put(new Integer(100), "멋쟁이"); //hashcode
		hm1.put(new Integer(300), "공주"); //hashcode
		hm1.put(new Integer(200), "왕자"); //hashcode
		
		System.out.println(hm1.get(300));//value가 출력
		
		/* String s1 = hm1.get(100);
		 * System.out.println(s1);
		*/
		System.out.println(hm1.get(100));
		System.out.println(hm1.get(200));
		
		//지우기
		/*hm1.remove(300);
		if(hm1.size()>0) System.out.println(hm1.size());*/ //2
	
		//*Set
		//***key-value 출력1.		
		//key 모음(앞의 키값들을 모은 것.)
		Set <Integer> s1 = hm1.keySet();
		//sysout(s1);
		
		//이 소스에서 s1은 key 집합, 100, 200. 즉 앞에 있는 s1을 사용.
		for(Integer i :s1) {	//key  //value
			System.out.println(i+"\t"+hm1.get(i));
		}
		
		//***key-value 출력2. k+v 모음
		//Map이 여러 개로 쪼개지고 있다. Map은 HashMap을 포함한 것.
		Set <Map.Entry<Integer, String>> set3 = hm1.entrySet();
		for(Map.Entry<Integer, String> k: set3) {
			System.out.println(k.getKey()+"\t"+k.getValue());
		} //for-end
		
		
	
	}

}
