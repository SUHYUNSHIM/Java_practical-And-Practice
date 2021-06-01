package Car_third; //방이름

//**[설계도] 시작.정의한다.------------------------------------------------------//
class Car{
	
	//** [캡슐화]는 속성과 메소드의 묶음이다.
	//캡슐화는 함부로 값을 변경하지 못하게 하기 위해서 한다.private을 사용해서 같은 클래스가 아니면 사용하지 못하도록 했다.
	//그럼 어떻게 사용해야 하는 가? 객체.getter, setter 메소드를 사용한다.
	private String color; //속성. private은 설계도 .같은 class 안에서만 사용가능하다.
						  //목적 도착지.객체방
	private int door;
	

	//---------------------------------------------------------------	
//color의 도우미
	//속성을 꺼내주는 것.color의 첫글자는 대문자로 쓰도록 정해져 있다.
	//비서가 값을 가져오는 것은 3형식. return이 필요하다.
	/*public String getColor() { //메소드		
		return color; //속성. color 
					  //기억창고에 있는 것(객체의 속성)을 밖의 사람한테 준다.
	}
	
	//속성에 값을 넣어주는 메소드.
	//값을 받는 것은 parameter= 매개변수.method 2형식의 정의문
	public void setColor(String color) { //이 color는 임시방, 쟁반.
										 //parameter. 
										 //속성에 넣어줄 값이다.
		this.color = color; //목적지에 받아온 임시의 것(밖에서 얻은 것)을 넣는다.
		//this는 자기 자신(Car라는 클래스)을 챰조하는 객체이다.
	}
//----------------------------------------------------------------	
//door의 도우미
	public int getDoor() { //door를 꺼내주는 
		return door; 
	}
	
	public void setDoor(int door) { //door를 넣어주는.
		this.door = door;
	}
	*/
//-----------------------------------------------------------------	
	//메소드 작성시 메소드 정의문 형식.
	public void drive() {
		System.out.println("즐겁게 드라이브하자");	}

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

	
	
	
	}
//설계도의 끝.----------------------------------------------------------//
//--------------------------------------------------------------------
//main 클래스의 시작.
//설계도. 같은 패키지 안에 같은 클래스가 있는 것이 아니니 에러가 아니다.
public class CarClass {
	// CarClass.java. main이 포함되어 있는 것으로 파일명 생성
	//생성단계. 메모리에 저장하는 명령은 main에서 가능하다.
	
	public static void main(String[] args) {
		
		//**[생성]
		Car mycar = new Car(); //heap 메모리에 설계도 그대로 .
		//변수를 지정해 주는 이유는 메모리를 찾아갈 수 있게 하기 위해서이다.
		//**[사용]
		//mycar.color = "blue"; //객체.속성= 값; (캡슐화를 하지 않고, 직접 값을 넣는 방법)
		//mycar.door = 4;
		mycar.drive();
		
		//System.out.println(mycar.color); //화면 출력
		//System.out.println(mycar.door);		
		
		//**[캡슐화]된 속성 사용하기. get,set 메소드 호출. 
		mycar.setColor("red"); //객체 생성 -> 객체.메소드 호출.
		System.out.println(mycar.getColor());
		mycar.setDoor(4);
		System.out.println(mycar.getDoor());
		
		
	}
}
