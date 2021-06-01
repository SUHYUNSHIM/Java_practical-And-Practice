package inherit;

import java.util.Scanner;

//switch 
//부모가 부모를 가리키면 부모차, 부모 것으로 자녀를 가리키면 자녀차를 타고 간다.
//객체의 형변환 사용.
//1은 부모차, 2는 자녀차

class Parent_car{
	public void Car() {
		System.out.println("부모 차 타고 여행 가자");
	}
}
class Child_car extends Parent_car{
	public void Car() {
		System.out.println("자녀 차 타고 여행 가자");
	}
}

public class Test {
	public static void main(String[] args) {
		int num;
		System.out.println("어느차를 타시렵니까?(부모차=1,자녀차=2)");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		switch(num) {
		case 1:
			Parent_car p1 = new Parent_car();
			p1.Car();
			break;
		case 2:
			Parent_car p2 = new Child_car();
			p2.Car();
			break;
		}		
	}
}
