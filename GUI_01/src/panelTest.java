import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class panelTest {

	public static void main(String[] args) {
		Frame frame=new Frame("Test Panel");
		
		frame.setLayout(null);//给窗口设置一个布局模式
		
		Panel panel=new Panel();
		
		frame.setBounds(100, 100, 300, 300);//同时设置窗口的位置还有大小
		
		frame.setVisible(true);//窗口可见
		
		panel.setBounds(50, 50, 100, 100);//此时的位置根据窗口来说
		
		frame.setBackground(Color.BLUE);//窗口背景色
		
		panel.setBackground(Color.RED);//面板背景色
		
		frame.add(panel);//将面板添加进窗口
	}
}
