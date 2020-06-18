package com.offcn.gui02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		
		frame.setLayout(new FlowLayout());
		TextField textField1 = new TextField();
		
		Label label = new Label("+");
		TextField textField2 = new TextField();
	
		Button button = new Button("=");
		button.addActionListener(new MyactionListener002());
		TextField textField3 = new TextField();
	
		frame.add(textField1);
		frame.add(label);
		frame.add(textField2);
		frame.add(button);
		frame.add(textField3);
		frame.pack();
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);;
			}
		});

	}

}

class MyactionListener002 implements ActionListener{

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
//		System.out.println(e.getActionCommand());
//		TextField tf=(TextField)e.getSource();
//		System.out.println("");
	}
	
	
	
}
