package Test;

//인터페이스는 클래스 위에 선언되어있어야 한다.
interface Restaurant{
	public void pojang();
	//선언은 했지만 구현을 하지 않았다. child에서 반드시 해줌.
}
interface OutService{
	public void baedal();
}


class Chef{
	public void yori() {
		System.out.println("셰프는 요리잘해");
	}
}
//쉐프로부터는 상속받고, 레스토랑에서는 구현받는다.
//레스토랑으로부터 상속받았으니 child이고, pojang을 구현해아 한다.
//내면적으로는 상속한다. 
class Jikwon extends Chef implements Restaurant,OutService{

	@Override
	public void pojang() {
		System.out.println("나는 직원인데 포장잘함");
	}
	@Override
	public void baedal() {
		System.out.println("나는 직원이고 배달도 잘해.");
	}	
}

public class Unit {

	public static void main(String[] args) {
		Chef c1 = new Chef();
		Jikwon j1 = new Jikwon();
		c1.yori();
		j1.yori(); //상속받았으니까
		j1.pojang();
		j1.baedal();

	}

}
