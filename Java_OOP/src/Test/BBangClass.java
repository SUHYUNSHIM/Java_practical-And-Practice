package Test;

class BBang {  
		
	protected String product;
	protected int price;	
	
	public BBang(String product, int price) {
		this.product = product;
		this.price = price;
	}	
	
	//인자가 있는 객체 생성을 했을 때 default를 써줘야 한다.
	public BBang() {};
		
	public String getProduct() {
		return product;
	}
	public int getPrice() {
		return price;
	}
	
	public void setProduct(String product ) {
		this.product= product;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	//출력 메소드1
	public void chool() {
		System.out.println("제품명은: "+product); //자기 클래스 안에 있으니 get메소드를 출력할 필요 없이, 
		System.out.println("가격은:" +price);	//속성을 출력하면 된다.	
	}
	//출력 메소드2. 이것을 사용하자.
	public String toString() { //쉽게 출력하는 방법.
		//overriding
		return "[빵 이릉은 말하자면]" + product+"이고"+
				"[가격은 다시 얘기하면]"+price+"입니다.";
	}
	} //설계도 class의 끝 

public class BBangClass {

	public static void main(String[] args) {
		BBang b1 = new BBang();
		BBang b2 = new BBang("소보로빵",2000);
		
		b1.setProduct("크림빵");
		b1.setPrice(1000);
		
		//출력 방법1
		System.out.println(b1.getProduct());
		System.out.println(b1.getPrice());
		
		System.out.println();
		
		//출력 방법2
		b1.chool();
		
		System.out.println();
		
		//출력방법3
		System.out.println(b1.price);
		System.out.println(b1.product);
		
		System.out.println();
		
		System.out.println(b2.price);	
		System.out.println(b2.product);
		
		System.out.println();
		//출력방법4. 이것 권장
		System.out.println(b1.toString()); 
		System.out.println(b2);//toString은 생략 가능하다.
		
	}

}
