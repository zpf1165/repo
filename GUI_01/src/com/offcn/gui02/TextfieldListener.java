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
		//���ı��ı����ַ��ĳ��Ǻ�,��������ʱ��ʱ��Ȼ���Եõ��ı�����
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
			// ����e�����е�getSource�Ὣ�¼�����Դ���ظ�����,Object�Ƕ���Ķ�������
			/*
			 * ��ȡ���ı�����֮��Ϳ��Զ��ı�������в����������ı������е�gettext��������
			 * �õ��ı��е����ݡ�������setText�������������ı�������.
			 * 
			 * */
			TextField tf = (TextField)e.getSource();
			
			System.out.println(tf.getText());
			
			tf.setText("");
		}
	}

