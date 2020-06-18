package com.offcn.gui03;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame("登录");
		jFrame.setLayout(new GridLayout(3,1));
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		JPanel jPanel3 = new JPanel();
		jPanel1.setLayout(new FlowLayout());
		jPanel2.setLayout(new FlowLayout());
		jPanel3.setLayout(new FlowLayout());
			
		JLabel jLabel1 = new JLabel("用户名");
		TextField textField1 = new TextField(20);
		
		jPanel1.add(jLabel1);
		jPanel1.add(textField1);
		
		JLabel jLabel2 = new JLabel("密    码");
		TextField textField2 = new TextField(20);
		
		jPanel2.add(jLabel2);
		jPanel2.add(textField2);
		
		Button button1 = new Button("登录");
		Button button2 = new Button("取消");
		
		jPanel3.add(button1);
		jPanel3.add(button2);
		
		jFrame.add(jPanel1);
		jFrame.add(jPanel2);
		jFrame.add(jPanel3);
		
		jFrame.setBounds(100, 100, 300, 150);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
		

	}

}
