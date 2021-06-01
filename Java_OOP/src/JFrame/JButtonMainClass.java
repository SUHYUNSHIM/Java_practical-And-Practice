package JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonMainClass extends JFrame implements ActionListener { //이벤트
	//implements -> 다중상속이 안되니까 다중 상속처럼 쓰려고. 인터페이스 선언이 되어야 한다.
	//ActionListener는 내장 되어 있는 것이다.	
	//이벤트 처리함수 (event handler): 마우스 클릭이야 그럼 해당 음식 메뉴 보여줘 -->
	//generator로 클래스명을 클릭 -> actionperformed...이벤트 처리
	//이벤트 등록: 등록안된 것은 아무리 클릭해도 무반응 -> addActionListener()
	
	JButton jb1;
	
	public JButtonMainClass() {
		jb1 = new JButton("눌러봐~", new ImageIcon("chili-sauce.png"));
		//버튼에도 그림을 넣을 수 있다.
		jb1.setFont(new Font("굴림", Font.BOLD,32));
		jb1.setBackground(Color.ORANGE);
		
		jb1.addActionListener(this);	//이벤트 등록. 등록할 대상. 
		//this는 new ActionListener를 구현하는 클래스의 생성자이다. 자기 자신을 참조.
		//ActionListener로 부터 상속 받은 것. 
		getContentPane().add(jb1); //container에 붙이기. jb1은 이벤트 가능 버튼이 된다.
		
		setVisible(true);
		setSize(1000,1000);
		
	}

	public static void main(String[] args) {
		new JButtonMainClass();

	}

	@Override
	public void actionPerformed(ActionEvent e) {//이벤트 처리함수
		//해당 이벤트 관련 버튼을 누르는 순간 여기로 찾아온다.
		//setter
		jb1.setIcon(new ImageIcon("son.png"));
		jb1.setText("골라 ma dish!");
		jb1.setFont(new Font("굴림",Font.BOLD,22));
		jb1.setBackground(Color.yellow);
		
	}

}
