package com.offcn.gui03;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextareaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JTextArea jTextArea = new JTextArea("����������",7,20);
		jTextArea.setFont(new Font("����", Font.BOLD, 16));
		jTextArea.setBackground(Color.yellow);
		jTextArea.setLineWrap(true);//�����ı����Զ�����
		JScrollPane jScrollPane = new JScrollPane(jTextArea);//���ı�����ӽ���������
		Dimension preferredSize = jTextArea.getPreferredSize();//��ȡ�ı���Ĵ�С����
		jScrollPane.setBounds(110, 90, preferredSize.width, preferredSize.height);
		jPanel.add(jScrollPane);
		jFrame.add(jPanel);
		jFrame.setBounds(200, 200, 350, 250);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
		
	}

}
