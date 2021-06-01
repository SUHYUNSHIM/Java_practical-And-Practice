package hellopkg;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class HelloWB extends JFrame {

	private JPanel contentPane; //전역변수
	JLabel lblDisplay; //전역변수로 선언  
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWB frame = new HelloWB();
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
	public HelloWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 931, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); //absolute layout. 자기가 알아서 받겠다는 뜻.
		
		
		JButton btnSelect = new JButton("눌러봐");
		btnSelect.addActionListener(new ActionListener() { //이벤트 등록 //이벤트 상속
			public void actionPerformed(ActionEvent arg0) { //이벤트 핸들러
				//작업
				//라벨에다가 원하는 글자를 넣어준다.
				//로직을 작성하여 완성해야 함.
				//객체.속성 = 값 x -> 캡슐화를 위해서 setter를 사용한다.
				//객체.메소드 () 로 쓰자.
				lblDisplay.setText("뭐 좀 시키자");
			}
		});
		btnSelect.setFont(new Font("DX경필고딕B", Font.PLAIN, 20));
		btnSelect.setBounds(43, 50, 165, 50);
		contentPane.add(btnSelect);
		
		//JLabel ldlDisplay, JLabel 삭제
		lblDisplay= new JLabel(""); //빈문자열인 것이 맞다. 누르면 나오게 할 것.
		lblDisplay.setFont(new Font("나눔스퀘어", Font.BOLD, 20));
		lblDisplay.setBounds(43, 171, 203, 24);
		contentPane.add(lblDisplay);
		
		btnNewButton = new JButton("메뉴");
		btnNewButton.setIcon(new ImageIcon(HelloWB.class.getResource("/images/menu.png")));
		btnNewButton.setBounds(32, 207, 155, 65);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("콜라");
		btnNewButton_1.setIcon(new ImageIcon(HelloWB.class.getResource("/images/coke.png")));
		btnNewButton_1.setBounds(234, 207, 143, 124);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("햄버거");
		btnNewButton_2.setIcon(new ImageIcon(HelloWB.class.getResource("/images/hamburger.png")));
		btnNewButton_2.setBounds(234, 50, 143, 124);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("감튀");
		btnNewButton_3.setIcon(new ImageIcon(HelloWB.class.getResource("/images/fried-potatoes.png")));
		btnNewButton_3.setBounds(235, 383, 142, 124);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("손님");
		btnNewButton_4.setIcon(new ImageIcon(HelloWB.class.getResource("/images/son.png")));
		btnNewButton_4.setBounds(477, 50, 364, 508);
		contentPane.add(btnNewButton_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 329, 155, 178);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"햄버거", "감자튀김", "콜라"}));
		comboBox.setBounds(42, 529, 124, 24);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(424, 367, 1, 1);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(379, 52, 84, 80);
		contentPane.add(scrollPane_2);
		
		JList list = new JList();
		scrollPane_2.setViewportView(list);
		list.addListSelectionListener(new ListSelectionListener() { //이벤트 등록, 이벤트 상속 
			public void valueChanged(ListSelectionEvent e) { //listBox의 이벤트 핸듦러는 valueChanged이다. 처리함수.
				if(e.getSource()==list) { //리스트박스가 맞는지
					int size1 = list.getModel().getSize(); //JList 전체갯수
					int index1  = list.getSelectedIndex(); //선택된 index 번째 
					String indexElement1 = (String) list.getModel().getElementAt(index1);
					JOptionPane.showMessageDialog(null,"전체 갯수는"+String.valueOf(size1)+"\n선택한 항목은"+indexElement1);
				}				
			} //valueChanged메소드 끝
		}); //addListSelectinoListener 끝
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //속성창에서 하나만 선택가능하도록 했다.
		
		
		list.setBackground(Color.GREEN);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"NCT 127", "NCT DREAM", "Way v", "NCT", "태일", "쟈니", "재민", "재현", "지성", "도영"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		comboBox.addActionListener(new ActionListener() { //이벤트 등록, 상속 개념
			public void actionPerformed(ActionEvent e) { //이벤트 핸들러 
				//if(e.getSource() == comboBox) -> 객체명과 비교
				JOptionPane.showMessageDialog(comboBox, (String)comboBox.getSelectedItem());
				//JOptionPane.showMessageDialog(null, (String)comboBox.getSelectedItem()); (화면 정가운데 찍힌다.)
			}
		});
	}
}
