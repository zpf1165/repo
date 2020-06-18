package com.offcn.gui02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListenerTest02 {

	public static void main(String[] args) {
	
		Frame frame = new Frame("listener test");
		
		frame.setSize(200, 120);
		
		Button button = new Button("start");
		Button button1 = new Button("end");
		
		button.addActionListener(new MyactionListener02());
		
		button1.addActionListener(new MyactionListener02());
		
		frame.setLayout(new BorderLayout());
		
		frame.add(button,new BorderLayout().NORTH);
		
		frame.add(button1,new BorderLayout().CENTER);

		//可以对事件进行命令的设置，返回之后就是我们设置的内容
		
		button1.setActionCommand("Game,over");
		
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
				
			}
			
		});
		
		frame.setVisible(true);
	}

}
//实现接口的弊端：必须要重写里面所有的方法
class MyactionListener02 implements ActionListener{

	// e这个对象封装了事件的所有功能，都通过e对象来调用。
	@Override
	public void actionPerformed(ActionEvent e) {
		//e 对象调用getactioncommend方法会返回给我们该事件的指令
		System.out.println(e.getActionCommand());
		
	}
	
	
	
}