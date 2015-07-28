package java_GUI_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.Label;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.util.Calendar;

class MyFrame_14 extends Frame{	//frame을 상속받아 하나의 Frame이 되었다.

	private Label label = new Label();
	private TextArea area = new TextArea();
	
	private Font font = new Font("", Font.ITALIC, 25); //("글꼴", 형태, 크기);
	private Color color = new Color(0, 0, 255); // RGB 
	private Cursor cursor = new Cursor(TEXT_CURSOR);
	private Calendar cal = Calendar.getInstance(); 
	
	public void init(){
		
		int hour = cal.get(Calendar.HOUR);//HOUR_OF_DAY는 24시간
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		String today = "TIME : " + hour+ "h : "+min+"min : "+sec+"sec";
		label.setText(today);
		
		this.add(label, BorderLayout.NORTH);
		
		this.add(area, BorderLayout.CENTER);
		area.setFont(font);
		area.setForeground(color);
		area.setCursor(cursor);
		
	}
	
	public MyFrame_14(){
	
		init();	
		
		//화면의 제목 설정
		this.setTitle("메모장");
	
		
		//크기설정
		this.setSize(400, 300); // 모니터 해상도에 따라서 다르다
		
		//화면 중심 계산
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
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

public class GUI_14_MEMO //Gui 에서는 명령들을 event로 정의 해줘야 한다.
{
	public static void main(String[] args) {
		//MyFrame_14 의 객체만 생성
		MyFrame_14 mf = new MyFrame_14(); 
		
	}
}
