package shop.tripn.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.book.domain.BookDto;

@Repository
public interface BookMapper {
	public List<BookDto> findAll();
	public BookDto findById(int bookId);
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookTitle(String bookTitle);
	public List<BookDto> findByPrice(int price);
	public void save(BookDto book);
}
