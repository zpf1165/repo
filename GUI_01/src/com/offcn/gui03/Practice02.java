package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		jFrame.setLayout(new BorderLayout());
		
		JPanel jPanel1 = new JPanel();
	
		JPanel jPanel3 = new JPanel();
		
		jPanel1.setLayout(new FlowLayout());
		JButton jButton1 = new JButton("Î÷¹Ï");
		JButton jButton2 = new JButton("Æ»¹û");
		jPanel1.add(jButton1);
		jPanel1.add(jButton2);
		
		JButton jButton3 = new JButton("Ïã½¶");
		Dimension dimension = new Dimension(200,100);
		jButton3.setPreferredSize(dimension);
		jButton3.setVerticalAlignment(0);
		
		
		jPanel3.setLayout(new FlowLayout());
		JButton jButton4 = new JButton("ÀóÖ¦");
		JButton jButton5 = new JButton("ÆÏÌÑ");
		JButton jButton6 = new JButton("½Û×Ó");
		jPanel3.add(jButton4);
		jPanel3.add(jButton5);
		jPanel3.add(jButton6);
		
		jFrame.add(jPanel1,"North");
		jFrame.add(jButton3,"Center");
		jFrame.add(jPanel3,"South");
		
		jFrame.setBounds(100, 100, 300, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);

	}

}
