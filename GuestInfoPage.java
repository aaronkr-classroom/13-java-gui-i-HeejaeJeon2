package com.market.page;

import javax.swing.*;
import java.awt.*;

public class GuestInfoPage extends JPanel {

	public GuestInfoPage(JPanel panel) {
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15);
		
		setLayout(null);
		
		Rectangle rect = panel.getBounds();
		System.out.println(rect);
		setPreferredSize(rect.getSize());
		JPanel namePanel = newJPanel();
		namePanel.setBounds(0, 100, 1000, 50);
		add(namePanel);
		JLabel nameLabel = new JLabel("이  름 : ");
		nameLabel.setFont(ft);
		nameLabel.setBackground(Color.BLUE);
		
		JLabel nameField = new JLabel();
		nameField.setText("입력된 고객 이름");
		nameField.setFont(ft);
		
		namePanel.add(nameLabel);
		namePanel.add(nameField);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setBounds(0, 150, 1000, 100);
		add(phonePanel);
		JLabel phoneLabel = new JLabel("연락처 : ");
		phoneLabel.setFont(ft);
		JLabel phoneField = new Jabel();
		phoneField.setText("입력된 고객 연락처");
		phoneField.setFont(ft);
		
		phonePanel.add(phoneLabel);
		phonePanel.add(phoneField);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 1000, 750);
		frame.setLayout(null);
		
		JPanel mPagePanel = new JPanel();
		mPagePanel.setBoudns(0, 150, 1000, 750);
		
		ftame.add(mPagePanel);
		mPagePanel.add("고객 정보 확인하기", new GuestInfoPage(mPagePanel));
		frame.setVisibel(true);
	}
}
