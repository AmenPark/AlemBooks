package com.pam.alembooks;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	SqlSession ss;
//		System.out.println(ss.getMapper(AllMapper.class).addUser(new User("1","2","3")));

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public @ResponseBody String home(HttpServletRequest req) {
		return "Hello world!";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public @ResponseBody String join(HttpServletRequest req, User u) {
		if (ss.getMapper(AllMapper.class).addUser(u) == 1) {
			return "Successed";
		}
		return "Failed";
	}

	@RequestMapping(value = "/book", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public @ResponseBody String reg(HttpServletRequest req, Book book) {
		if (ss.getMapper(AllMapper.class).regBook(book) == 1) {
			return "Successed";
		}
		return "Failed";
	}

	@RequestMapping(value = "/book_modify", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public @ResponseBody String modify(HttpServletRequest req , Book book,
			@RequestParam(value="old_id") int old_id) {
		if (ss.getMapper(AllMapper.class).modifyBook(book.getBook_id(), book.getTitle(), old_id) == 1) {
			return "Successed";
		}
		return "Failed";
	}

	@RequestMapping(value = "/history", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public @ResponseBody ArrayList<BookHistory> getHistory(HttpServletRequest req,
			@RequestParam(value = "book_id") int book_id) {
		return ss.getMapper(AllMapper.class).getHistory(book_id);
	}

	@RequestMapping(value = "/borrow", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public @ResponseBody String borrow(HttpServletRequest req, @RequestParam(value = "book_id") int book_id,
			@RequestParam(value = "user_id") String user_id) {
		if (ss.getMapper(AllMapper.class).borrow(user_id,book_id)==1) {
			return "Successed";
		}
		return "Failed: not returned";
	}
	@RequestMapping(value = "/return", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public @ResponseBody String book_return(HttpServletRequest req, @RequestParam(value = "book_id") int book_id) {
		if (ss.getMapper(AllMapper.class).book_return(book_id)==1) {
			return "Successed";
		}
		return "Failed";
	}
}
