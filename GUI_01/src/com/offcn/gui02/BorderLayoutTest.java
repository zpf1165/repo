package com.offcn.gui02;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jFrame = new JFrame();
		Button button1 = new Button("East");
		Button button2 = new Button("West");
		Button button3 = new Button("Center");
		Button button4 = new Button("North");
		Button button5 = new Button("South");
		
		jFrame.add(button1,new BorderLayout().EAST);
		jFrame.add(button2,new BorderLayout().WEST);
		jFrame.add(button3,new BorderLayout().CENTER);
		jFrame.add(button4,new BorderLayout().NORTH);
		jFrame.add(button5,new BorderLayout().SOUTH);
		
		jFrame.setSize(300,200);
		jFrame.setDefaultCloseOperation(3);
		jFrame.setVisible(true);
	}

}
