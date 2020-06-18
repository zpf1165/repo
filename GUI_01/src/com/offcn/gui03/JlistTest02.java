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
		
		jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// 限定列表框只能一次选中一个
		
		jScrollPane.setViewportView(jList);
		
		String[] strs = new String[12];
			
		for (int i = 0; i < strs.length; i++) {
			
			strs[i] = "这是第"+(i+1)+"个元素";
			
		}
		
		jList.setListData(strs);//给列表赋值
		
		jFrame.setBounds(100, 100, 300, 200);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
	}

}
