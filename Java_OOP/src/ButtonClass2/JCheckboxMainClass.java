package ButtonClass2;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckboxMainClass  extends JFrame {

	public JCheckboxMainClass() { //생성자
		JPanel jp1 = new JPanel();
		JCheckBox jcb1 = new JCheckBox("회원카드보유", true);
		JCheckBox jcb2 = new JCheckBox("장기회원", true);
		JCheckBox jcb3 = new JCheckBox("해외여행신청여부", false);
		jp1.add(jcb1); //컴포넌트를 패널위로 add
		jp1.add(jcb2);
		jp1.add(jcb3);
		getContentPane().add(jp1); //패널을 contentPane에 add
		
	} //생성자 end
	
	
	public static void main(String[] args) {
		JCheckboxMainClass jcbc1 = new JCheckboxMainClass();
		jcbc1.setTitle("체크박스라는!!");
		jcbc1.setSize(500,500); //내장되어 있는 setter
		jcbc1.setVisible(true);
	}

}
