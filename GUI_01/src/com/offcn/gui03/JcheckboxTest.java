package com.offcn.gui03;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JcheckboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("常见的编程语言");
		JCheckBox jCheckBox1 = new JCheckBox("java",true);
		JCheckBox jCheckBox2 = new JCheckBox("c");
		JCheckBox jCheckBox3 = new JCheckBox("c++");
		JCheckBox jCheckBox4 = new JCheckBox("c#");
		JCheckBox jCheckBox5 = new JCheckBox("go");
		JCheckBox jCheckBox6 = new JCheckBox("php");
		
		jPanel.add(jLabel);
		jPanel.add(jCheckBox1);
		jPanel.add(jCheckBox2);
		jPanel.add(jCheckBox3);
		jPanel.add(jCheckBox4);
		jPanel.add(jCheckBox5);
		jPanel.add(jCheckBox6);
		
		jFrame.add(jPanel);
		
		jFrame.setSize(400, 100);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
		

	}

}
