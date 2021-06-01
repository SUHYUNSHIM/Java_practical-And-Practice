package Exception;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		//try {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째수는: ");
		String one1 = scanner.nextLine();
		int num1 = Integer.parseInt(one1);
		
		
		System.out.print("두번째수는: ");
		String one2 = scanner.nextLine();
		int num2 = Integer.parseInt(one2);
	
		int bada = kaja(num1,num2);
		System.out.println(bada);
		//}
		/*catch(Exception e) {
			System.out.println("여기서 에러처리한다는~~");
		}*/
	}

	private static int kaja(int one1, int one2) throws ArithmeticException{
		//throw ArithmeticException(), throw를 try catch와 유사하게 쓰인다.
		//throws를 에러가 발생한 곳을 찾아서, 해당 에러를 찍는다.
			return one1/one2;
		}		
	}



