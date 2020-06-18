import java.awt.Color;
import java.awt.Frame;

public class Frame01practice {
	public static void main(String[] args) {
		
		Frame f=new Frame();
		f.setBackground(Color.BLUE);
		f.setResizable(false);
		f.setSize(200, 200);
		f.setLocation(200, 200);
		f.setVisible(true);
		
	}

}
