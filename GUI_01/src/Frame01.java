import java.awt.Color;
import java.awt.Frame;

public class Frame01 {

	public static void main(String[] args) {
		
		Frame f=new Frame("�ҵĵ�һ��frame");//����һ�����ڶ��󣬴��ڴ����ڴ���
		
		f.setLocation(100, 100);//���ô���λ��
		
		f.setBackground(Color.BLUE);//���ô��ڵı�����ɫ
		
		f.setSize(200, 200);//���������ô�С
		
		f.setResizable(false);//���ô��ڴ�С���ɱ�
		
		f.setVisible(true);//���ô��ڵĿɼ��ԣ�һ��д�����
	}
}
