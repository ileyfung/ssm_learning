package com.feng.controller;

import com.feng.pojo.Books;
import com.feng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    //调用service层
    @Autowired
    @Qualifier("bookServiceImpl")
    BookService bookService;

    @RequestMapping("/allBook")
    public String findAll(Model model) {
        List<Books> all = bookService.findAll();
        model.addAttribute("all",all);
        return "allBook";
    }

    //添加书籍页面跳转
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    //添加书籍 保存
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    //更新页面跳转
    @RequestMapping("/toUpdateBook")
    public String toUpdatePage(Model model,Integer id) {
        Books byId = bookService.findById(id);
        model.addAttribute("byId",byId);
        return "updateBook";
    }

    //更新书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/del")
    public String del(Integer id) {
        bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }

    //根据书名返回该书的所有信息
    @RequestMapping("/searchBook")
    public String searchBook(Model model,String bookName) {
        Books books = bookService.searchBook(bookName);
        ArrayList<Books> booksArrayList = new ArrayList<>();
        //如果没有 查到该书就查询 所有书
        if (books == null) {
            List<Books> all = bookService.findAll();
            model.addAttribute("all",all);
            model.addAttribute("error","未查到");
        }else {
            booksArrayList.add(books);
            model.addAttribute("all",booksArrayList);
        }
        return "allBook";
    }
}
