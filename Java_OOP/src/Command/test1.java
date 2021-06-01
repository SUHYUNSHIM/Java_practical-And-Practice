package Command;

public class test1 {
	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("뭐야 왜이래~");
			System.out.println("사용법: 숫자 숫자 이렇게 두개 넣어. 수까?");
			//강제종료
			//return
			System.exit(-1);
		}
		System.out.println(Integer.parseInt(args [0]) + Integer.parseInt(args [1]));
	}

}
