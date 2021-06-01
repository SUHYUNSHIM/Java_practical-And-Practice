package toolbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Toolbar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Toolbar frame = new Toolbar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Toolbar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(102, 204, 255));
		toolBar.setBounds(5, 5, 678, 73);
		contentPane.add(toolBar);
		
		JButton btnYellow = new JButton("");
		btnYellow.setToolTipText("Yellow");
					//addListenrer -> 이벤트 등록
		btnYellow.addMouseListener(new MouseAdapter() { //MouseAdapter는 이벤트 상속 개념.
			//5개의 메소드 정의를 안해도 되게 만드는 것이 Adapter이다.			
			@Override //이벤트 핸들러 
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel.setForeground(Color.YELLOW);				
			}
		});
		 btnYellow.setIcon(new ImageIcon(Toolbar.class.getResource("/images/paint-roller.png")));
		toolBar.add( btnYellow);
		
		JButton btnPink = new JButton("");
		btnPink.setToolTipText("Pink");
		btnPink.addMouseListener(new MouseAdapter() { //MouseAdapter는 이벤트 상속 개념.
			//5개의 메소드 정의를 안해도 되게 만드는 것이 Adapter이다.			
			@Override //이벤트 핸들러 
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel.setForeground(Color.PINK);				
			}
		});
		btnPink.setIcon(new ImageIcon(Toolbar.class.getResource("/images/painting-roller.png")));
		toolBar.add(btnPink);
		
		JButton btnText = new JButton("");
		btnText.setToolTipText("Text");
		btnText.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setFont(new Font("배달의민족 도현",Font.ITALIC,30));
				lblNewLabel.setForeground(new Color(187,227,9));	
			}			
		});
		btnText.setIcon(new ImageIcon(Toolbar.class.getResource("/images/text.png")));
		toolBar.add(btnText);
		
		JButton btnClose= new JButton("");
		btnClose.setToolTipText("Close");
		btnClose.setIcon(new ImageIcon(Toolbar.class.getResource("/images/wrong.png")));
		toolBar.add(btnClose);
		
		lblNewLabel = new JLabel("The best group, NCT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(197, 131, 383, 134);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("배달의민족 도현", Font.PLAIN, 15));
		textField.setText("태일\r\n쟈니\r\n태용\r\n유타\r\n도영\r\n재현\r\n정우\r\n마크\r\n해찬\r\n재민\r\n제노\r\n지성\r\n천러\r\n런쥔\r\n♡");
		textField.setBounds(116, 307, 587, 186);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
