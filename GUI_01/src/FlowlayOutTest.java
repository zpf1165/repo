import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/*
 * 流式布局：按照从左到右排流，宽度不够换行
 * 流式布局默认是居中布局
*/
public class FlowlayOutTest {
	public static void main(String[] args) {
		Frame frame=new Frame();
		
		//第一个参数表示对齐的方式，第二个参数表示 水平间距  第三个参数表示垂直间距,可以用数字代替水平方式的参数
		frame.setLayout(new FlowLayout(4,20,20));//设置frame的布局为流式布局
		
		Button button1 =new Button("button1");
		Button button2 =new Button("button2");
		Button button3 =new Button("button3");
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.pack();//设置布局的最佳大小和位置
		
		frame.setVisible(true);
	}

}
