package com.offcn.gui03;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame("�û�ע�����");
		jFrame.setLayout(new GridLayout(3, 1));
		
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		JPanel jPanel3 = new JPanel();
		
		JLabel jLabel1 = new JLabel("��ϲ�����˶�");
		JCheckBox jCheckBox1 = new JCheckBox("����");
		JCheckBox jCheckBox2 = new JCheckBox("����");
		JCheckBox jCheckBox3 = new JCheckBox("����");
		
		jPanel1.add(jLabel1);
		jPanel1.add(jCheckBox1);
		jPanel1.add(jCheckBox2);
		jPanel1.add(jCheckBox3);
		
		JLabel jLabel2 = new JLabel("����Ա�");
		JRadioButton jRadioButton1 = new JRadioButton("��");
		JRadioButton jRadioButton2 = new JRadioButton("Ů");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		
		jPanel2.add(jLabel2);
		jPanel2.add(jRadioButton1);
		jPanel2.add(jRadioButton2);
		
		JButton jButton1 = new JButton("ע���û�");
		JButton jButton2 = new JButton("ȡ���û�");
		
		jPanel3.add(jButton1);
		jPanel3.add(jButton2);
		
		jFrame.add(jPanel1);
		jFrame.add(jPanel2);
		jFrame.add(jPanel3);
		
		jFrame.setBounds(100, 100, 400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);

	}

}
