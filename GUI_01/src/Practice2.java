import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Practice2 {
	public static void main(String[] args) {
		Frame frame=new Frame("BorderLayOutTest");
		frame.setBounds(300, 300, 200, 200);
		frame.setLayout(new BorderLayout());
		Panel panel=new Panel();
		
		panel.setBounds(100, 100, 30, 30);
		frame.add(panel,"Center");
		
		panel.setLayout(new FlowLayout(1,10,10));
		for(int i=1;i<10;i++) {
			Button button=new Button(""+i);
			panel.add(button);
		}
		
		Button East=new Button("East");
		Button West=new Button("West");
		Button South=new Button("South");
		Button North=new Button("North");
		
		frame.add(East,"East");
		frame.add(West,"West");
		frame.add(South,"South");
		frame.add(North,"North");
		
//		frame.pack();
		frame.setVisible(true);
	
	}
}
