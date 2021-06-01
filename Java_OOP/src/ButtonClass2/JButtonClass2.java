package ButtonClass2;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class JButtonClass10 extends JFrame{
	//창문은 기본으로 닫힘
	//int aa
	JButton jb1 = new JButton("사과");
	JButton jb2 = new JButton("배");
	JButton jb3 = new JButton("감");
	JButton jb4 = new JButton("귤");
	JButton jb5 = new JButton("포도");
	JButton jb6 = new JButton("자두");
	
	public JButtonClass10() { //생성자
		getContentPane().setBackground(Color.PINK);
		getContentPane().setLayout(new FlowLayout());
		
		getContentPane().add(jb1);
		getContentPane().add(jb2);
		getContentPane().add(jb3);
		getContentPane().add(jb4);
		getContentPane().add(jb5);
		getContentPane().add(jb6);
		
		//this는 자기 자신을 참조하는 객체.
		this.setTitle("버튼이야"); //this 생략가능, 객체.메소드()
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}//생성자 end
	
}//JButtonClass10 end

public class JButtonClass2 {

	public static void main(String[] args) {		
		//JButtonClass2 jbc = new JButttonClass2(); // 기존 1-class 방법
		new JButtonClass10(); // 이클래스 만들어야, 따라서 생성자 만들기.
	}
}
