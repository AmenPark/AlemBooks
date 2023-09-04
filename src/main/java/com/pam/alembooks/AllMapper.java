package com.pam.alembooks;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

public interface AllMapper {
	public abstract int addUser(User user);
	public abstract int regBook(Book book);
	public abstract int modifyBook(@Param("new_id")int new_id,@Param("title")String title , @Param("old_id")int old_id);
	public abstract ArrayList<BookHistory> getHistory(@Param("book_id")int book_id);
	public abstract int borrow(@Param("user_id")String user_id, @Param("book_id")int book_id);
	public abstract int book_return(@Param("book_id") int book_id);
}
