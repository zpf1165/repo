import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Listener {
public static void main(String[] args) {
		
		myFrame03 myFrame03 = new myFrame03();
		
		myFrame03.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}

}

class myFrame03 extends Frame {
	
	public myFrame03() {
		
		Button button = new Button("Action me");
		//this关键字表示当前对象
		this.add(button);
		//给按钮添加一个激活事件，需要实现actionlistener接口
		button.addActionListener(new MyActionListener());
		
		pack();
		
		setVisible(true);
		
	}
	
	
}
//实现actionlistener接口之后需要重写他的方法。
class MyActionListener implements ActionListener{
	//当事件被激活时触发该方法中的代码
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("A Button has been Actioned");//向控制台输出语句
		
	}	
	
}