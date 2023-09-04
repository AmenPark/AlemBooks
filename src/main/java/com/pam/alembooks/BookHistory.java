package com.pam.alembooks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookHistory {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	int borrow_id;
	String user_id;
	String user_name;
	int book_id;
	String title;
	String borrow_on;
	String is_return;
	public BookHistory(int borrow_id, String user_id, int book_id, Date borrow_on, Date is_return, String name, String title) {
		super();
		this.borrow_id = borrow_id;
		this.user_id = user_id;
		this.book_id = book_id;
		this.borrow_on = sdf.format(borrow_on);
		this.is_return = sdf.format(is_return);
		this.user_name=name;
		this.title=title;
	}
	public BookHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBorrow_id() {
		return borrow_id;
	}
	public void setBorrow_id(int borrow_id) {
		this.borrow_id = borrow_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBorrow_on() {
		return borrow_on;
	}
	public void setBorrow_on(Date borrow_on) {
		this.borrow_on = sdf.format(borrow_on);
	}
	public String getIs_return() {
		return is_return;
	}
	public void setIs_return(Date is_return) {
		this.is_return = sdf.format(is_return);
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
