package java_GUI_02;

//text field , text area

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;

class MyFrame_09 extends Frame { // frame을 상속받아 하나의 Frame이 되었다.

	private BorderLayout border = new BorderLayout();
	
	private Label lb = new Label("TITLE ", Label.LEFT);
	private Button bt = new Button("SEND");
	
	private Panel panel = new Panel();
	
	private TextField field = new TextField();
	private TextArea textArea = new TextArea();

	public void init() {

		
		this.setLayout(border);
		
		panel.setLayout(new BorderLayout());
		
		this.add(panel , BorderLayout.NORTH);
		
		panel.add(lb, BorderLayout.WEST);
		panel.add(field, BorderLayout.CENTER);
		panel.add(bt, BorderLayout.EAST);
		
		this.add(textArea, BorderLayout.CENTER);
		

		
	}

	public MyFrame_09() {

		init();
		// 화면의 제목 설정
		this.setTitle("Message");

		// 크기설정
		this.setSize(400, 300); // 모니터 해상도에 따라서 다르다

		// 화면 중심 계산
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		// Toolkit = GUI에서 사용하는 도구클래스
		// 도구클래스에서 기본클래스를 가져와서 사이즈 계산하는 클래스 가져온다
		// dimension으로 포장해서 가져온다.

		// ( 화면 중심 - 창의 중심 )의 반
		int xpos = di.width / 2 - this.WIDTH / 2;
		int ypos = di.height / 2 - this.getHeight() / 2;

		System.out.println(di); // []안의 내용이 객체가 가져오는 내용이다.

		// 위치
		this.setLocation(xpos, ypos);

		// 크기 고정 - false로 설정한다.
		this.setResizable(false);

		// 부모의 것들을 보이도록 설정
		this.setVisible(true);

	}
}

public class GUI_09_TEXTFIELD
{
	public static void main(String[] args) {
		// MyFrame_09 의 객체만 생성
		MyFrame_09 mf = new MyFrame_09();

	}
}
