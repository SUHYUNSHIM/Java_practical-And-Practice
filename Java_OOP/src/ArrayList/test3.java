package ArrayList;

import java.util.ArrayList;

class superMarket{
	private String sangpum;
	private int price;
	
	//생성자 오버로딩
	public superMarket() {}
	public superMarket(String sangpum,int price){
			this.sangpum  = sangpum;
			this.price = price;
		}	
	
	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	
	public String toString() {// 재정의 override.
		return "상품이름은 "+sangpum +"이고 상품가격은 "+price+"입니다.";
	}
	
}//supermarket 클래스 end. (1)설계도 클래스 만들기 끝.

public class test3 {

	public static void main(String[] args) {
		ArrayList <superMarket> arr = new ArrayList<superMarket>();
		//사용자 정의 객체를 넣어보자.
		//(2) 객체를 만들기.(3) 초기치 넣기. (4) class에 add하기.
		//객체 생성함과 동시에 초기치.
		//add는 class에 넣는 것.
		//생성자를 찾아간다.인자가 있는 생성자로.
		
		//(3)ArrayList에 추가  (2) 객체 생성 및 초기지 넣는 것을 한번에 진행.
		/*생성과 값넣는 것을 따로 한다면,
		superMarket s1 = new superMarket("우유",1000);
		arr.add(s1);
		*/	
		arr.add(new superMarket("우유",1000)); 		
		arr.add(new superMarket("빵",2000));		   
		arr.add(new superMarket("버터",5000));
		arr.add(new superMarket("카카오",3000));
		arr.add(new superMarket("삼각김밥",1200));
		arr.add(new superMarket("도시락",4500));
		arr.add(new superMarket("커피",2500));
		arr.add(new superMarket("의류건조기",2000000));
		
		/*for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).getSangpum());
		}*/
		
		//가격이 2000원 이하인 상품 이름 및 가격 모두 출력하기
		/*int cnt = 0;
		for(int j=0;j<arr.size();j++) {
			if(arr.get(j).getPrice()<=2000) {
				System.out.println(arr.get(j).getSangpum()+": "+arr.get(j).getPrice());
				cnt++;
			}
		}
		System.out.println("조건에 맞는 상품의 갯수는 "+cnt+"개입니다.");
	*/
		
		//foreach를 사용하여 전체 상품이름, 가격 모두 출력하기
		//toString() 사용.
		for(superMarket imsi:arr) {
			System.out.println(imsi);
			//System.out.println(imsi.toString());
			//toString()을 주석을 달고 실행하면
			//imsi는 객체 참조 변수이고, 객체의 위치를 알고 있다.
			//imsi의 번지가 나온다.
		}
		
	}
	
}
