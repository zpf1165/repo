package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class clickTest {

	static int click;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame("");
		
		jFrame.setLayout(new BorderLayout(0,0));
		
		JButton jButton = new JButton("点击一下");
		
		JLabel jLabel = new JLabel();

		jLabel.setText("");
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jLabel.setText("点击了"+(++click)+"下");
			}
		});
		
		
		
		jFrame.add(jButton,BorderLayout.NORTH);
		jFrame.add(jLabel,BorderLayout.SOUTH);
		
		jFrame.setSize(300, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
	}

}
