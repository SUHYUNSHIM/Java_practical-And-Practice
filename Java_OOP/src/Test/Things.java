package Test;

class Animal{
	public void move() {
		System.out.println("난 잘 움직여");
	}
}

class Birds extends Animal{ //birds는 animal을 상속받는다.
	public void fly() {
		System.out.println("난 잘 날라");
	}
}

class Fish extends Animal{
	public void swim() {
		System.out.println("난 수영을 잘해");
	}
}
public class Things {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal p = new Animal(); //부모 객체가 만들어진다.
		Birds c = new Birds();
		Fish f = new Fish();
		p.move();
		c.fly();
		c.move();
		
		f.move();
		f.swim();
	}
}
