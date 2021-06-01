package JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
								//상속, // GUI
public class JButtonMainClass2 extends JFrame{ //swing
	//int door; 객체 선언, 만들기
	JButton jp4 = new JButton("포도"); //생성자 안에서 디자인함

	JButtonMainClass2(){ //디폴트 생성자 시작. 인자가 없음.
			//원래는 자동으로 만들어줘서 생략 가능하다.
			//시작하자 마자 실행시키는 것이 생성자이다.
			//따라서 시작하자마자 해야 하는 것들을 넣는다.
			
			setTitle("뭐야 aws랑 비슷하구만");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//창문을 닫을 때 jvm에 남아있음 그래서
			//창문 닫을 떄 메모리 process까지 close;
			
			Container cp1 = getContentPane();  //버튼이 들어가는 공간
			//디폴트로 되어 있는 ContentPane을 얻어서, 알아내서
			cp1.setBackground(Color.PINK); //ContentPane 배경색은 pink
			cp1.setLayout(new FlowLayout()); // 사과, 감, 배 순으로 . FlowLayout -> 들어온 순서 대로 add
			//awt, 좌에서 우로, 하나면 가운데
			
			cp1.add(new JButton("사과"));
			cp1.add(new JButton("배"));
			cp1.add(new JButton("감"));
			
			jp4.setForeground(Color.ORANGE); //포도의 글자색
			jp4.setBackground(Color.GREEN);  //포도의 배경색
			cp1.add(jp4);
			
			setSize(300,200); //this.setSize(300,200);
			//가로 300픽셀, 세로 200 픽셀//pixel = picture element. 1024 * 768. 800 *600			
			setVisible(true);
	}//생성자 end
	
	public static void main(String[] args) {
		new JButtonMainClass2(); //일반 도스모드의 형태로
		//이것을 GUI 모드로 변환 -> guid 관련 상속
		//자기가 자신에 대한 객체를 만듬.
		//One Class 방식 . 설계도 class를 따로 두는 것을 two class 방식이라고 한다.
	}

}
