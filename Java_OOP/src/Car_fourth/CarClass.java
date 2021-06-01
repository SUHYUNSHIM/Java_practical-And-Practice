package Car_fourth; //방이름

class Car{
	//설계도 시작. 설계도를 정의한다.
	//** 캡슐화는 속성과 메소드의 묶음이다.
	
	//private String color; //속성. yourcar.color를 출력하려면 private이면 안된다. protected이거나 public 이어야 한다.
	//private int door;
	protected String color;
	protected int door;
	
	public Car(String color, int door) { //생성자.
		this.color = color;
		this.door = door;
	}
	public Car() {} //생성자 오버로딩.
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	//메소드 작성시 메소드 정의문 형식.
	public void drive() {
		System.out.println("즐겁게 드라이브하자");	}
	
	//출력 전문 메소드
	public void chool() {
		System.out.println(color+"색과 "+door+"개의 문");
	}
	
	//자주 쓰는 출력 전문 메소드. 오버라이드. toString***
	public String toString() {
		return "[색은 말하자면]"+color+"[문의 개수는]"+door+"이다";
	}	
	
	}//설계도의 끝.

public class CarClass {//설계도. 같은 패키지 안에 같은 클래스가 있는 것이
	//아니니 에러가 아니다. CarClass.java
	//메모리에 저장하는 명령은 main에서 가능하다. 즉 생성단계.
	public static void main(String[] args) {
		
		Car mycar = new Car(); //heap 메모리에 설계도 그대로 .
		//변수를 지정해 주는 이유는 메모리를 찾아갈 수 있게 하기 위해서이다.
		//사용
		mycar.setColor("blue"); //객체.속성= 값;
		mycar.setDoor(4);
				
		System.out.println(mycar.getColor()); //화면 출력
		System.out.println(mycar.getDoor());	
		
		Car yourcar = new Car("white",2); //객체 생성과 동시에 초기치를 준것.
										 //우변이 메소드 2형식처럼. 인자를 주고
										//호출하는 형태이다.
		mycar.chool();
		
		System.out.println(mycar.toString());
		System.out.println(mycar); // toString은 생략이 가능하다. 위와 같이 출력된다.
		System.out.println(yourcar);
		
		System.out.println(yourcar.color);
		System.out.println(mycar.color);
	}
}
