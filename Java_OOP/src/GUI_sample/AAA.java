package GUI_sample;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class AAA extends JFrame {

	private JPanel contentPane;
	private JTextField txtID_input;
	private JTextField txtPW_input;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AAA frame = new AAA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AAA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_ID = new JLabel("ID");
		lbl_ID.setFont(new Font("나눔스퀘어", Font.PLAIN, 15));
		lbl_ID.setBounds(71, 58, 62, 18);
		contentPane.add(lbl_ID);
		
		JLabel lbl_pw = new JLabel("Password");
		lbl_pw.setFont(new Font("나눔스퀘어", Font.PLAIN, 15));
		lbl_pw.setBounds(71, 106, 86, 24);
		contentPane.add(lbl_pw);
		
		txtID_input = new JTextField();
		txtID_input.setBounds(171, 55, 116, 24);
		contentPane.add(txtID_input);
		txtID_input.setColumns(10);
		
		txtPW_input = new JTextField();
		txtPW_input.setBounds(171, 106, 116, 24);
		contentPane.add(txtPW_input);
		txtPW_input.setColumns(10);
		
		JButton btnNewButton = new JButton("인자갖고가자");
		btnNewButton.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 17));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
								//---
				dispose(); //지금창 해제, 프레임 닫는 것
				setVisible(false); //지금창 안보이게
				String id = txtID_input.getText();
				String pw = txtPW_input.getText();
				//new BBB(id,pw).setVisible(true);
				//new DDD(id,pw).setVisible(true);
				new FFF(id,pw).setVisible(true);
				//인자를 넘겨준다. 객체인자를 초기치로 전달한다. 인자가 있는 생성자가 필요하다.
			}
		});
		btnNewButton.setBounds(141, 173, 173, 54);
		contentPane.add(btnNewButton);	
		}
}
