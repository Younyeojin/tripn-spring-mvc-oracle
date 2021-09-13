package shop.tripn.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.book.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired BookService bookService;
	@Autowired BookDto book;
	@RequestMapping(value="/book", method= {RequestMethod.POST})
	public String book(
			@RequestParam("bookId")int bookId,
			@RequestParam("bookTitle")String bookTitle,
			@RequestParam("price")int price,
			@RequestParam("pubId")int pubId) {
		System.out.println("bookId : " + bookId);
		System.out.println("bookTitle : " + bookTitle);
		System.out.println("price : " + price);
		System.out.println("pubId : " + pubId);
		book = new BookDto ();
		book.setBookId(bookId);
		book.setBookTitle(bookTitle);
		book.setPrice(price);
		book.setPubId(pubId);
		bookService.save(book);
		return "/book/book";
	}
	public void findAll() {
		List<BookDto> books = bookService.findAll();
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	@RequestMapping("/books/{bookId}")
	public void findById(@PathVariable int bookId) {
		BookDto book = bookService.findById(bookId);
		System.out.println(book.toString());
	}
	@RequestMapping("/books/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		List<BookDto> books = bookService.findByPubId(pubId);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	@RequestMapping("/books/{bookTitle}")
	public void findByBookTitle(@PathVariable String bookTitle) {
		List<BookDto> books = bookService.findByBookTitle(bookTitle);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	@RequestMapping("/books/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDto> books = bookService.findByPrice(price);
		for(BookDto book : books) {
		System.out.println(book.toString());
		}
	}
}