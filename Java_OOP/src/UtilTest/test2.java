package UtilTest;

import java.util.Date;

class cal{
	int year;
	int month;
	int day;
	
	cal(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day= day;
	}
	

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}

public class test2 {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		Date d2= new Date();
		
		cal c = new cal(1995,9,27);
		d1.setYear(c.getYear()-1900);
		d1.setMonth(c.getMonth()-1);
		d1.setDate(c.getDay());
		
		long cha = d2.getTime()-d1.getTime();
		long nal = cha/1000/3600/24;
		
		System.out.println("내가 살아온 날은 "+nal+"입니다.");
	}

}
