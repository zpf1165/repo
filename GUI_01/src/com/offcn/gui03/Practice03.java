package com.offcn.gui03;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame("用户注册界面");
		jFrame.setLayout(new GridLayout(3, 1));
		
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		JPanel jPanel3 = new JPanel();
		
		JLabel jLabel1 = new JLabel("你喜欢的运动");
		JCheckBox jCheckBox1 = new JCheckBox("足球");
		JCheckBox jCheckBox2 = new JCheckBox("篮球");
		JCheckBox jCheckBox3 = new JCheckBox("网球");
		
		jPanel1.add(jLabel1);
		jPanel1.add(jCheckBox1);
		jPanel1.add(jCheckBox2);
		jPanel1.add(jCheckBox3);
		
		JLabel jLabel2 = new JLabel("你的性别");
		JRadioButton jRadioButton1 = new JRadioButton("男");
		JRadioButton jRadioButton2 = new JRadioButton("女");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		
		jPanel2.add(jLabel2);
		jPanel2.add(jRadioButton1);
		jPanel2.add(jRadioButton2);
		
		JButton jButton1 = new JButton("注册用户");
		JButton jButton2 = new JButton("取消用户");
		
		jPanel3.add(jButton1);
		jPanel3.add(jButton2);
		
		jFrame.add(jPanel1);
		jFrame.add(jPanel2);
		jFrame.add(jPanel3);
		
		jFrame.setBounds(100, 100, 400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);

	}

}
