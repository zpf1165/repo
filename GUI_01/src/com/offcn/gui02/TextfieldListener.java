package com.offcn.gui02;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextfieldListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("textfieldlistener");
		TextField textField = new TextField();
		frame.add(textField);
		frame.setSize(200, 100);
		textField.addActionListener(new MyactionListener07());
		//将文本的编码字符改成星号,触发激活时间时仍然可以得到文本内容
		textField.setEchoChar('*');
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}
	class MyactionListener07 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// 调用e对象中的getSource会将事件的资源返回给我们,Object是对象的顶级父类
			/*
			 * 获取到文本对象之后就可以对文本对象进行操作，调用文本对象中的gettext方法可以
			 * 得到文本中的内容。。调用setText方法可以设置文本的内容.
			 * 
			 * */
			TextField tf = (TextField)e.getSource();
			
			System.out.println(tf.getText());
			
			tf.setText("");
		}
	}

