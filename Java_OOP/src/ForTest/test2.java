package ForTest;

import java.util.ArrayList;
import java.util.List;

class KMarket{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public KMarket(){}
	public KMarket(String name , int price) {
		this.name = name;
		this.price = price;
	}
	/*public String toString() {
		return name +"은"+ price+"원입니다.";
	}*/
}
public class test2 {
	
	public static void main(String[] args) {
		List<KMarket> km = new ArrayList<KMarket>();
		km.add(new KMarket("우유",1000));
		km.add(new KMarket("빵",2000));
		km.add(new KMarket("버터",3500));
		km.add(new KMarket("카카오", 5000));
		km.add(new KMarket("삼각김밥",1200));
		km.add(new KMarket("도시락",6000));
		km.add(new KMarket("커피",5000));
		km.add(new KMarket("의류건조기",1200000));
		
		for(KMarket product : km ) {
			System.out.println(product.getName());
		}
		for(KMarket product : km ) {
			if(product.getPrice()<=2000) {
				System.out.println(product.getName()+", "+product.getPrice());
			}
		}
		/*for(KMarket product : km ) {
			System.out.println(product);
		}*/
		km.get(3).setName("양파");
		for(int i=0;i<km.size();i++) {
			System.out.println(km.get(i).getName());
		}	
	}
}
