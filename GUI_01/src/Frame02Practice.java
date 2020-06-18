import java.awt.Color;
import java.awt.Frame;

public class Frame02Practice {
	public static void main(String[] args) {
		
		new Myframe1(100, 100, 200, 200, Color.BLACK);
	}

}

class Myframe1 extends Frame {
	public Myframe1(int x,int y,int width,int height,Color c) {
		setLocation(x, y);
		setSize(width, height);
		setBackground(c);
		setVisible(true);
	}
}