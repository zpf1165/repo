package com.offcn.gui03;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JradiobuttonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JLabel jLabel = new JLabel("ÏÖÔÚÊÇÊ²Ã´¼¾½Ú");
		
		JRadioButton jRadioButton1 = new JRadioButton("´º¼¾");
		JRadioButton jRadioButton2 = new JRadioButton("ÏÄ¼¾",true);
		JRadioButton jRadioButton3 = new JRadioButton("Çï¼¾");
		JRadioButton jRadioButton4 = new JRadioButton("¶¬¼¾");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		buttonGroup.add(jRadioButton3);
		buttonGroup.add(jRadioButton4);

		jPanel.add(jLabel);
		jPanel.add(jRadioButton1);
		jPanel.add(jRadioButton2);
		jPanel.add(jRadioButton3);
		jPanel.add(jRadioButton4);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(100, 100, 400, 200);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
	}

}
