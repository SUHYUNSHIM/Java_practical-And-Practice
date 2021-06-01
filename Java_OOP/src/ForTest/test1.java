package ForTest;

import java.util.ArrayList;

public class test1 {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add(new Integer(5));
		array.add(new Integer(4));
		array.add(new Integer(3));
		
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}

	}

}
