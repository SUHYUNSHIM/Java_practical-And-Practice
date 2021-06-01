package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class test4 {
	public static void main(String[] args) throws IOException {		
		//첫번째 파일을 imsi로 바꾼다.
		String str1 = null;
		//open
		BufferedReader br1 = new BufferedReader(new FileReader("D:\\c.txt"));
		
		PrintWriter pw1 = new PrintWriter //open
				(new BufferedWriter(new FileWriter("D:\\imsi.txt")));
		String s = null;
		while((str1=br1.readLine()) != null) {
			pw1.println(str1);
		}
		br1.close();
		pw1.close();
		
		//d.txt를 c.txt로 옮긴다.
		BufferedReader br2 = new BufferedReader(new FileReader("D:\\d.txt"));
		PrintWriter pw2 = new PrintWriter //open
				(new BufferedWriter(new FileWriter("D:\\c.txt")));
		while((str1=br2.readLine()) != null) {
			pw2.println(str1);
		}
		br2.close();
		pw2.close();
		
		//imsi에 있는 것을 d로 옮긴다.
		BufferedReader br3 = new BufferedReader(new FileReader("D:\\imsi.txt"));
		PrintWriter pw3 = new PrintWriter //open
				(new BufferedWriter(new FileWriter("D:\\d.txt")));
		while((str1=br3.readLine()) != null) {
			pw3.println(str1);
		}
		br3.close();
		pw3.close();
		
		File file  = new File("D:\\imsi.txt"); //파일의 위치를 가리키는 변수.
		//imsi 파일을 지우자.
		if( file.exists() ){
    		if(file.delete())
    			System.out.println("임시 파일 안녕");    		
    		else 
    			System.out.println("뭐야 왜이래~");   		
		}
		else
			System.out.println("지울 파일이 없어");
	}
}
