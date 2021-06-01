package UtilTest;

import java.util.Date;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1= new Date();
		/*System.out.println(d1);
		System.out.println(d1.toString()); //d1과 똑같은 내용이 출력. 출력 형식을 
											//바꿀 때 용이 
		System.out.println(d1.toLocaleString()); //지역 년월시간
		System.out.println(d1.toGMTString());*/
		
		//오늘 날짜의 년도, 월 , 요일, 날짜 를 출력해보자.
		//이미 만들어져 있는 getter, setter를 사용했다.
		
		/*String [] yoil = {"일","월","화","수","목","금","토"};
		System.out.println("오늘은 "+(d1.getYear()+1900)+"년 이고 "+
				+(d1.getMonth()+1)+"월 이며"+d1.getDate()+"일 이고 "+
		yoil[d1.getDay()]+"요일이다.");*/
		
		Date day = new Date(1995-1900,9-1,27);
		System.out.println(day);
		
		
	}

}
