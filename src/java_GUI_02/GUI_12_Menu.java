//메뉴 : Frame 상단에 위치하여 펼쳐지는 항목
//메뉴 등록 막대기 : MenuBar
//메뉴 : 눌렀을 때 추가적인 하위내용을 표시해주는 것들 : Menu 
//메뉴 아이템 : 실행 요소 MenuItem
//CheckboxMenuItem : 체크가 가능한 메뉴아이템

package java_GUI_02;


import java.awt.CheckboxMenuItem;
import java.awt.Dimension;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

class MyFrame_12 extends Frame{	//frame을 상속받아 하나의 Frame이 되었다.

	private MenuBar bar = new MenuBar();

	private Menu file = new Menu("FILE");
	private Menu edit = new Menu("EDIT");
	
	private MenuItem fnew = new MenuItem("new");
	private MenuItem fexit = new MenuItem("exit");
	
	private Menu level = new Menu("MODE");
	private CheckboxMenuItem mode1 = new CheckboxMenuItem("1");
	private CheckboxMenuItem mode2 = new CheckboxMenuItem("2");
	
	public void init(){
		//MenuBar는 컴포넌트가 아니므로 add()사용 불가
		
		this.setMenuBar(bar); // 메뉴바는 불특정 공간 그래서 보여줘야 한다.
		
		bar.add(file);
		bar.add(edit);
		
		file.add(fnew);
		file.addSeparator();//구분선 추가
		file.add(fexit);
		
		edit.add(level);
		level.add(mode1);
		level.add(mode2);
		
		
	}
	public MyFrame_12(){
		
		init();
		//화면의 제목 설정
		this.setTitle("AWT 실습");
		
		
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

public class GUI_12_Menu //Gui 에서는 명령들을 event로 정의 해줘야 한다.
{
	public static void main(String[] args) {
		//MyFrame_12 의 객체만 생성
		MyFrame_12 mf = new MyFrame_12(); 
		
	}
}
