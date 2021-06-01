package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class test3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("D:\\aa.txt"));
		PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("D:\\ff.txt")));
		String s = null;
		while((s=br.readLine()) != null) {
			System.out.println("나 복사중~~");
			pw.println(s);
		}
		br.close(); pw.close();
	}

}
