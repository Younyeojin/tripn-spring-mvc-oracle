package shop.tripn.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.book.service.BookService;

@Controller
public class BookController {
	@Autowired BookService bookService;
	@RequestMapping("/books")
	public void findAll() {
		List<BookDto> list = bookService.findAll();
		for(BookDto b : list) {
			System.out.println(b.toString());
		}
	}
	@RequestMapping("/books/{bookId}")
	public void findById(@PathVariable int bookId) {
		BookDto book = bookService.findById(bookId);
		System.out.println(book.toString());
	}
}
