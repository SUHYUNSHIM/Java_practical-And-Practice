package Test;

import java.util.Arrays;

class Reverse{
	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public String change(String word) {
		char[] words = word.toCharArray(); //String을 char 배열로 바꾸기
											//toCharArray
		char temp;
		temp = words[0];
		words[0] = words[2];
		words[2] = temp;
		
		String s1 = new String(words); // char 배열을 다시 String으로 바꾼다.
		return s1;		
	}	
}

public class ReverseString {

	public static void main(String[] args) {
		Reverse re = new Reverse();
		System.out.println(re.change("NCT"));
	}
}
