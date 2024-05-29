package com.market.page;

import javax.swing.*;
import com.market.bookitem.Book;
import com.market.bookitem.BookInIt;
import com.market.cart.Cart;
import java.awt.*;
import java.util.ArrayList;

public class CartItemListPage extends JPanel {

	JTable cartTable;
	Object[] tableHeader = {"도서ID", "도서명", "단가", "수량", "총가격"};
	
	Cart mCart = new Cart();
	public static int mSelectRow = -1;
	
	public CartItemListPage(JPanel panel, Cart cart) {
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15);
		this.mCart = cart;
		this.setLayout(null);
		
		Rectangle rect = panel.getBounds();
		System.out.println(rect);
		this.setPreferredSize(rect.getSize());
		
		JPanel bookPanel = new JPanel();
		bookPanel.setBounds(0, 0, 1000, 400);
		add(bookPanel);
		
		ArrayList<CartItem> cartItem = mCart.getmCartItem();
		Object[][] content = new Object[cartItem.size()]
				[tableHeader.length];
		Integer totalPrice = 0;
		for (int i = 0; i < cartItem.size(); i++) {
			CartItem item = cartItem.get(i);
			content[i][0] = item.getBookID();
			content[i][1] = item.getItemBook().getName;
			content[i][2] = item.getItemBook().getUnitPrice;
			content[i][3] = item.getQuantity();
			content[i][4] = item.getTotalPrice();
			totalPrice += item.getQuantity() * item.getItemBook().getUnitPrice();
		}
		
		cartTable = new JTable(content, tableHeader);
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setPreferredSize(new Dimension(600, 350));
		jScrollPane.setViewportView(cartTable);
		bookPanel.add(jScrollPane);
		
		JPanel totalPricePanel = new JPanel();
		totalPricePanel.setBounds(0, 400, 1000, 50);
		// totalPricePanel.setBackgroun(Color.RED);
		JLabel totalPricelabel = new JLabel("총금액: " + totalPrice + " 원");
		totalPricelabel.setForeground(Color.red);
		totalPricelabel.setFont(ft);
		totalPricePanel.add(totalPricelabel);
		add(totalPricePanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBounds(0, 450, 1000, 50);
		add(buttonPanel);
		
		JLabel buttonLabel = new JLabel("장바구니 비우기");
		buttonLabel.setFont(ft);
		JButton claerButton - new Jbutton();
		clearButton.add(buttonLabel);
		buttonPanel.add(clearButton);
		
		JLabel removeLabel = new JLabel("장바구니의 항목 삭제하기");
		removeLabel.setFont(ft);
		JButton removeButton = new JButton();
		removeButton.add(removeLabel);
		buttonPanel.add(removeButton);
		
		JLable refreshLabel = new JLabel("장바구니 새로 고침");
		refreshLabel.setFont(ft);
		JButton refreshButton = new JButton();
		refreshButton.add(refreshLabel);
		buttonPanel.add(refreshButton);
	}
	
	public static void main(String[] args) {
		
		Cart mCart = new Cart();
		JFrame frame = new JFrame();
		frame.setBoudns(0, 0, 1000, 750);
		frame.setLayout(null);
		
		JPanel mPagePanel = new JPanel();
		mPagePanel.setBounds(0, 150, 1000, 750);
		
		frame.add(mPagePanel);
		mPagePanel.add("장바구니 상품 목록 보기", new CartItemListPage(mPagePanel, mCart));
		frame.setVisible(ture);
	}
}
