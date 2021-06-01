package Car_first; //방이름

class Car{
	//설계도 시작. 설계도를 정의한다.
	//** 캡슐화는 속성과 메소드의 묶음이다.
	String color; //속성
	int door;
	//메소드 작성시 메소드 정의문 형식.
	public void drive() {
		System.out.println("즐겁게 드라이브하자");	}
	}//설계도의 끝.

public class CarClass {//설계도. 같은 패키지 안에 같은 클래스가 있는 것이
	//아니니 에러가 아니다. CarClass.java
	//메모리에 저장하는 명령은 main에서 가능하다. 즉 생성단계.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car(); //heap 메모리에 설계도 그대로 .
		//변수를 지정해 주는 이유는 메모리를 찾아갈 수 있게 하기 위해서이다.
		//사용
		mycar.color = "blue"; //객체.속성= 값;
		mycar.door = 4;
		mycar.drive();
		
		System.out.println(mycar.color); //화면 출력
		System.out.println(mycar.door);		
	}
}
