package com.feng.dao;

import com.feng.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
	List<Books> findAll();
	int deleteBook(@Param("bookID") Integer id);
	int addBook(Books books);
	int updateBook(Books books);
	Books findById(@Param("bookID") Integer id);
	Books searchBook(String bookName);
}
