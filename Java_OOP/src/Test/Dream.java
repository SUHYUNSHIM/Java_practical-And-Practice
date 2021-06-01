package Test;
//다형성 - 같은 형식 이름의 메소드 인데 다른 결과가 나온다. abstract. 추상 메소드
//결과적으로 일반클래스 -> 추상클래스
abstract class Kwail{ //abstract가 하나 들어가면 추상 클래스로 만들어야 한다.
	public void good() {
		System.out.println("이집 맛 좋네");
	}
	public abstract void mukja(); //추상메소드가 있으면 추상클래스
	//구현은 안하고, 자녀쪽에서 구현한다.
	//interface와 abstract은 사촌간이다.
}

//과일(가독성, 다형성)
//사과 배 감
class Apple extends Kwail{ //상속
	public void mukja() { //이것이 다형성
		System.out.println("사과를 핫소스 뿌려서 먹자");
	}
}
class Pear extends Kwail{
	public void mukja() {
		System.out.println("배를 핫소스 뿌려서 먹자");
	}
}

class gam extends Kwail{

	@Override
	public void mukja() {
		System.out.println("감을 핫소스 뿌려서 먹자");		
	}	
}

public class Dream {

	public static void main(String[] args) {
		Kwail k1 = new Apple(); //부모 것으로 자식을 가리킨다.
		//객체 형변환. 부모가 자식차를 타고 나갈 수 있다. 
		k1.mukja(); //사과 먹자
		
		Kwail k2 = new Pear();
		k2.mukja(); //배 먹자
		
		Kwail k3 = new gam();
		k3.mukja(); //감 먹자
		
		//예를 들어 같은 버튼인데 다른 기능을 가진다. 추상성을 활용한 메소드.
		//똑같은 명령어인데 다양하게 쓰이면 추상 메소드를 활용한다.
	}

}
