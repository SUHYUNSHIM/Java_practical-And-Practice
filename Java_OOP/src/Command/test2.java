package Command;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {

	public static void main(String[] args) throws IOException {
		int imsi = 0; //'A'  문자 상수. 문자 A이기도 하면서 동시에 아스키코드 65
		FileInputStream fi1 = null;
		FileOutputStream fo1 = null;		
		
		 if(args.length ==2) {//원본파일명과 사본파일명 합해서 2개파일
             fi1 = new FileInputStream(args[0]); //open . 인자명에 파일 경로를 넣어도 된다.
             fo1 = new FileOutputStream(args[1],false); //open
		 }  
		while((imsi = fi1.read()) !=-1) {
			//read() 괄호 안이 비어있으면 한 바이트 단위로 처리
			fo1.write(imsi); //파일에 출력
			System.out.println(imsi+"나 복사중인데");
		}
		fi1.close(); fo1.close();
		
		//D:\\aa.jpg D:\\bb.jpg
	}
	}


