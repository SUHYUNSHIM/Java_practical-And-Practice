package ButtonClass2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JButtonMainClass extends JFrame implements ActionListener{

		//필드. int door
		//label
		JLabel jl1 = new JLabel("SM방송주관");
		JLabel jl2 = new JLabel("월말평가");
		JLabel jl3 = new JLabel("잘한 연습생들은");
		
		//button
		JButton jb1= new JButton("노래 10점");
		JButton jb2= new JButton("댄스 20점");
		JButton jb3= new JButton("영어회화 30점");
		JButton jb4= new JButton("아육대 100점");
		JButton jb5= new JButton("추리게임 90점");
		JButton jb6= new JButton("예능 80점");
		JButton jb7= new JButton("총점수?");
		JButton jb8= new JButton("취소");
		
		//combobox = textbox + listbox--------------------------------------------
		String[] age1 = {"데뷔 유력조","데뷔 대기조","추가 연습조"};
		JComboBox jcb1= new JComboBox(age1);
		
		//초기치(누적방)
		String hangmok=""; //빈문자열, 길이가 0인 문자열
		int jum =0;
		
		public JButtonMainClass() { //생성자
			setLayout(new GridLayout(0,3,30,30));
			//FlowLayout(): 좌우로, 시작은 중앙.
			//setLayout(new GridLayout. 행, 열,
			//0이라는 것은 개수가 상관이 없다는 뜻
			jl1.setFont(new Font("굴림",Font.BOLD,25));
			add(jl1); //getContentPane.add(); getContentPane을 안써도 된다.
			//배경의 범위를 설정해주는 것.
			jl2.setFont(new Font("굴림",Font.BOLD,25));
			add(jl2);
			jl3.setFont(new Font("굴림",Font.BOLD,25));
			add(jl3);
			
			//버튼 6개 - 2행을 처리
			jb1.addActionListener(this); //버튼을 이벤트로 등록
			add(jb1); //창에 버튼을 add
			jb2.addActionListener(this);
			add(jb2);
			jb3.addActionListener(this);
			add(jb3);
			jb4.addActionListener(this);
			add(jb4);
			jb5.addActionListener(this);
			add(jb5);
			jb6.addActionListener(this);
			add(jb6);
			
			//눌러봐 , 취소, 콤보박스 디자인 및 이벤트 등록 
			jcb1.addActionListener(this); //콤보박스
			add(jcb1);
			
			jb7.setFont(new Font("굴림", Font.BOLD,30)); //눌러봐 버튼
			jb7.setForeground(Color.red);
			jb7.setBackground(Color.cyan);
			jb7.addActionListener(this);
			add(jb7);
			
			jb8.setFont(new Font("굴림", Font.BOLD,30)); //취소 버튼
			jb8.setBackground(Color.blue);
			jb8.setForeground(Color.YELLOW);
			jb8.addActionListener(this);
			add(jb8);
			
			setTitle("SM 월말평가");
			setSize(700,700);
			setVisible(true);
		}//생성자 end 
		
		
		@Override
		public void actionPerformed(ActionEvent e) { //이벤트 핸들러
			if(e.getSource() ==jb1) {//노래, 항목기억창고에
				hangmok +=jb1.getText()+"\n"; //노래 10점
				jum = jum +10; //영어말하기 30점
			}
			if(e.getSource() ==jb2) {//댄스, 항목기억창고에
				hangmok +=jb2.getText()+"\n"; //"노래 10" + "\n"
				jum = jum +20; 				  //"댄스 20점"		
			}
			if(e.getSource() ==jb3) {//영어 말하기
				hangmok +=jb3.getText()+"\n"; 
				jum = jum +30; //영어말하기 30점				
			}
			if(e.getSource() ==jb4) {//아육대
				hangmok +=jb4.getText()+"\n"; 
				jum = jum +100; 		
			}
			if(e.getSource() ==jb5) {//추리게임
				hangmok +=jb5.getText()+"\n"; 
				jum = jum +90; //영어말하기 30점				
			}
			if(e.getSource() ==jb6) {//예능
				hangmok +=jb6.getText()+"\n"; 
				jum = jum +80; //영어말하기 30점				
			}
			
			if(e.getSource() == jcb1) {//콤보박스
				//맨앞의 jcb1 대신에 null을 넣어도 된다. null은 화면 중앙에 뜬다.
				JOptionPane.showMessageDialog(jcb1,
						(String)jcb1.getSelectedItem()+"이시군요");
				//누르면 나이대 메시지 출력으로 설문응대 대상 조사 끝 / 객체.getSelectedItem() -> 
				//어떤 것이 선택되었는지 알려준다.
				//그리고 객체에서 문자열로 형변환 시켜줘야 한다.
				//jum = jum+10; //만일 설문 응대자에게 10점주고 싶으면
			}
			if(e.getSource() == jb7) { //눌러봐를 누른 경우
				String msg1 = hangmok +"총점수는" +String.valueOf(jum)+"점";
				JOptionPane.showMessageDialog(jb7, msg1);
				
				hangmok="";// 전 처리내용
				jum =0;
			}
			if(e.getSource()==jb8) { //"취소"버튼
				hangmok ="";
				jum =0;
				JOptionPane.showMessageDialog(jb8,"취소했습니다.");
				
			}//actionPerformed 끝
		}//JButttonMainClass 끝.
		
		
	public static void main(String[] args) {
		new JButtonMainClass();
	}
}
