package com.offcn.gui03;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		
JButton jButton = new JButton("��ͨ��ť");
		
		JButton jButton2 = new JButton("���ñ�����ɫ");
		
		jButton2.setBackground(Color.YELLOW);
		
		JButton jButton3 = new JButton("���ð�ťΪ������");
		
		jButton3.setEnabled(false);//���ð�ť�Ŀ�����
		
		JButton jButton4 = new JButton("���ð�ť�ײ�����");
		
		Dimension dimension = new Dimension(160,200);
		
		jButton4.setPreferredSize(dimension);
		
		jButton4.setVerticalAlignment(3);//���ô�ֱ����ķ�ʽ
		
		jPanel.add(jButton);
		jPanel.add(jButton2);
		jPanel.add(jButton3);
		jPanel.add(jButton4);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(100, 100, 600, 300);

		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
	}

}
