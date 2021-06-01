package GUI_sample;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Digital_clock extends JFrame {

	private JPanel contentPane;
	private JTextField txtHour;
	private JTextField txtSi;
	private JTextField txtMinute;
	private JTextField txtBoon;
	private JTextField txtSecond;
	private JTextField txtcho;
	//년월일시분초 14자리 포멧
	private Date date;	
	//타이머
	private Timer t1;
	static int sw = 0;  
	private JButton btnStart;  
	
	//
	private TimerTask timerTask;
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Digital_clock frame = new Digital_clock();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Digital_clock() {				
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHour = new JTextField();
		txtHour.setBounds(14, 67, 54, 24);
		contentPane.add(txtHour);
		txtHour.setColumns(10);
		
		 txtSi = new JTextField();
		 txtSi.setText("시");
		 txtSi.setBounds(82, 67, 42, 24);
		contentPane.add( txtSi);
		 txtSi.setColumns(10);
		
		txtMinute = new JTextField();
		txtMinute.setBounds(144, 67, 42, 24);
		contentPane.add(txtMinute);
		txtMinute.setColumns(10);
		
		txtBoon = new JTextField();
		txtBoon.setText("분");
		txtBoon.setBounds(200, 67, 42, 24);
		contentPane.add(txtBoon);
		txtBoon.setColumns(10);
		
		txtSecond = new JTextField();
		txtSecond.setBounds(256, 67, 42, 24);
		contentPane.add(txtSecond);
		txtSecond.setColumns(10);
		
		txtcho = new JTextField();
		txtcho.setText("초");
		txtcho.setBounds(316, 67, 42, 24);
		contentPane.add(txtcho);
		txtcho.setColumns(10);
		
		btnStart = new JButton("시작");
		
		btnStart.addActionListener(new ActionListener() {		
		//btnStart.addMouseListener(new MouseAdapter(){
			public void actionPerformed(ActionEvent e) {		
				//public void mouseClicked (MouseEvent e){
				if(e.getSource()== btnStart) {	
						btnStart.setEnabled(false);
						t1 = new Timer();										
						t1.scheduleAtFixedRate(new TimerTask(){
						public void run() {
							date = new Date(System.currentTimeMillis());
							SimpleDateFormat clockFormat = new SimpleDateFormat("HH,mm,ss");
							
							String time = (String)clockFormat.format(date);
							//char[] times = time.toCharArray(); //시분초를 문자열로 변환한 뒤, 문자열 배열로 바꾸었다.		
							//System.out.println(times[0]);
							String[] array = time.split(",");
							/*for(int i=0;i<array.length;i++) {
								System.out.println(array[i]);
							}*/						
							
							//txtHour.setText(String.valueOf(date.getHours()));
							//txtMinute.setText(String.valueOf(date.getMinutes()));
							//txtSecond.setText(String.valueOf(date.getSeconds()));	
							txtHour.setText(array[0]);
							txtMinute.setText(array[1]);
							txtSecond.setText(array[2]);	
							
							}			
						},1000,1000);										
				}
			}
		});
		
		
		btnStart.setBounds(148, 175, 105, 27);
		contentPane.add(btnStart);
		
	}
}
