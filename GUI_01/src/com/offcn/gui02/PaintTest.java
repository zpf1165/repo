package com.offcn.gui02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintTest {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(300, 300);
		frame.add(new DrawPanel());
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

}

class DrawPanel extends Panel{
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//������������ɫ
		g.setColor(Color.RED);
		//��һ��ʵ����Բ
		g.fillOval(100, 100, 50, 50);
		g.setColor(Color.BLUE);
		//��һ��ʵ�ľ���
		g.fillRect(100, 150, 100, 100);
		Color color = g.getColor();
		System.out.println(color);
	}
}
