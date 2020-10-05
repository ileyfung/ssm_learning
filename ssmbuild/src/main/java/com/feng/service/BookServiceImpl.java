package com.feng.service;

import com.feng.dao.BookMapper;
import com.feng.pojo.Books;
import java.util.List;

public class BookServiceImpl implements BookService{

	private BookMapper bookMapper;

	//调用dao层的操作，设置一个set接口，方便Spring管理

	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	@Override
	public List<Books> findAll() {
		return bookMapper.findAll();
	}

	@Override
	public int deleteBook(Integer id) {
		return bookMapper.deleteBook(id);
	}

	@Override
	public int addBook(Books books) {
		return bookMapper.addBook(books);
	}

	@Override
	public int updateBook(Books books) {
		return bookMapper.updateBook(books);
	}

	@Override
	public Books findById(Integer id) {
		return bookMapper.findById(id);
	}

	@Override
	public Books searchBook(String bookName) {
		return bookMapper.searchBook(bookName);
	}
}
