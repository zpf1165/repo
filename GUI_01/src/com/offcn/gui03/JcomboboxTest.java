package com.offcn.gui03;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JcomboboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		
		JComboBox<Object> jComboBox = new JComboBox<>();
		//可以添加object 对象的顶级父类 
		jComboBox.addItem("--请选择证件类型--");
		jComboBox.addItem("身份证");
		jComboBox.addItem("军官证");
		jComboBox.addItem("暂住证");
		
		jPanel.add(jComboBox);
		jFrame.add(jPanel);
		jFrame.setSize(400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
	}

}
