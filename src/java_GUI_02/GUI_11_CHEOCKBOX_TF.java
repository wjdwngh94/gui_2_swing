package java_GUI_02;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

class MyFrame_11 extends Frame{	
	
	private Label lb = new Label("which", Label.CENTER);

	private CheckboxGroup cg = new CheckboxGroup();
	
	private Checkbox checkbox1 = new Checkbox("BAE", cg, false);
	private Checkbox checkbox2 = new Checkbox("PARK", cg, true);
	
	private Panel panel = new Panel();
	public void init(){
		
		this.setLayout(new GridLayout(2, 1)); // 2줄 1칸
		this.add(lb);
		
		lb.setFont(new Font("", Font.BOLD, 40));
		
		this.add(panel);
		panel.setLayout(new GridLayout(1,2));
		panel.add(checkbox1);
		panel.add(checkbox2);
	}
	public MyFrame_11(){
		
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

public class GUI_11_CHEOCKBOX_TF
{
	public static void main(String[] args) {
		//MyFrame_11 의 객체만 생성
		MyFrame_11 mf = new MyFrame_11(); 
		
	}
}
