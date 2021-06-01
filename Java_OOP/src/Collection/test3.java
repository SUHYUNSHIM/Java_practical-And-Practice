package Collection;

import java.util.Iterator;
/*
 * Stack에 음식 이름 3개 정도를 generic으로 넣고,
 *  다시 꺼내어 출력하는 프로그램을 작성하시오.
 *  또한 Iterator를 사용하여서도 출력하시오.
 */
import java.util.Stack;

public class test3 {
	public static void main(String[] args) {
		//stack : filo = first in last out
		//lifo= last in first out
		
		Stack <String> st1 = new Stack<String>();
		st1.push("카레");
		st1.push("볶음밥");
		st1.push("뚝불고기");
		System.out.println(st1.size()); //3
		
		System.out.println(st1);
		//[카레, 볶음밥, 뚝불고기]
		
		System.out.println("======pop으로 출력");
		while(!st1.isEmpty())
			System.out.println(st1.pop());
		//뚝불고기
		//볶음밥
		//카레		
		
		//원칙적인 출력 방법이 아님
		//Enumeration
		System.out.println(st1);
		//[]
		System.out.println("======Iterator");
		Iterator<String> itr1 = st1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}//카레 볶음밥 뚝불고기
	}

}
