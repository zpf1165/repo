package com.offcn.gui03;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JlabelTest {

public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("��ͨ��ǩ");
		
		JLabel jLabel2 = new JLabel();
		
		jLabel2.setText("������setText�ı�ǩ");
		
		ImageIcon imageIcon = new ImageIcon("d:\\qq.png");
		
		JLabel jLabel3 = new JLabel("��ʼ���",imageIcon , JLabel.CENTER);
		
		jPanel.add(jLabel);
		jPanel.add(jLabel2);
		jPanel.add(jLabel3);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(200,200,600,300);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);

	}

}
