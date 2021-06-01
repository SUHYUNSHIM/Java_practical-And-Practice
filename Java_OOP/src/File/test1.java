package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test1 {

	public static void main(String[] args) throws IOException {
		//throws IOException은 나중에 만들자.
		//open
		FileReader fr = new FileReader("D:\\aa.txt");
		BufferedReader br = new BufferedReader(fr);
		//read는 파일에서 읽어서 to 기억창고(변수)
		//write는 키보드등으로 입력하여 to 파일에
		String s = null;
		//file read - 화면 출력(write)  // byte 경우는 readInt..
		
		while((s=br.readLine()) != null){
			System.out.println(s);
		}
		br.close();
		fr.close();

	}

}
