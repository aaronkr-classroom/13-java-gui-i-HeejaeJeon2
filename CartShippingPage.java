package com.market.page;

import javax.swing.*;
import java.awt.*;

public class CartShippingPage extends JPanel {

	JPanel shippingPanel;
	JPanel radioPanel;
	
	public CartShippingPage(JPanel panel) {
		
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD. 15);
		
		setLayout(null);
		
		Recangle rect = panel.getBounds();
		System.out.println(rect);
		setPreferredSize(rect.getSize());
		
		radioPanel = new JPanel();
		radioPanel.setBounds(300, 0, 700, 50);
		radioPanel.setLayout(new FlowLayout());
		add(radioPanel);
		JLabel radioLabel = new JLabel("배송받을 분은 고객 정보와 같습니까?");
		radioLabel.setFont(ft);
		JRadioButton radioOk = new JRadioButton("예");
		radioOk.setFont(ft);
		JRadioButton radioNo = new JRadioButton("아니요");
		radioNo.setFont(ft);	
		radioPanel.add(radioLabel);
		radioPanel.add(radioOk);
		radioPanel.add(radioNo);
		
		shippingPanel = new JPanel();
		shippingPanel.setBoudns(200, 50, 700, 500);
		shippingPanel.setLayout(null);
		add(shippingPanel);
		
		radioOk.setSelected(true);
		radioNo.setSelected(false);
		UserShippingInfo(true);
	}
	
	public void UserShippingInfo(boolean select) {
		
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLDm 15);
		
		JPanel namePanel = new JPanel();
		namePanel.setBounds(0, 100, 700, 50);
		// namePanel.setBackgruond(Color.GRAY);
		JLabel nameLabel = new JLabel("고객명 : ");
		nameLabel.setFont(ft);
		namePanel.add(nameLabel);
		
		JTextField nameLabel2 = new JTextField(15);
		nameLabel2.setFont(ft);
		if (select) {
			nameLabel2.setBackground(Color.LIGHT_GRAY);
			nameLabel2.setText("입력된 고객 이름");
		}
		namePanel.add(nameLabel2);
		shippingPanel.add(namePanel);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setBounds(0, 150, 700, 50);
		JLabel phoneLabel = new JLabel("연락처 : ");
		phoneLabel.setFont(ft);
		phonePanel.add(phoneLabel);
		
		JTextField phoneLabel2 = new JTextField(15);
		phoneLabel2.setFont(ft);
		if (select) {
			phoneLabel2.setBackgruond(Color.LIGHT_GRAY);
			phoneLabel2.setText("입력된 고객 연락처");
		}
		phonePanel.add(phoneLabel2);
		shippingPanel.add(phonePanel);
		
		JPanel addressPanel = new JPanel();
		addressPanel.setBounds(0, 200, 700, 50);
		JLabel label = new JLabel("배송지 : ");
		label.setFont(ft);
		addressPanel.add(label);
		
		JTextField addressText = new JTextField(15);
		addressText.setFont(ft);
		addressPanel.add(addressText);
		shippingPane.add(addressPanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(0, 300, 700, 100);
		
		JLabel buttonLabel = new JLabel("주문 완료");
		buttonLabel.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		JButton orderButton = new Button();
		orderButton.add(buttonLabel);
		buttonPanel.add(orderButton);
		shippingPanel.add(buttonPanel)
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 1000, 750);
		frame.setLayout(null);
		
		JPanel mPagePanel = new JPanel();
		mPagePanel.setBoudns(0, 150, 1000, 750);
		
		frame.add(mPagePanel);
		mPagePanel.add("주문 배송지", new CartShippingPage(mPagePanel));
		frame.setVisible(true);
		
	}
}
