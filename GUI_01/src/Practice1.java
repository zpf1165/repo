import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Practice1 {
	public static void main(String[] args) {
		Frame frame=new Frame("TestFlowLayout");
		frame.setLayout(new FlowLayout(1,20,20));
		frame.setBackground(Color.BLUE);
		frame.setSize(60, 50);
		
		Button button1 =new Button("BUTTON");
		Button button2 =new Button("BUTTON");
		Button button3 =new Button("BUTTON");
		Button button4 =new Button("BUTTON");
		Button button5 =new Button("BUTTON");
		Button button6 =new Button("BUTTON");
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		
		frame.pack();
		frame.setVisible(true);
	}
}
