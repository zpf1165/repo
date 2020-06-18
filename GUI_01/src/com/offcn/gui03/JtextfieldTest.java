package com.offcn.gui03;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JtextfieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JTextField jTextField = new JTextField(20);
		
		jTextField.setText("这是一个普通的文本框");
		
		JTextField jTextField2 = new JTextField("猥琐发育，别浪");
		
		jTextField2.setFont(new Font("楷体", Font.BOLD, 16));
		
		JTextField jTextField3 = new JTextField(30);
		
		jTextField3.setText("这是居中对齐的文本");
		
		jTextField3.setHorizontalAlignment(JTextField.CENTER);//设置文本居中对齐
		
		jPanel.add(jTextField);
		jPanel.add(jTextField2);
		jPanel.add(jTextField3);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(200, 200, 100, 300);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
	}

}
