import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BoderLayOutTest {
	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setLayout(new BorderLayout());//���ô��ڵĲ���ģʽΪ�߿򲼾�
		
		Button East=new Button("East");
		Button West=new Button("West");
		Button South=new Button("South");
		Button North=new Button("North");
		Button Center=new Button("Center");
/*		
		frame.add(East,new BorderLayout().EAST);
		frame.add(West,new BorderLayout().WEST);
		frame.add(South,new BorderLayout().SOUTH);
		frame.add(North,new BorderLayout().NORTH);
		frame.add(Center,new BorderLayout().CENTER);
		ͨ����λ�����ַ�������ֱ�����ò������򣬲���Ҫ��ȥ��������.
*/
		frame.add(East,"East");
		frame.add(West,"West");
		frame.add(South,"South");
		frame.add(North,"North");
		frame.add(Center,"Center");
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
