package com.market.page;

import javax.swing.*;
import com.market.bookitem.Book;
import com.market.bookitem.BookInIt;
import com.market.cart.Cart;
import java.awt.*;
import java.util.ArrayList;

public class CartAddItemPage extends JPanel{

	ImageIcon imageBook;
	int mSelectRow = 0;
	
	Cart mCart;
	
	public CartAddItemPage(JPanel panel, Cart cart) {
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15);
		
		setLayout(null);
		
		Rectangle rect = panel.getBounds();
		System.out.println(rect);
		setPreferredSize(rect.getSize());
		
		mCart = cart;
		
		JPanel imagePanel = new JPanel();
		imagePanel.setBounds(20, 0, 300, 400);
		imageBook = new ImageIcon("./image/ISBN1234.jpg");
		imageBook.setImage(imageBook.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT));
		JLabel label = new JLabel(imageBook);
		imagePanel.add(label);
		add(imagePanel);
		
		JPanel tablePanel = new JPanel();
		tabelPanel.setBounds(300, 0, 700, 400);
		add(tablePanel);
		
		ArrayList<Book> booklist = BookInIt.getmBookList();
		Object[] tableHeader = {"도서ID", "도서명", "가격", "저자", "설명", "분야", "출판일"};
		Object[][] content = new Object[booklist.size()]
				[tableHeader.length];
		for (int i = 0; i < bookList.size(); i++) {
			Book bookitem = boklist.get(i);
			content[i][0] = bookitem.getBookId();
			content[i][1] = bookitem.getName();
			content[i][2] = bookitem.getUnitPrice();
			content[i][3] = bookitem.getAuthor();
			content[i][4] = bookitem.getDescription();
			content[i][5] = bookitem.getCategory();
			content[i][6] = bookitem.getReleaseDate();
		}
		
		JTable bookTable = new JTable(content, tableHeader);
		bookTable.setRowSelectionInterval(0, 0);
		bookTable.getSelectedColumn();
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setPreferredSize(new Dimension(600, 350));
		jScrollPane.setViewportView(bookTable);
		tablePanel.add(jScrollPane);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(0, 400, 1000, 400);
		add(buttonPanel);
		JLabel buttonLabel = new JLabel("장바구니에 담기");
		buttonLabel.setFont(ft);
		JButton addButton = new JButton();
		addButton.add(buttonLabel);
		buttonPanel.add(addButton);
	}
	
	public static void main(String[] args) {
		Cart mCart = new Cart();
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 1000, 750);
		frame.setLayout(null);
		
		JPanel mPagePanel = new JPanel();
		mPagePanel.setBounds(0, 150, 1000, 750);
		frame.add(mPagePanel);
		
		BookInIt.init();
		mPagePanel.add("장바구넹 항목 추가하기", new CartAddItemPage(mPagePanel, mCart));
		frame.setVisible(true);
	}
}
