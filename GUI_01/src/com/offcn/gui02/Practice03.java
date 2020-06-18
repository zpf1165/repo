package com.offcn.gui02;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.YELLOW);
		jFrame.add(jPanel);
		
		JButton jButton1 = new JButton("Java");
		JButton jButton2 = new JButton("Python");
		JButton jButton3 = new JButton("PHP");
		JButton jButton4 = new JButton("C++");
		
		
		jPanel.setLayout(new FlowLayout(0,20,20));
		
		jPanel.add(jButton1);
		jPanel.add(jButton2);
		jPanel.add(jButton3);
		jPanel.add(jButton4);
		
		jFrame.setSize(300, 150);
		jFrame.setDefaultCloseOperation(3);
		jFrame.setVisible(true);
	}

}
