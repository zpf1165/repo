package com.offcn.gui03;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardlayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		JPanel cards = new JPanel();
		
		cards.setLayout(new CardLayout());
		
		Button button1 = new Button("注册");
		Button button2 = new Button("登录");
		Button button3 = new Button("找回密码");
		
		jPanel1.add(button1);
		jPanel1.add(button2);
		jPanel1.add(button3);
		
		TextField textField1 = new TextField("用户名",20);
		TextField textField2 = new TextField("密码",20);
		TextField textField3 = new TextField("验证码",20);
		
		jPanel2.add(textField1);
		jPanel2.add(textField2);
		jPanel2.add(textField3);
		
		cards.add(jPanel1,"card1");
		cards.add(jPanel2,"card2");
		
		CardLayout layout = (CardLayout) cards.getLayout();
		
		layout.show(cards, "card2");
		
		jFrame.add(cards);
		jFrame.setBounds(100, 100, 300, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
		
	}

}
