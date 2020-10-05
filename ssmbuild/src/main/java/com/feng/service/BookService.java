package com.feng.service;

import com.feng.pojo.Books;

import java.util.List;

public interface BookService {
	List<Books> findAll();
	int deleteBook(Integer id);
	int addBook(Books books);
	int updateBook(Books books);
	Books findById(Integer id);
	Books searchBook(String bookName);
}
