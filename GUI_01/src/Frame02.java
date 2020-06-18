import java.awt.Color;
import java.awt.Frame;

public class Frame02 {
	public static void main(String[] args) {
		new Myframe(100, 100, 200, 200, Color.BLACK);
	}

}

/*myframe继承了Frame的特性
 * 包括frame中的方法、属性
*/
class Myframe extends Frame{
	//设置Myframe的构造方法，将需要的参数都封装进来，在创建这个对象时构造方法之前
	public Myframe(int x,int y,int width,int height,Color c) {
		
		setLocation(x,y);
		setSize(width,height);
		setBackground(c);
		setVisible(true);
	}

}