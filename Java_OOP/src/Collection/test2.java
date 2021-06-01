package Collection;

import java.util.LinkedList;
import java.util.Queue;

/* Queue q1 = new LinkedList();
 * LinkedList <String> q1 = new LinkedList <String> ();
 * 끈으로 연결되어 있다.
 */
public class test2 {

	public static void main(String[] args) {
		Queue <String> q1 = new LinkedList <String> ();
		
		q1.offer("바보");
		q1.offer("온달");
		q1.offer("평강공주");
		System.out.println(q1.size());
		System.out.println(q1); //queue 내용 출력
		//바보, 온달, 평강공주.

		if(!q1.isEmpty()) //q1이 비어 있지 않나?
			q1.poll(); //바보 꺼내는 메소드
		if(!q1.isEmpty()) 
			q1.poll(); //온달이 나간다.
		q1.offer("홍길동"); //평강 공주 뒤에 이어서 홍길동이 있다
		
		System.out.println(q1.size()); //2
		System.out.println(q1.peek()); //제일 처음 값 출력
		System.out.println(q1);
		
	}

}
