package com.offcn.gui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyListenerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame = new Frame("test keylistener");
		frame.setSize(300, 200);
		frame.setLayout(new GridLayout(2,1));
		Button button = new Button("Çë°´ÏÂ¼üÅÌ");
		TextField textField = new TextField();
		button.addKeyListener(new MyKeyLisntener(textField));
		frame.add(button);
		frame.add(textField);
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
class MyKeyLisntener implements KeyListener{
	TextField t1;
	public MyKeyLisntener(TextField t1) {
		// TODO Auto-generated constructor stub
		this.t1=t1;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		t1.setText(t1.getText()+e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}