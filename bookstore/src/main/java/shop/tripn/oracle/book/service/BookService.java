package shop.tripn.oracle.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.book.domain.BookDto;

@Component
public interface BookService {
	public List<BookDto> findAll();
	public BookDto findById(int bookId);
	
}
