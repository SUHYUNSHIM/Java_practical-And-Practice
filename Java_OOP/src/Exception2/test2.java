package Exception2;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째수는: ");
		String one1 = scanner.nextLine();
		int num1 = Integer.parseInt(one1);
		
		
		System.out.print("두번째수는: ");
		String one2 = scanner.nextLine();
		int num2 = Integer.parseInt(one2);
	
		int bada = kaja(num1,num2);
		System.out.println(bada);
		
	}

	private static int kaja(int one1, int one2) {
		// TODO Auto-generated method stub
		if(one2 ==0) {
			System.out.println("0으로 나눌 수 없다고 전해라");
			throw new ArithmeticException(); //0이면 에러를 던져버린다.
				//JVM처럼 에러를 직접적으로 출력. catch가 없을 경우
			
		}
		else
			return one1/one2;
	}

}
