package GUI_sample;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class aa extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aa frame = new aa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public aa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//다음화면으로 넘어간다. 
		JButton btnInsert = new JButton("눌러봐");
		btnInsert.setFont(new Font("배달의민족 연성", Font.BOLD, 17));
		btnInsert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose(); //지금창 해제, 프레임을 닫는다. aa에서 bb로 이동한다.
				setVisible(false);
				new bb().setVisible(true);				
				//새창 띄우기
				//미리 두개창 디자인하여 놓고 
				//new 클래스 이름().setVisible(true)
			}
			
		});
		btnInsert.setBounds(151, 165, 91, 47);
		contentPane.add(btnInsert);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("배달의민족 연성", Font.PLAIN, 15));
		lblNewLabel.setBounds(66, 51, 62, 18);
		contentPane.add(lblNewLabel);
		
		txtID = new JTextField();
		txtID.setBounds(126, 46, 116, 24);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setFont(new Font("배달의민족 연성", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(66, 100, 62, 18);
		contentPane.add(lblNewLabel_1);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(126, 95, 116, 24);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(aa.class.getResource("/images/fried-potatoes.png")));
		lblNewLabel_2.setBounds(308, 97, 68, 71);
		contentPane.add(lblNewLabel_2);
	}
}
