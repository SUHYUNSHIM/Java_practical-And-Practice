package ForTest;

import java.util.ArrayList;

class Bookstore{
	private String book_name; //책이름
	private String book_genre; //장르
	int book_price; //가격
	
	//생성자 오버로딩
	public Bookstore() {} 	
	//책이름, 장르, 책가격
	public Bookstore(String book_name, String book_genre, int book_price) { 
		this.book_name = book_name;
		this.book_genre =  book_genre;
		this.book_price = book_price;
	}
	//getter, setter
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	//toString
	public String toString() {
		return "[책이름] "+book_name+" [장르] "+book_genre+" [책가격] "+book_price+"원";
	}	
} //설계도 class Bookstore 끝. 문제 1번 

public class BookstoreClass {
	public static void main(String[] args) {
		
		ArrayList <Bookstore> bs = new ArrayList<Bookstore>();
		bs.add(new Bookstore("주식,이것만 알면 된다","경제/경영",18000));
		bs.add(new Bookstore("Harry Potter","문학",9500));
		bs.add(new Bookstore("백종원의 요리비법","요리",12500));
		//객체 생성 및 저장. 문제 2번-----------------------------------------//
		
		//toString 객체 출력.-------------------------------------------//
		for(Bookstore books : bs) {
			System.out.println(books);//.toString() 생략.
		}
		//12,000원 이상인 책의 이름과 가격을 출력.
		for(int i=0;i<bs.size();i++) {
			if(bs.get(i).getBook_price()>12000) {
				System.out.println(bs.get(i).getBook_name() +" "+bs.get(i).book_price);
			}
		}
		//문제 3번.
	}
}
