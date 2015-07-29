package java_GUI_02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame_16 extends Frame implements ActionListener {

	// 필요한 항목들은 멤버 변수로 정의

	// 레이아웃 2개

	// 배열 생성
	// 버튼 배열
	private Button[] bt = new Button[16];

	// 버튼 제목 배열
	private String[] title = new String[] {
			// new String("1");
			"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0",
			".", "/", "=" };

	// panel : frame 처럼 레이아웃 설정이 가능한 투명한 공간
	private Panel panel = new Panel();

	private TextField field = new TextField();

	// Menu
	private MenuBar bar = new MenuBar();

	private Menu top = new Menu("MENU");
	private Menu file = new Menu("FILE");

	private MenuItem fexit = new MenuItem("exit");

	private Menu level = new Menu("MODE");

	private CheckboxMenuItem mode1 = new CheckboxMenuItem("cal1");
	private CheckboxMenuItem mode2 = new CheckboxMenuItem("cal2");

	public void event() {

		// 종료 메뉴에 event 설정
		fexit.addActionListener(this); // bt.addActionListener(처리대상); 나 : this ,
										// 남 : 객체

		for (int i = 0; i < bt.length; i++) {
			bt[i].addActionListener(this);

		}
	}

	public void init() {

		// 메뉴설정
		this.setMenuBar(bar); // 메뉴바는 불특정 공간 그래서 보여줘야 한다.

		bar.add(top);
		top.add(file);
		top.add(level);

		file.add(fexit);

		level.add(mode1);
		level.add(mode2);

		// 컴포넌트 배치
		// this.setLayout(border); // new BorderLayout();

		this.setLayout(new BorderLayout());
		this.add(field, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4));

		// 라벨의 글꼴을 font로 설정
		field.setFont(new Font("", Font.BOLD, 15));

		// 라벨의 배경을 color로 설정
		field.setBackground(new Color(205, 247, 193));

		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button(title[i]); // 버튼 생성

			// 폰트 설정하기
			bt[i].setFont(new Font("", Font.ITALIC, 20)); // 객체로 사용하지 않고 일회용으로

			// 배경과 글자색 설정하기
			bt[i].setBackground(Color.LIGHT_GRAY); // 상수 객체 - 배경
			bt[i].setForeground(Color.GRAY); // 상수객체 -글자

			// bt[i]에 커서 모양 적용하기
			bt[i].setCursor(new Cursor(Cursor.HAND_CURSOR));

			panel.add(bt[i]);
		}

	}

	public MyFrame_16() {

		init();
		event();
		// 화면의 제목 설정
		this.setTitle("계산기");

		// 크기설정
		this.setSize(400, 300); // 모니터 해상도에 따라서 다르다

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == fexit) {
			System.exit(0);
		} // 버튼의 글자를 textfield에 표시한다
		try {
			for (int i = 0; i < bt.length; i++) {
				if (e.getSource() == bt[i]) {
					int su = Integer.parseInt(e.getActionCommand()); // 0 ~ 9 빼고
																		// 전부 에러
					// 버튼의 글자를 텍스트 필드에 표시
					String text = bt[i].getLabel();
					String origin = field.getText();

					field.setText(origin + text);

				}
			}
		} catch (Exception err) {
			// 숫자가 아니면 이 부분이 실행된다.
			System.out.println(e.getActionCommand());
			field.setText("");
			
		}
	}

}

public class GUI_16_CAL_EVENT {
	public static void main(String[] args) {

		// MyFrame_16 의 객체만 생성
		MyFrame_16 mf = new MyFrame_16();

	}
}
