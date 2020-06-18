package com.offcn.gui02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintTest02 {
	public static void main(String[] args) {
		Frame frame = new Frame("奥运五环");
		frame.setSize(300, 200);
		frame.add(new DrawPanel02());
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

class DrawPanel02 extends Panel{
	
	int w=80;
	int h=80;
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		//画一个空心椭圆
		g.drawOval(10, 10, w, h);
		
		g.setColor(Color.BLUE);
		g.drawOval(80, 10, w, h);
		
		g.setColor(Color.ORANGE);
		g.drawOval(150, 10, w, h);
		
		g.setColor(Color.YELLOW);
		g.drawOval(50, 70, w, h);
		
		g.setColor(Color.BLACK);
		g.drawOval(120, 70, w, h);
		
		
	}
}
