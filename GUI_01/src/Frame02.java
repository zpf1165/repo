import java.awt.Color;
import java.awt.Frame;

public class Frame02 {
	public static void main(String[] args) {
		new Myframe(100, 100, 200, 200, Color.BLACK);
	}

}

/*myframe�̳���Frame������
 * ����frame�еķ���������
*/
class Myframe extends Frame{
	//����Myframe�Ĺ��췽��������Ҫ�Ĳ�������װ�������ڴ����������ʱ���췽��֮ǰ
	public Myframe(int x,int y,int width,int height,Color c) {
		
		setLocation(x,y);
		setSize(width,height);
		setBackground(c);
		setVisible(true);
	}

}