package com.offcn.gui03;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class JlistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("请选择");
		
		String[] strs=new String[] {"身份证","军官证","暂住证"};
		
		JList<Object> jList = new JList<>(strs);
		
		jPanel.add(jLabel);
		
		jPanel.add(jList);
		
		jFrame.add(jPanel);
		
		jFrame.setSize(300, 300);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
	}

}
