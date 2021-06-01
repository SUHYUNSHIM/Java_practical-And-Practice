package JFrame;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelMainClass extends JFrame{
	
	JLabel jl1; //속성 . 마치 String color;
	//awt , swing, javafx
	//getter, setter, 생성자(사용자 정의)
	
	public JLabelMainClass() {
		//프로젝트 방에 있어야 함 - 이미지 파일을 프로젝트 안에 넣는다. 
		ImageIcon img1 = new ImageIcon("aa.jpg");
		jl1 = new JLabel("나는 JLabel이라는~!!", img1, SwingConstants.LEFT);
		//jl1 = new JLabel("나는 JLabel이라는~~", new ImageIcon("aa.png"));
		jl1.setFont(new Font("굴림", Font.BOLD,32));
		
		getContentPane().add(jl1); //창문 배경에 붙이기 
		setVisible(true);
		setSize(1000,700);
		
		//입력이 필요없고, 출력하는 것이 목적이면 JLabel을 쓰자.
	}

	public static void main(String[] args) {
		new JLabelMainClass();

	}

}
