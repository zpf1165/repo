import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class panelTest {

	public static void main(String[] args) {
		Frame frame=new Frame("Test Panel");
		
		frame.setLayout(null);//����������һ������ģʽ
		
		Panel panel=new Panel();
		
		frame.setBounds(100, 100, 300, 300);//ͬʱ���ô��ڵ�λ�û��д�С
		
		frame.setVisible(true);//���ڿɼ�
		
		panel.setBounds(50, 50, 100, 100);//��ʱ��λ�ø��ݴ�����˵
		
		frame.setBackground(Color.BLUE);//���ڱ���ɫ
		
		panel.setBackground(Color.RED);//��屳��ɫ
		
		frame.add(panel);//�������ӽ�����
	}
}
