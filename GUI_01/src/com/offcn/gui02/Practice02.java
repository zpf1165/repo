package com.offcn.gui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe02 myframe02 = new Myframe02();
		
		myframe02.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

}
class Myframe02 extends Frame{
	public Myframe02() {
		// TODO Auto-generated constructor stub
		setSize(300, 100);
		setLayout(new GridLayout(1,2));
		Button button1 = new Button("确定");
		Button button2 = new Button("取消");
		button1.addActionListener(new Action002());
		button2.addActionListener(new Action002());
		add(button1);
		add(button2);
		pack();
		setVisible(true);
	}
}
class Action002 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		String i=e.getActionCommand();
//		if(i=="确定") {
//			Frame frame = new Frame();
//			frame.setBounds(200, 200, 100, 100);
//			frame.setVisible(true);
//		
//		}
		if(e.getActionCommand().equals("确定")) {
			Frame frame = new Frame();
			frame.setBounds(200, 200, 100, 100);
			frame.setVisible(true);
		}
		else {
			System.exit(0);
		}
	}
}