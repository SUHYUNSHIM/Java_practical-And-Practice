package Test;
//다중상속, 함수의 원형, 협업  예)그래픽모드 
//다중 상속을 가능하게 하는 것 - 인터페이스
interface Albaman{
	public void work();
}

class Quickman{
	public void baedal() {
		System.out.println("배달 신속");
	}
}

class Na extends Quickman implements Albaman{
	@Override
	public void work() {
		System.out.println("일 잘함");
	}
	public void allgood() {
		System.out.println("둘다 잘하니 사장이 칭찬함");
	}
}

public class Jalham {

	public static void main(String[] args) {
		Na n1 = new Na();
		n1.allgood();
		n1.baedal();
		n1.work();		
	}

}
