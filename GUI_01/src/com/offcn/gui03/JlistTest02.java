package com.offcn.gui03;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class JlistTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		jPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		jPanel.setLayout(new BorderLayout(0,0));
		
		jFrame.add(jPanel);
		
		JScrollPane jScrollPane = new JScrollPane();

		jPanel.add(jScrollPane,BorderLayout.CENTER);
		
		JList<Object> jList = new JList<>();
		
		jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// �޶��б��ֻ��һ��ѡ��һ��
		
		jScrollPane.setViewportView(jList);
		
		String[] strs = new String[12];
			
		for (int i = 0; i < strs.length; i++) {
			
			strs[i] = "���ǵ�"+(i+1)+"��Ԫ��";
			
		}
		
		jList.setListData(strs);//���б�ֵ
		
		jFrame.setBounds(100, 100, 300, 200);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
	}

}
