package Exception;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		try { //혹시 에러가 날지 모르는 부분.
			Scanner scanner = new Scanner(System.in);
			System.out.print("첫번째 수는: ");//문자열을 다 받는 것
			String one1 = scanner.nextLine();
			//빈칸포함 한줄 다 입력
			//i Love you 한줄 다 읽음
			//but next()는 i만 입력
			
			int soo1 = Integer.parseInt(one1);
			System.out.print("두번째 수는: ");
			String two1 = scanner.nextLine();
			int soo2 = Integer.parseInt(two1);
			System.out.println(soo1/soo2);
		}catch (ArithmeticException e) {
			System.out.println("0이 아닌 값으로 입력하라는~~~");
		}
		catch(NumberFormatException e) {
			System.out.println("누나가 말할께! 숫자로 입력해");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		catch(Exception e) { //예외 클래스, 에러를 처리하는 부분.
			System.out.println("에러났다는~");
			System.out.println(e.getMessage());
		}
		finally { //에러가 났건, 나지 않았던 실행하는 것.
			System.out.println("goooooooooooooooo");
		}
	}

}
