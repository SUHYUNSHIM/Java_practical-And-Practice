package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class test2 {

	public static void main(String[] args) throws IOException {
		//키보드 입력을 위해 스캐너 대신 file 형식을 사용해보자.
		//바이트 단위 클래스. Input, Stream이 있으니.
		/*InputStreamReader is1 = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is1);*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("D:\\bbb.txt",true)));
		
		String s  = null;
		while((s = br.readLine()) != null) { //키보드 한줄을 읽어서
			//System.out.println("나 복사중");
			pw.println(s); // 파일에 출력			
		}
		br.close(); pw.close();		
	}

}
