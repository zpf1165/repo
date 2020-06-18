import java.awt.Color;
import java.awt.Frame;

public class Frame01 {

	public static void main(String[] args) {
		
		Frame f=new Frame("我的第一个frame");//创建一个窗口对象，窗口存在内存中
		
		f.setLocation(100, 100);//设置窗口位置
		
		f.setBackground(Color.BLUE);//设置窗口的背景颜色
		
		f.setSize(200, 200);//给窗口设置大小
		
		f.setResizable(false);//设置窗口大小不可变
		
		f.setVisible(true);//设置窗口的可见性，一般写在最后
	}
}
