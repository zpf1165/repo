package com.offcn.gui02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		jFrame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		
		for(int i=1;i<10;i++) {
			JButton jButton = new JButton(""+i);
			jFrame.add(jButton);
		}
		jFrame.setSize(330, 150);
		jFrame.setDefaultCloseOperation(3);
		jFrame.setVisible(true);
	}

}
