package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test4 {

	public static void main(String[] args) {
		String bae[] = {"jeno","jaemin","haechan","mark","renjun","chenle","jisung"};
		List<String> list1 = Arrays.asList(bae);
		Collections.shuffle(list1);
		
		for(String member : list1) {
			System.out.println(member);
		}
	}

}
