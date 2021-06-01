package inherit;

import java.util.Scanner;
//상속에 있어서 overriding
class Parent{
	public void car() {
		System.out.println("부모 차타고 드라이브가자");
	}	
}
class Child extends Parent{ //재정의
	public void car() {	//똑같은 이름의 메소드
		System.out.println("자녀 차 타고 여행가자");
	}
}
public class CastConversion {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("어느차를 타시렵니까? 1은 부모, 2는 자식");
		
		int sel =scanner.nextInt();
		Parent p77 = null;
		switch(sel) {
		case 1:
			p77 = new Parent();
			p77.car();
			break;
		case 2:
			p77 = new Child(); //객체의 형변환
			p77.car();
			break;
		default:
			System.out.println("1,2 중 하나 입력");
			break;
		}
	}
}
