package com.offcn.gui03;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JcomboboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		
		JComboBox<Object> jComboBox = new JComboBox<>();
		//�������object ����Ķ������� 
		jComboBox.addItem("--��ѡ��֤������--");
		jComboBox.addItem("���֤");
		jComboBox.addItem("����֤");
		jComboBox.addItem("��ס֤");
		
		jPanel.add(jComboBox);
		jFrame.add(jPanel);
		jFrame.setSize(400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
	}

}
