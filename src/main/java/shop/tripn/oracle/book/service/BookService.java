package shop.tripn.oracle.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.common.GenericInterface;

@Component
public interface BookService extends GenericInterface<BookDto, Integer> {
//	public List<BookDto> findAll();
//	public BookDto findById(int bookId);
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookTitle(String bookTitle);
	public List<BookDto> findByPrice(int price);
//	public void save(BookDto book);
//	
}
