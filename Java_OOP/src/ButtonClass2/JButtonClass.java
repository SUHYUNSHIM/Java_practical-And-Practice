package ButtonClass2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonClass extends JFrame implements ActionListener{ //이벤트 1번
	//implements 뒤 인터페이스 및 다중 상속. JFrame 을 상속해서 window가 열린다.
	//ActionListener의 메소드인 actionPerformed를 override해야 한다.
	JButton jb1;
	public JButtonClass() {
		jb1 = new JButton("눌러봐~", new ImageIcon("chili-sauce.png"));
		jb1.setFont(new Font("굴림", Font.BOLD,32));
		jb1.setBackground(Color.ORANGE);
		
		jb1.addActionListener(this);
		
		getContentPane().add(jb1);
		setVisible(true);
		setSize(1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new JButtonClass();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
