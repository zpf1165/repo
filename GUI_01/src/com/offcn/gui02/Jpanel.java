package com.offcn.gui02;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		jFrame.setSize(200, 200);
		JPanel jPanel = new JPanel();
		jFrame.add(jPanel);
		jPanel.setSize(200, 200);
		jPanel.setBackground(Color.WHITE);
		JLabel jLabel = new JLabel("sasd");
		jPanel.add(jLabel);
		jFrame.setVisible(true);
	}

}
