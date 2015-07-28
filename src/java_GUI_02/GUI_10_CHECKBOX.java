package java_GUI_02;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.border.TitledBorder;

class MyFrame_10 extends Frame{	//frame을 상속받아 하나의 Frame이 되었다.
	
	//필요한 항목들은 멤버 변수로 정의
	

	private BorderLayout border = new BorderLayout();
	private GridLayout grid = new GridLayout(1,3);
	
	private Checkbox checkbox1 = new Checkbox("SLEEP");
	private Checkbox checkbox2 = new Checkbox("SHOPPING");
	private Checkbox checkbox3 = new Checkbox("TV");

	private Label lb = new Label("??", Label.CENTER);
	private Panel panel = new Panel();
	private Font font_i = new Font("", Font.ITALIC, 15);
	
	public void init(){
		
		this.setLayout(new GridLayout(2, 1)); // 2줄 1칸
		this.add(lb);
		
		lb.setFont(new Font("", Font.BOLD, 40));
		
		this.add(panel);
		panel.setLayout(new GridLayout(1,3));
		
		panel.add(checkbox1);
		checkbox1.setFont(font_i);
		
		panel.add(checkbox2);
		checkbox2.setFont(font_i);
		
		panel.add(checkbox3);
		checkbox3.setFont(font_i);
	}
	
	//생성자에 기본적인 설정(초기화) 내용을 정의
	public MyFrame_10(){
		
		init();
		//화면의 제목 설정
		this.setTitle("AWT 실습");
		
		
		//크기설정
		this.setSize(400, 300); // 모니터 해상도에 따라서 다르다
		
		//화면 중심 계산
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		//Toolkit = GUI에서 사용하는 도구클래스
		//도구클래스에서 기본클래스를 가져와서 사이즈 계산하는 클래스 가져온다
		//dimension으로 포장해서 가져온다.
		
		//( 화면 중심 - 창의 중심 )의 반
		int xpos = di.width/2 - this.WIDTH/2;
		int ypos = di.height/2 - this.getHeight()/2;
		
		System.out.println(di); // []안의 내용이 객체가 가져오는 내용이다.
		
		//위치
		this.setLocation(xpos, ypos); 
		
		// 크기 고정 - false로 설정한다.
		this.setResizable(false); 
		
		//부모의 것들을 보이도록 설정
		this.setVisible(true);
		
	}
}

public class GUI_10_CHECKBOX
{
	public static void main(String[] args) {
		//MyFrame_10 의 객체만 생성
		MyFrame_10 mf = new MyFrame_10(); 
		
	}
}
