import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderLayOut {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(200, 200);
		frame.setLayout(new BorderLayout());
		
		Button East=new Button("East");
		Button West=new Button("West");
		Button South=new Button("South");
		Button North=new Button("North");
		
		Panel panel = new Panel();
		panel.setSize(100, 100);
		panel.setLayout(new FlowLayout(1,5,10));
		for(int i=1;i<10;i++) {
			Button button=new Button(""+i);
			panel.add(button);
		}
		
		frame.add(East,"East");
		frame.add(West,"West");
		frame.add(South,"South");
		frame.add(North,"North");
		frame.add(panel,"Center");
		
		//给窗口添加监听，当点击窗口按钮时，退出程序
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
//	frame.pack();
		frame.setVisible(true);
	}

}
