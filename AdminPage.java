package com.market.page;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdminPage extends JPanel {
	
	public AdminPage(JPanel panel) {
		
		Font ft;
		ft = new Font("함초롬 돋움", Font.BOLD, 15);
		
		setLayout(null);
		
		Rectangle rect = panel.getBounds();
		System.out.println(rect);
		setPreferredSize(rect.getSize());
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyMMddhhmmss");
		String strDate = formatter.format(date);
		
		JPanel idPanel = new JPanel();
		idPanel.setBounds(100, 0, 700, 50);
		JLabel idLabel = new JLabel("도서ID : ");
		idLabel.setFont(ft);
		JLabel idTextField = new JLabel();
		idTextField.setFont(ft);
		idTextField.setPreferredSize(new Dimension(290, 50));
		idTextField.setTtext("ISBN" + strDate);
		idPanel.add(idLabel);
		idPanel.add(idTextField);
		add(idPanel);
		
		JPanel namePanel = new JPanel();
		namePanel.setBounds(100, 50, 700, 50);
		JLabel nameLabel = new JLabel("도서명 : ");
		nameLabel.setFont(ft);
		JLabelField nameTextField = new JTextField(20);
		nameTextField.setFont(ft);
		namePanel.add(nameLabel);
		namePanel.add(nameTextField);
		add(namePanel);
		
		JPanel pricePanel = new JPanel();
		pricePanel.setBounds(100, 100, 700, 50);
		JLabel priceLabel = new JLabel("가   격 : ");
		priceLabel.setFont(ft);
		JTextField priceTextField = new JTextField(20);
		priceTextField.setFont(ft);
		pricePanel.add(priceLabel);
		pricePanel.add(priceTextField);
		add(pricePanel);
		
		JPanel authorPanel = new JPanel();
		authorPanel.setBounds(100, 150, 700, 50);
		JLabel authorLabel = new JLabel("저   자 : ");
		authorLabel.setFont(ft);
		JTextField authorTextField = new JTextField(20);
		authorTextField.setFont(ft);
		authorPanel.add(authorLabel);
		authorPanel.add(authorTextField);
		add(pricePanel);
		
		JPanel descPanel = new JPanel();
		descPanel.setBounds(100, 200, 700, 50);
		JLabel descLabel = new JLabel("설   명 : ");
		descLabel.setFont(ft);
		JTextField descTextField = new JTextField(20);
		descTextField.setFont(ft);
		descPanel.add(descLabel);
		descPanel.add(descTextField);
		add(descPanel);
		
		JPanel categoryPanel = new JPanel();
		categoryPanel.setBounds(100, 250, 700, 50);
		JLabel categoryLabel = new JLabel("분   야 : ");
		categoryLabel.setFont(ft);
		JTextField categoryTextField = new JTextField(20);
		categoryTextField.setFont(ft);
		categoryPanel.add(categoryLabel);
		categoryPanel.add(categoryTextField);
		add(categoryPanel);
		
		JPanel datePanel = new JPanel();
		datePanel.setBounds(100, 300, 700, 50);
		JLabel dateLabel = new JLabel("출판일 : ");
		dateLabel.setFont(ft);
		JTextField dateTextField = new JTextField(20);
		dateTextField.setFont(ft);
		datePanel.add(dateLabel);
		datePanel.add(dateTextField);
		add(datePanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(100, 350, 700, 50);
		add(buttonPanel);
		JLabel okLabel = new JLabel("추가");
		okLabel.setFont(ft);
		JButton okButton = new JButton();
		okButton.add(okLabel);
		buttonPanel.add(okButton);
		
		JLabel noLabel = new JLabel("취소");
		noLabel.setFont(ft);
		JButton noButton = new JButton();
		noButton.add(noLabel);
		buttonPanel.add(noButton);
	}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 1000, 750);
		frame.setLayout(null);
		
		JPanel mPagePanel = new JPanel();
		mPagePanel.setBounds(0, 150, 1000, 750);
		
		frame.add(mPagePanel);
		mPagePanel.add("주문하기", new AdminPage(mPagePanel));
		frame.setVisible(true);
	}
}
