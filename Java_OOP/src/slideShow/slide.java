package slideShow;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;

public class slide extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	
	static int sw = 0;  
	static String s1="			I LOVE YOU";
	private Timer t1; //background thread 이다. 
							//ajax - login 중복 체크 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					slide frame = new slide();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public slide() {
		
		textField = new JTextField();
		t1 = new Timer();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 428);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JButton btnStart = new JButton("시작");
		btnStart.setFont(new Font("DX경필고딕B", Font.PLAIN, 19));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnStart && sw==0) {
					btnStart.setEnabled(false); //아이콘을 반투명으로 
					
					t1.scheduleAtFixedRate(new TimerTask() {
						public void run() { //반드시 run()메소드 사용
							s1 = s1.substring(1,s1.length())+s1.substring(0,1);
							textField.setText(s1); //화면 출력, 글상자에 넣는다
						}
					},0,100); //0초 delay후 작동.
				}
			}
		});
		btnStart.setBounds(179, 210, 147, 60);
		contentPane.add(btnStart);
		
		//	
		
		//끝 버튼
		JButton btnStop = new JButton("끝");
		btnStop.setFont(new Font("DX경필고딕B", Font.PLAIN, 19));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() ==btnStop) {
					t1.cancel();				
				}
			}
		});
		btnStop.setBounds(179, 282, 143, 52);
		contentPane.add(btnStop);
				
		textField.setBounds(145, 57, 235, 77);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
