import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Practice4 {
public static void main(String[] args) {
		
		Frame frame = new Frame();
		frame.setSize(400,400);
		frame.setLayout(new GridLayout(2,1));
		
		Panel panel1 = new Panel();
		panel1.setSize(400,200);
		
		Panel panel2 = new Panel();
		panel1.setSize(400,200);
		
		frame.add(panel1);
		frame.add(panel2);
		
		Button button1 = new Button("West(p1_西)");
		Button button2 = new Button("p2_Button1");
		Button button3 = new Button("p2_Button2");
		Button button4 = new Button("East(p1_东)");
		
		panel1.setLayout(new BorderLayout());
		panel1.add(button1,"West");
		panel1.add(button4,"East");
		
		Panel p= new Panel();
		panel1.add(p);
		p.setLayout(new GridLayout(2,1));
		p.add(button2);
		p.add(button3);
		
		Button button5 = new Button("West(p1_西)");
		Button button6 = new Button("East(p1_东)");
		panel2.setLayout(new BorderLayout());
		panel2.add(button5,"West");
		panel2.add(button6,"East");
		
		Panel panel3 = new Panel();
		panel2.add(panel3,"Center");
		
		panel3.setLayout(new GridLayout(2,2));
		
		
		for(int i=0;i<4;i++)
		{
			Button b1 = new Button("p4_Button"+i);
			panel3.add(b1);
		}
		
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
		
		frame.setVisible(true);
		
	}
}
