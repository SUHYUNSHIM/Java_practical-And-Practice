package Test;
//OOP로 푸는 방법. getter, setter로 입력받고, 반환한다.
//설계도 클래스
//String
//출력이 toString으로 나와야 한다.

class Joomoon{
	private String coffeename;
	private int price;
	private String branch;
	
	//객체 - getter, setter 
	public String getCoffeename() {
		return coffeename;
	}
	public void setCoffeename(String coffeename) {
		this.coffeename = coffeename;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "품명 "+coffeename+" 가격은 "+price+" 지점 "+branch+"에서 판매";
	}		
}


public class TestString {

	public static void main(String[] args) {
		
		Joomoon jm = new Joomoon();		
		String input = "americano,3000,논현";
		
		String [] bae = input.split(",");
		//String[] bae = input.split("\\*\\*");
		//String [] bae = input.split("\\.");
		jm.setCoffeename(bae[0]);
		jm.setPrice(Integer.parseInt(bae[1]));
		jm.setBranch(bae[2]);
		
		System.out.println(jm);		
	}

}
