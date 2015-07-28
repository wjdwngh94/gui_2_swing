package java_GUI_02;


// EVENT : 외부 입력에 의해 발생되는 상황(신호)
//java.awt.event. 패키지에 포함되어 있다. 

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame_15 extends Frame implements ActionListener{	//frame을 상속받아 하나의 Frame이 되었다.

	private Button bt = new Button("exit");
	
	private Button bt2 = new Button("made");
	public void init(){
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(bt);
		this.add(bt2);
		
	}
	public void event(){
		//이벤트 관련 설정
		
		//bt를 누르면 프로그램이 꺼지도록 작성된 코드와 연결
		bt.addActionListener(this);	//bt.addActionListener(처리대상); 나 : this , 남 : 객체
		// 처리대상에는 ActionListener라는 인터페이스 의 자식들이 들어간다.
		// bt 와 this를 연결시켜 주기 위해서는 actionLister를 사용한다.
		
	}
	public MyFrame_15(){
		
		init(); // 배치용도의 메소드
		event(); // 이벤트 전용 메소드
		
		//화면의 제목 설정
		this.setTitle("AWT 실습");
		
		
		//크기설정
		this.setSize(400, 300); // 모니터 해상도에 따라서 다르다
		
		//부모의 것들을 보이도록 설정
		this.setVisible(true);
		
	}
	
	
	@Override	
	public void actionPerformed(ActionEvent e) {
		
		//System.out.println(e);
		//System.out.println(e.getActionCommand()); // 글자
		//System.out.println(e.getSource()); // object 형태로 버튼의 객체를 돌려준다.
		
		if(e.getSource()== bt){
			System.exit(0);
		} else if(e.getSource() == bt2){
			System.out.println("만든이 : ???");
		}
	
	
	}
}

public class GUI_15_EVENT //Gui 에서는 명령들을 event로 정의 해줘야 한다.
{
	public static void main(String[] args) {
		//MyFrame_15 의 객체만 생성
		MyFrame_15 mf = new MyFrame_15(); 
		
	}
}
